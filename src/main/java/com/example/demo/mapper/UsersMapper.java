package com.example.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.demo.dtos.UserDto;
import com.example.demo.entities.Users;

@Mapper(componentModel = "spring")
public interface UsersMapper {

	UsersMapper INSTANCE = Mappers.getMapper(UsersMapper.class);
	
	Users dtoToModel(UserDto userDto);

	UserDto modelToDto(Users user);



}
