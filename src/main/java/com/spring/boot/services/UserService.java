package com.spring.boot.services;


import java.util.List;

import com.spring.boot.entities.User;

public interface UserService {

public void addUser(User user) ;
public List<User> getUser();
public void deleteuser(Long id);
public void alteruser(User user);



 
	

}
