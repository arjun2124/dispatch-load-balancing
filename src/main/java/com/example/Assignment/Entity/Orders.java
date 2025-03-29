package com.example.Assignment.Entity;

import com.example.Assignment.Enum.Priority;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String orderId;
	private Double latitude;
	private Double longitude;
	private String address;
	private Double packageWeight;
 
	@Enumerated(EnumType.STRING)
 	private Priority priority;

	
	   public Orders() {}

	    public Orders(String orderId, double latitude, double longitude, String address, double packageWeight ,
	    		Priority priority) {
	        this.orderId = orderId;
	        this.latitude = latitude;
	        this.longitude = longitude;
	        this.address = address;
	        this.packageWeight =packageWeight ;
	        this.priority = priority;
	    }

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
