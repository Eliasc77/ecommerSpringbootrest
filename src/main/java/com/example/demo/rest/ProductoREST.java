package com.example.demo.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ProductoDAO;
import com.example.demo.entity.Producto;


@RestController
@RequestMapping("/producto")
public class ProductoREST {

	@Autowired
	private ProductoDAO pdao;
	
	@RequestMapping(value="{id}")  // products/{id} -> products/1
	public ResponseEntity<List<Producto>> getProductById(@PathVariable("id") int id){
		List<Producto> pp = pdao.findbyidprodu(id);
		return ResponseEntity.ok(pp);
	}
	
	

	@RequestMapping(value = "categoria/{categoria}")
	public ResponseEntity<List<Producto>> getProductoCategoria(@PathVariable("categoria") int categoria) {
		List<Producto> pcat = pdao.findbycategoria(categoria);
		return ResponseEntity.ok(pcat);
	}
	
	@RequestMapping(value="status/{estado}")
	public ResponseEntity<List<Producto>> getProductoPopular(@PathVariable("estado") String estado) {

		List<Producto> ppop = pdao.findbypopular(estado);
		return ResponseEntity.ok(ppop);
	}
	
	@RequestMapping(value="name/{param}")
	public ResponseEntity<List<Producto>> getProductoNombre(@PathVariable("param") String param) {
		List<Producto> pnam = pdao.listaxnombre(param);
		return ResponseEntity.ok(pnam);
	}
	
}
