package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Producto;

@Repository("producto")
public interface ProductoDAO extends JpaRepository<Producto, Integer>{

	/*
	 * @Query("select x from producto x where x.nombre like = var_param")
	 * List<Producto> listarnomre(@Param(":var_param")String nombre);
	 * 
	 * */
	
	@Query(value ="select * from producto x where x.idcategoria =?1", nativeQuery = true)
	public List<Producto> findbycategoria(int idcategoria);
	
	@Query(value ="select * from producto x where x.estado =?1", nativeQuery = true)
	public List<Producto> findbypopular(String estado);
	
	
	@Query(value="select * from producto x where x.nombreprod like %?1%", nativeQuery = true)
	public  List<Producto> listaxnombre (String nombreprod);
	
	@Query(value ="select * from producto x where x.idproducto =?1", nativeQuery = true)
	public List<Producto> findbyidprodu(int idproducto);
}
