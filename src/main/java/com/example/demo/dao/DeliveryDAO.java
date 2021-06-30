package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Delivery;


public interface DeliveryDAO extends JpaRepository<Delivery, Integer> {

}
