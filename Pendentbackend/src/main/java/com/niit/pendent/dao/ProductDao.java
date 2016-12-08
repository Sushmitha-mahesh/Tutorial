package com.niit.pendent.dao;

import java.util.List;

import com.niit.pendent.model.Product;

public interface ProductDao {
	public boolean saveorupdate(Product product);
	  public boolean delete(String id);
	  public Product get(String p_id);
	  public List<Product> list();
	  public List<Product> getbycat(String C_Id);
	  public boolean update(Product product);

}
