package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.LoginDAO;
import com.example.demo.entity.Login;


@RestController
@RequestMapping("/login")
public class LoginREST {
	
	@Autowired
	private LoginDAO ldao;
	
	@RequestMapping(value="{email}")
	public ResponseEntity<List<String>> getLoginusupas(@PathVariable("email") String email){
		List<String> log = ldao.findbyemail(email);
		return ResponseEntity.ok(log);	
	}
	
	@PostMapping("/save")
	public ResponseEntity<Login> createLogin( Login l){
		Login log= ldao.save(l);
		return ResponseEntity.ok(log);		
	}
	
	@PutMapping("update/{id}")
	public ResponseEntity<Login> updateLogin(Login l){
		Login log = ldao.save(l);
		return ResponseEntity.ok(log);
	}

}
