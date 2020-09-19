 package com.spring.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.boot.repositories.UserResporitory;
import com.spring.boot.entities.User;

@Service

public class Userimplimentation implements UserService {
	
	@Autowired
	private UserResporitory userrespo;

	@Override
	public void addUser(User user) {
		userrespo.save(user);
	}

	@Override
	public List<User> getUser() {
		return userrespo.findAll();
	}

	@Override
	public void deleteuser(Long id) {
		userrespo.deleteById(id);
	}

	@Override
	public void alteruser(User user) {
		userrespo.save(user);
		
		
		
	}

	


	

}
