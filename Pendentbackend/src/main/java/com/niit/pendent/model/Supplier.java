package com.niit.pendent.model;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Supplier {
	@Id
	private String s_id; 
	
	private String s_name;
	
	private String s_description;
	
	private String s_address;
	
	@OneToMany(mappedBy="supplier")
	List<Product> pro;
	
	
	public Supplier()
	{
		this.s_id = "supplier"+UUID.randomUUID().toString().substring(34).toUpperCase();
	}
	public List<Product> getPro() {
		return pro;
	}
	public void setPro(List<Product> pro) {
		this.pro = pro;
	}
	public String getS_id() {
		return s_id;
	}
	public void setS_id(String s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_description() {
		return s_description;
	}
	public void setS_description(String s_description) {
		this.s_description = s_description;
	}
	public String getS_address() {
		return s_address;
	}
	public void setS_address(String s_address) {
		this.s_address = s_address;
	}


}
