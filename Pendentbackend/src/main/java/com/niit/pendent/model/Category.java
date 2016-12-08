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
public class Category {
	@Id
	private String C_Id; 
	private  String C_NAME; 
	private String C_DESCRIPTION;
	@OneToMany(mappedBy="category")
	List<Product> pro;
	
	
	public Category() 
	{
		this.C_Id = "category"+UUID.randomUUID().toString().substring(30).toUpperCase();
	}
	
	public String getC_Id() {
		return C_Id;
	}
	public void setC_Id(String c_Id) {
		C_Id = c_Id;
	}
	public String getC_NAME() {
		return C_NAME;
	}
	public  void setC_NAME(String c_NAME) {
		C_NAME = c_NAME;
	}
	public String getC_DESCRIPTION() {
		return C_DESCRIPTION;
	}
	public void setC_DESCRIPTION(String c_DESCRIPTION) {
		C_DESCRIPTION = c_DESCRIPTION;
	}
	public List<Product> getPro() {
		return pro;
	}
	public void setPro(List<Product> pro) {
		this.pro = pro;
	}
	
}
