package com.niit.pendent.dao;

import java.util.List;

import com.niit.pendent.model.Supplier;

public interface SupplierDao {
	public boolean saveorupdate(Supplier supplier);
	  public boolean delete(String id);
	  public Supplier get(String s_id);
	  public List<Supplier> list();
	  public boolean update(Supplier supplier);

}
