package com.example.Assignment.DTO;

import jakarta.validation.constraints.NotNull;

public class VehicleDto {
	
	    @NotNull(message = "Vehicle ID cannot be null")
	    private String vehicleId;

	    @NotNull(message = "Capacity cannot be null")
	    private Double capacity;

	    @NotNull(message = "Current latitude cannot be null")
	    private Double currentLatitude;

	    @NotNull(message = "Current longitude cannot be null")
	    private Double currentLongitude;

	    @NotNull(message = "Current address cannot be null")
	    private String currentAddress;

		public String getVehicleId() {
			return vehicleId;
		}

		public void setVehicleId(String vehicleId) {
			this.vehicleId = vehicleId;
		}

		public Double getCapacity() {
			return capacity;
		}

		public void setCapacity(Double capacity) {
			this.capacity = capacity;
		}

		public Double getCurrentLatitude() {
			return currentLatitude;
		}

		public void setCurrentLatitude(Double currentLatitude) {
			this.currentLatitude = currentLatitude;
		}

		public Double getCurrentLongitude() {
			return currentLongitude;
		}

		public void setCurrentLongitude(Double currentLongitude) {
			this.currentLongitude = currentLongitude;
		}

		public String getCurrentAddress() {
			return currentAddress;
		}

		public void setCurrentAddress(String currentAddress) {
			this.currentAddress = currentAddress;
		}
	    
	 
	    
	    
	
    
    
}
