package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "delivery")
@Table(name="delivery")
public class Delivery {
	
	@Id
	@Column(name="iddelivery")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iddelivery;
	
	@Column(name="distrito")
	private String distrito;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="referencia")
	private String referencia;

	public int getIddelivery() {
		return iddelivery;
	}

	public void setIddelivery(int iddelivery) {
		this.iddelivery = iddelivery;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	
	

}
