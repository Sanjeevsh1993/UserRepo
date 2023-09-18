package com.example.demo.services;

import java.util.List;

import com.example.demo.dtos.UserDto;



public interface UserService {
	
	void saveUser(UserDto user);
	
	void saveUsers(List<UserDto> user);

}
