package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.dao.DetalleDAO;
import com.example.demo.entity.Detalle;

@RestController
@RequestMapping("/detalle")
public class DetalleREST {
	
	@Autowired
	private DetalleDAO ddao;
	
	
	@PostMapping("/save")
	public ResponseEntity<Detalle> createDelivery( Detalle d){
		Detalle det= ddao.save(d);
		return ResponseEntity.ok(det);		
	}

}
