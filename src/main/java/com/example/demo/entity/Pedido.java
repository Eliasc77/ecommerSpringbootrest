package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="pedido")
@Table(name="pedido")
public class Pedido {
	

	@Id
	@Column(name = "idpedido")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idpedido;
	
	@Column(name = "idcliente")
	private int idcliente;
	
	@Column(name = "totalpagar")
	private double totalpagar;
	
	@Column(name = "iddelivery")
	private int iddelivery;
	
	@Column(name = "idtipopago")
	private int idtipopago;

	public int getIdpedido() {
		return idpedido;
	}

	public void setIdpedido(int idpedido) {
		this.idpedido = idpedido;
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public double getTotalpagar() {
		return totalpagar;
	}

	public void setTotalpagar(double totalpagar) {
		this.totalpagar = totalpagar;
	}

	public int getIddelivery() {
		return iddelivery;
	}

	public void setIddelivery(int iddelivery) {
		this.iddelivery = iddelivery;
	}

	public int getIdtipopago() {
		return idtipopago;
	}

	public void setIdtipopago(int idtipopago) {
		this.idtipopago = idtipopago;
	}
	
	
}
