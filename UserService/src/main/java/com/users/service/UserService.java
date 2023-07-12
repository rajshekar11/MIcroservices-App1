package com.users.service;

import java.util.List;

import com.users.entities.User;

public interface UserService {

	public User createUser(User user);
	
	public User getUser(String userId);
	
	public List<User> getUsers();
}
