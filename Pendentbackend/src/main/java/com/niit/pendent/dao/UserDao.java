package com.niit.pendent.dao;

import java.util.List;

import com.niit.pendent.model.User;

public interface UserDao {
	public boolean saveorupdate(User user);
	public boolean delete(String user_id);
	public User get(String user_id);
	public List<User> list();
	public User getByEmail(String email);
	public User isvalidate(String email_id,String password);
}
