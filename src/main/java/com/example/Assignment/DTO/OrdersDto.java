package com.example.Assignment.DTO;


import com.example.Assignment.Entity.Orders;
import com.example.Assignment.Enum.Priority;

import jakarta.validation.constraints.NotNull;



public class OrdersDto {
	
	    @NotNull(message = "Order ID cannot be null")
	    private String orderId;
	
	    @NotNull(message = "Latitude cannot be null")
	    private Double latitude;

	    @NotNull(message = "Longitude cannot be null")
	    private Double longitude;

	    @NotNull(message = "Address cannot be null")
	    private String address;

	    @NotNull(message = "Package weight cannot be null")
	    private Double packageWeight;

	    @NotNull(message = "Priority cannot be null")
	    private Priority priority;

		public String getOrderId() {
			return orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public Double getLatitude() {
			return latitude;
		}

		public void setLatitude(Double latitude) {
			this.latitude = latitude;
		}

		public Double getLongitude() {
			return longitude;
		}

		public void setLongitude(Double longitude) {
			this.longitude = longitude;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public Double getPackageWeight() {
			return packageWeight;
		}

		public void setPackageWeight(Double packageWeight) {
			this.packageWeight = packageWeight;
		}

		public Priority getPriority() {
			return priority;
		}

		public void setPriority(Priority priority) {
			this.priority = priority;
		}

    
    
	    
	
    
    
}
