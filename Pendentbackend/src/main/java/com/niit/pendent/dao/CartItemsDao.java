package com.niit.pendent.dao;

import java.util.List;

import com.niit.pendent.model.CartItems;


public interface CartItemsDao {
	public boolean saveorupdate(CartItems cartitems);
	public boolean delete(String cartitems_id);
	public CartItems get(String cartitems_id);
	public List<CartItems> list();


}
