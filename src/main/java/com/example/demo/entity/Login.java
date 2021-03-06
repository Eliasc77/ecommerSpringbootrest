package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="login")
@Table(name="login")
public class Login {

	@Id
	@Column(name = "idlogin")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idlogin;
	
	@Column(name = "email")
	private String email;
	
	@Column(name="password")
	private String password;

	public int getId() {
		return idlogin;
	}

	public void setId(int idlogin) {
		this.idlogin = idlogin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
