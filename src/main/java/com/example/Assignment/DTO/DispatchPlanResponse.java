package com.example.Assignment.DTO;

import java.util.List;

import com.example.Assignment.Entity.Orders;

public class DispatchPlanResponse {
	private String vehicleId;
    private double totalLoad;
    private String totalDistance;
    private List<Orders> assignedOrders;

    public DispatchPlanResponse(String vehicleId, double totalLoad, String totalDistance, List<Orders> assignedOrders) {
        this.vehicleId = vehicleId;
        this.totalLoad = totalLoad;
        this.totalDistance = totalDistance;
        this.assignedOrders = assignedOrders;
    }

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public double getTotalLoad() {
		return totalLoad;
	}

	public void setTotalLoad(double totalLoad) {
		this.totalLoad = totalLoad;
	}

	public String getTotalDistance() {
		return totalDistance;
	}

	public void setTotalDistance(String totalDistance) {
		this.totalDistance = totalDistance;
	}

	public List<Orders> getAssignedOrders() {
		return assignedOrders;
	}

	public void setAssignedOrders(List<Orders> assignedOrders) {
		this.assignedOrders = assignedOrders;
	}
    
    
}
