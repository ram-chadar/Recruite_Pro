package com.jbk.dao;

import java.util.List;

import com.jbk.dto.LoginRequest;
import com.jbk.entities.User;

public interface UserDao {
	public int createUser(User user);
	
	public User getUserByUsername(String username);
	
	public int deleteUser(String username);

	public User loginUser(LoginRequest loginRequest);
	
	public List<User> getAllUser();
}
