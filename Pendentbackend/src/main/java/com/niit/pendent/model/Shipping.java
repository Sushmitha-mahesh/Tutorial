package com.niit.pendent.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Entity
@Table
@Component
public class Shipping {
	@Id
	private String s_id;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	private String s_address;
	
	public Shipping() 
	{
		this.s_id = "customer"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
	public String getS_id() {
		return s_id;
	}
	public void setS_id(String s_id) {
		this.s_id = s_id;
	}
	public String getS_address() {
		return s_address;
	}
	public void setS_address(String s_address) {
		this.s_address = s_address;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
