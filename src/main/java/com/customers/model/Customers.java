package com.customers.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String orderDish;
	
	public Customers(Long id, String name, String email, String orderDish) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.orderDish = orderDish;
	}
	
	public Customers(String name, String email, String orderDish) {
		super();
		this.name = name;
		this.email = email;
		this.orderDish = orderDish;
	}

	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOrderDish() {
		return orderDish;
	}

	public void setOrderDish(String orderDish) {
		this.orderDish = orderDish;
	}

	@Override
	public String toString() {
		return "Customers [id=" + id + ", name=" + name + ", email=" + email + ", orderDish=" + orderDish + "]";
	}
	

	
}
