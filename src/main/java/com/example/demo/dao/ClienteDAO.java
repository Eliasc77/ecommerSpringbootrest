package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Integer> {

}
