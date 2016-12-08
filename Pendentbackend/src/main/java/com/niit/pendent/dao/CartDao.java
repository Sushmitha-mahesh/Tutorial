package com.niit.pendent.dao;

import java.util.List;

import com.niit.pendent.model.Cart;



public interface CartDao {
	public boolean saveorupdate(Cart cart);
	public boolean delete(String cart_id);
	public Cart get(String customer_id);
	public List<Cart> list();


}
