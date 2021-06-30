package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.DeliveryDAO;
import com.example.demo.entity.Delivery;


@RestController
@RequestMapping("/delivery")
public class DeliveryREST {
	
	@Autowired
	private DeliveryDAO ddao;
	
	
	@PostMapping("/save")
	public ResponseEntity<Delivery> createDelivery( Delivery d){
		Delivery del= ddao.save(d);
		return ResponseEntity.ok(del);		
	}

}
