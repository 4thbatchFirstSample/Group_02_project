package com.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.repositories.UserResporitory;
import com.spring.boot.services.UserService;
import com.spring.boot.entities.User;

import java.util.List;

@RestController
public class UserControl {
	@Autowired
	private UserService userservice;
	
	@GetMapping(value = "/User")
	public List<User> getUser() {
		return  userservice.getUser();
	}
	  
	@PostMapping(value = "/user")
	public String addUser(@RequestBody User user) {
		 userservice.addUser(user);
		return "succes";
	}
	
	
	
	
	
	
	

}
