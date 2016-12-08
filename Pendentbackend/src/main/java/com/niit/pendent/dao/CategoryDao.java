package com.niit.pendent.dao;

import java.util.List;

import com.niit.pendent.model.Category;

public interface CategoryDao {
	  public boolean saveorupdate(Category category) ;
	  public boolean delete(String C_Id);
	  public Category get(String C_Id);
	  public List<Category> list();
	  public boolean update(Category category);

}
