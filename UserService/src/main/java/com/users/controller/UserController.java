package com.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.users.entities.User;
import com.users.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService uservice;
	
	@PostMapping()
	public ResponseEntity<User> createUser(@RequestBody User user){
		User savedUser=uservice.createUser(user);
		return new ResponseEntity<>(savedUser,HttpStatus.CREATED);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<User> getUserById(@PathVariable String userId){
		User savedUser=uservice.getUser(userId);
		return new ResponseEntity<User>(savedUser,HttpStatus.OK);
	}
	
	
	@GetMapping()
	public ResponseEntity<List<User>> getUser(){
		List<User> savedUsers=uservice.getUsers();
		return new ResponseEntity<>(savedUsers,HttpStatus.OK);
	}
	
}
