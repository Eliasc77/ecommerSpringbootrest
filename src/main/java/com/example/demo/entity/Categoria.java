package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name= "categorias")
@Table(name="categorias")
public class Categoria {
	
	@Id
	@Column(name="idcategoria")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcategoria;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="img")
	private String img;

	public int getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
	

}
