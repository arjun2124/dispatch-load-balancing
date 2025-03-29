package com.example.Assignment.formula;

import com.example.Assignment.Entity.Orders;
import com.example.Assignment.Entity.Vehicle;

public class Haversineformula {
	
private static final double EARTH_RADIUS = 6371;
    
    public static double calculateDistance(Vehicle vehicle, Orders order) {
        double latDiff = Math.toRadians(order.getLatitude() - vehicle.getCurrentLatitude());
        double lonDiff = Math.toRadians(order.getLongitude() - vehicle.getCurrentLongitude());
        double a = Math.sin(latDiff / 2) * Math.sin(latDiff / 2) +
                Math.cos(Math.toRadians(vehicle.getCurrentLatitude())) *
                Math.cos(Math.toRadians(order.getLatitude())) *
                Math.sin(lonDiff / 2) * Math.sin(lonDiff / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return EARTH_RADIUS * c;
    }

	
}
