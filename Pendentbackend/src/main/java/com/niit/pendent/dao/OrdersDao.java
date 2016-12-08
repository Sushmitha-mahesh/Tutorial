package com.niit.pendent.dao;

import java.util.List;

import com.niit.pendent.model.Orders;


public interface OrdersDao {
	public boolean saveorupdate(Orders orders);
	public boolean delete(String user_id);
	public Orders get(String user_id);
	public List<Orders> list();


}
