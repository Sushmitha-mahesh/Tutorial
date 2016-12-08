package com.niit.pendent.dao;

import java.util.List;


import com.niit.pendent.model.Shipping;

public interface ShippingDao {
	public boolean saveorupdate(Shipping Shipping);
	public boolean delete(String s_id);
	public Shipping get(String s_id);
	public List<Shipping> list();

}
