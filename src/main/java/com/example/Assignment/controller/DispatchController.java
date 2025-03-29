package com.example.Assignment.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Assignment.DTO.DispatchPlanResponse;
import com.example.Assignment.DTO.OrdersDto;
import com.example.Assignment.DTO.VehicleDto;
import com.example.Assignment.Entity.Orders;
import com.example.Assignment.Entity.Vehicle;
import com.example.Assignment.service.DispatchService;


@RestController
@RequestMapping("/api/dispatch")
public class DispatchController {
	
	@Autowired
	private DispatchService dispatchService;
	
	@PostMapping("/orders")
    public ResponseEntity<String> addOrders(@RequestBody List<OrdersDto> orders) {
        dispatchService.addOrders(orders);
        return ResponseEntity.ok("Delivery orders added successfully.");
    }
    
    @PostMapping("/vehicles")
    public ResponseEntity<String> addVehicles(@RequestBody List<VehicleDto> vehicles) {
        dispatchService.addVehicles(vehicles);
        return ResponseEntity.ok("Vehicle details added successfully.");
    }
    
    @GetMapping("/plan")
    public ResponseEntity<List<DispatchPlanResponse>> getDispatchPlan() {
        List<DispatchPlanResponse> dispatchPlan = dispatchService.generateDispatchPlan();
        return ResponseEntity.ok(dispatchPlan);
    }
}
