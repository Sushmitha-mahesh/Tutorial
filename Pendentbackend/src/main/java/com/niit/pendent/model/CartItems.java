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
public class CartItems {
	@Id
	private String cartitems_id;

	private double totalprice;

	private int quantity;

	private String p_id;

	private String customer_id;

	@ManyToOne
	@JoinColumn(name = "cart_id")
	private Cart cart;

	public CartItems() {
		this.cartitems_id = "cartitems" + UUID.randomUUID().toString().substring(30).toUpperCase();
	}

	public String getCartitems_id() {
		return cartitems_id;
	}

	public void setCartitems_id(String cartitems_id) {
		this.cartitems_id = cartitems_id;
	}

	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getP_id() {
		return p_id;
	}

	public void setP_id(String p_id) {
		this.p_id = p_id;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

}
