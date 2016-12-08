package com.niit.pendent.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class User {
	@Id
	private String user_id;

	private String user_fname;

	private String user_lname;
	
	@NotEmpty(message="Email cannot be null")
    private String email;
     
	@NotNull
	@Size(min = 2, max = 14)
    private String password;

	private int Mobile_number;

	private String role_name = "ROLE_USER";

	public User() {
		this.user_id = "user" + UUID.randomUUID().toString().substring(30).toUpperCase();
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getUser_fname() {
		return user_fname;
	}

	public void setUser_fname(String user_fname) {
		this.user_fname = user_fname;
	}

	public String getUser_lname() {
		return user_lname;
	}

	public void setUser_lname(String user_lname) {
		this.user_lname = user_lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMobile_number() {
		return Mobile_number;
	}

	public void setMobile_number(int i) {
		Mobile_number = i;
	}

}
