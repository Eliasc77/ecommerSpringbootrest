package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CategoriaDAO;
import com.example.demo.entity.Categoria;



@RestController
@RequestMapping("/categorias")
public class CategoriaREST {
	
	@Autowired
	private CategoriaDAO cdao;
	
	@RequestMapping("show")
	public ResponseEntity<List<Categoria>> getCategoria(){		
		List<Categoria> cats=cdao.findAll();		
		return ResponseEntity.ok(cats);
	}
	

}
