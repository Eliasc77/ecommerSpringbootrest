package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Pedido;

public interface PedidoDAO extends JpaRepository<Pedido, Integer>{

}
