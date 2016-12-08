package com.niit.pendent.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Customer {
	@Id
	private String customer_id;
	private String customer_name;
	private String customer_email;
	private String  user_id;
	
	@OneToOne
	@JoinColumn(name="cart_id")
	private Cart cart;
	
	private int customerphone;
	
	@OneToOne
	@JoinColumn(name="b_id")
	private Billing billing;
	
	@OneToMany(mappedBy="customer", cascade=CascadeType.ALL)
	private List<Shipping> s_id;
	
	
	public Customer() 
	{
		this.customer_id = "customer"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
	
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_email() {
		return customer_email;
	}
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	public int getCustomerphone() {
		return customerphone;
	}
	public void setCustomerphone(int customerphone) {
		this.customerphone = customerphone;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Billing getBilling() {
		return billing;
	}

	public void setBilling(Billing billing) {
		this.billing = billing;
	}

	public List<Shipping> getS_id() {
		return s_id;
	}

	public void setS_id(List<Shipping> s_id) {
		this.s_id = s_id;
	}

	
}
