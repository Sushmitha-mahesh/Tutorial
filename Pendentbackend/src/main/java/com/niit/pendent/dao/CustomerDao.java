package com.niit.pendent.dao;

import java.util.List;

import com.niit.pendent.model.Customer;



public interface CustomerDao {
	public boolean save(Customer customer);
	public boolean delete(String customer_id);
	public Customer get(String user_id);
	public List<Customer> list();
	public boolean update(Customer customer);

}
