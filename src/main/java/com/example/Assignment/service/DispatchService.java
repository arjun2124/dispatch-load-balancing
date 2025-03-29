package com.example.Assignment.service;

import java.util.List;
import java.util.Map;

import com.example.Assignment.DTO.DispatchPlanResponse;
import com.example.Assignment.DTO.OrdersDto;
import com.example.Assignment.DTO.VehicleDto;
import com.example.Assignment.Entity.Orders;
import com.example.Assignment.Entity.Vehicle;

public interface DispatchService {
	
	public void addOrders(List<OrdersDto> orderDtos);
	 
	public void addVehicles(List<VehicleDto> vehicleDtos);
	 
	public List<DispatchPlanResponse> generateDispatchPlan();
	 
	 
	 
}
