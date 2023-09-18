package com.example.demo.mapper;

import org.springframework.stereotype.Component;

import com.example.demo.dtos.UserDto;
import com.example.demo.entities.Users;

@Component
public class UserMapper {

	public Users mapUserDtoToUser(UserDto userdto, Users user) {
		user.setFirstName(userdto.getFirstName());
		user.setLastName(userdto.getLastName());
		user.setEmail(userdto.getEmail());
		user.setPassword(userdto.getPassword());
		user.setCreatedBy(userdto.getPassword());
		return user;
	}

}
