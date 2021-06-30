package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="detalle")
@Table(name="detalle")
public class Detalle {

	@Id
	@Column(name = "idetalle")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idetalle;
	
	@Column(name = "idpedido")
	private int idpedido;
	
	@Column(name = "idproducto")
	private int idproducto;
	
	@Column(name = "talla")
	private String talla;
	
	@Column(name = "cantidad")
	private int cantidad;
	
	@Column(name = "precio")
	private double precio;

	public int getIdetalle() {
		return idetalle;
	}

	public void setIdetalle(int idetalle) {
		this.idetalle = idetalle;
	}

	public int getIdpedido() {
		return idpedido;
	}

	public void setIdpedido(int idpedido) {
		this.idpedido = idpedido;
	}

	public int getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
