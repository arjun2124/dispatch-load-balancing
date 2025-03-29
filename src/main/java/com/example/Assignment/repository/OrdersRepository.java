package com.example.Assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Assignment.Entity.Orders;

public interface OrdersRepository extends JpaRepository<Orders,String>{

}
