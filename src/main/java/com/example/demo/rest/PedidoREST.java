package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.dao.PedidoDAO;

import com.example.demo.entity.Pedido;

@RestController
@RequestMapping("/pedido")
public class PedidoREST {
	
	@Autowired
	private PedidoDAO pdao;

	@PostMapping("/save")
	public ResponseEntity<Pedido> createPedido( Pedido p){
		Pedido ped= pdao.save(p);
		return ResponseEntity.ok(ped);		
	}
}
