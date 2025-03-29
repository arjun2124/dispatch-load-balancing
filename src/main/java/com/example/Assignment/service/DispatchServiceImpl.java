package com.example.Assignment.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Assignment.DTO.DispatchPlanResponse;
import com.example.Assignment.DTO.OrdersDto;
import com.example.Assignment.DTO.VehicleDto;
import com.example.Assignment.Entity.Orders;
import com.example.Assignment.Entity.Vehicle;
import com.example.Assignment.formula.Haversineformula;
import com.example.Assignment.repository.OrdersRepository;
import com.example.Assignment.repository.VehicleRepository;

@Service
public class DispatchServiceImpl implements DispatchService {

		@Autowired
		private OrdersRepository orderRepository;
		
		@Autowired
	    private VehicleRepository vehicleRepository;
	
	@Override
	public void addOrders(List<OrdersDto> orderDtos) {
		// TODO Auto-generated method stub
	    if (orderDtos == null || orderDtos.isEmpty()) {
	        throw new IllegalArgumentException("Order list is empty or null");
	    }
	    List<Orders> orders = orderDtos.stream()
	            .map(dto -> new Orders(dto.getOrderId(), dto.getLatitude(), dto.getLongitude(), 
	                                   dto.getAddress(), dto.getPackageWeight(), dto.getPriority()))
	            .collect(Collectors.toList());

	    try {
	        orderRepository.saveAll(orders);
	    } catch (Exception e) {
	        throw new RuntimeException("Failed to save orders: " + e.getMessage(), e);
	    }
	   
	}

	@Override
	public void addVehicles(List<VehicleDto> vehicleDtos) {
		// TODO Auto-generated method stub
		if (vehicleDtos == null || vehicleDtos.isEmpty()) {
            throw new IllegalArgumentException("Vehicle list is empty or null");
        }
        List<Vehicle> vehicles = vehicleDtos.stream()
                .map(dto -> new Vehicle(dto.getVehicleId(), dto.getCapacity(), 
                        dto.getCurrentLatitude(), dto.getCurrentLongitude(), dto.getCurrentAddress()))
                .collect(Collectors.toList());
        try {
            vehicleRepository.saveAll(vehicles);
        } catch (Exception e) {
            throw new RuntimeException("Failed to save vehicles: " + e.getMessage(), e);
        }
	}

	@Override
	public List<DispatchPlanResponse> generateDispatchPlan() {
		// TODO Auto-generated method stub
		    List<Orders> orders = orderRepository.findAll();
		    List<Vehicle> vehicles = vehicleRepository.findAll();

		    if (orders == null) {
		        orders = new ArrayList<>();
		    }
		    if (vehicles == null) {
		        vehicles = new ArrayList<>();
		    }

		    orders.sort(Comparator.comparing(Orders::getPriority, Comparator.nullsLast(Comparator.naturalOrder())));

		    List<DispatchPlanResponse> dispatchPlan = new ArrayList<>();

		    for (Vehicle vehicle : vehicles) {
		        double availableCapacity = vehicle.getCapacity();
		        double totalDistance = 0;
		        List<Orders> assignedOrders = new ArrayList<>();

		        for (Orders order : orders) {
		            double distance = Haversineformula.calculateDistance(vehicle, order);

		            if (availableCapacity >= order.getPackageWeight()) {
		                assignedOrders.add(order);
		                availableCapacity -= order.getPackageWeight();
		                totalDistance += distance;
		            }
		        }

		        dispatchPlan.add(new DispatchPlanResponse(
		            vehicle.getVehicleId(),
		            vehicle.getCapacity() - availableCapacity, // totalLoad
		            String.format("%.1f km", totalDistance), // format distance
		            assignedOrders
		        ));
		    }

		    return dispatchPlan;
		}


}
