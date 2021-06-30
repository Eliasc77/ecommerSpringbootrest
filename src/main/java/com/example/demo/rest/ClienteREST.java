package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ClienteDAO;
import com.example.demo.entity.Cliente;



@RestController
@RequestMapping("/cliente")
public class ClienteREST {
	
	@Autowired
	private ClienteDAO cdao;
	
	@PostMapping("/save")
	public ResponseEntity<Cliente> createDelivery( Cliente d){
		Cliente ce= cdao.save(d);
		return ResponseEntity.ok(ce);		
	}

}
