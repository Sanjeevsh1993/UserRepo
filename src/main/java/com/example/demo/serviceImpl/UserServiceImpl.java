package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dtos.UserDto;
import com.example.demo.entities.Users;
import com.example.demo.mapper.UsersMapper;
import com.example.demo.repos.UserRepository;
import com.example.demo.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	
	private final UserRepository userRepository;

	private final UsersMapper userMapper;
	
	public UserServiceImpl(UserRepository userRepository, UsersMapper userMapper) {
		this.userRepository = userRepository;
		this.userMapper=userMapper;
	}

	@Override
	public void saveUser(UserDto userdto) {
		Users user = userMapper.dtoToModel(userdto);
		userRepository.save(user);
		
	}

	@Override
	public void saveUsers(List<UserDto> usersdtos) {
		//userRepository.saveAll(users);
		
	}

}
