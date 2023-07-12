package com.users.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.entities.User;
import com.users.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository urep;

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		String userid=UUID.randomUUID().toString();
		user.setUserId(userid);
		return urep.save(user);
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		Optional<User> opt=urep.findById(userId);
		
		return opt.get();
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return urep.findAll();
	}

	
}
