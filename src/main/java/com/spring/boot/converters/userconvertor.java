package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.dto.UserDto;
import com.spring.boot.entities.User;
@Service

public class userconvertor {
	public static User UserDtotoUser(UserDto userDto ) {
		User user=new User();
		if (userDto != null) {
		user.setId(userDto.getId());
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setRole(userDto.getRole());
		return user;	
		
		}	
		return null;
		}
	
	public static List<UserDto>usertoUserDtos(List<User> userlist){
		List<UserDto> listUserDto = new ArrayList<>();
		for(User user : userlist) {
		user.setId(user.getId());
		user.setName(user.getName());
		user.setEmail(user.getEmail());			
		user.setRole(user.getRole());
		listUserDto.add(UserDto);
		}
		return listUserDto;
		
			
	    return null;

	}
}

