package com.example.Assignment.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehicle")
public class Vehicle {
		@Id
	  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private String vehicleId;

	    private Double capacity;
	    private Double currentLatitude;
	    private Double currentLongitude;
	    private String currentAddress;
		
		
		public Vehicle() {}
		public Vehicle(String vehicleId, double capacity, double currentLatitude, double currentLongitude,
				String currentAddress) {
	
			this.vehicleId = vehicleId;
			this.capacity = capacity;
			this.currentLatitude = currentLatitude;
			this.currentLongitude = currentLongitude;
			this.currentAddress = currentAddress;
		}
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
