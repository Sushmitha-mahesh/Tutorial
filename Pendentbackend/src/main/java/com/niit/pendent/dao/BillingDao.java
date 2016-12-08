package com.niit.pendent.dao;

import java.util.List;

import com.niit.pendent.model.Billing;



public interface BillingDao {
	public boolean saveorupdate(Billing billing);
	public boolean delete(String b_id);
	public Billing get(String b_id);
	public List<Billing> list();
}
