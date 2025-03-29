package com.example.Assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Assignment.Entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle,String> {

}
