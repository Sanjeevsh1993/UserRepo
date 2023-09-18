package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.UserDto;
import com.example.demo.services.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "api/user")
public class UserController {

	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	
	private final UserService userService;
	

	public UserController(UserService userService) {
		this.userService = userService;
	}


	@PostMapping(value = "/save", produces = "application/json", consumes = "application/json")
	public UserDto SaveUser(@Valid @RequestBody UserDto userDto, HttpServletRequest httpRequest,
			@RequestHeader(value = "api-verson", required = true) Integer apiVersion,
			@RequestHeader(value = "entity-user", required = true) String entityuser) {
		log.info("Method Starting SaveUser");
//		final String schema = httpRequest.getScheme();
//		final String domainName = httpRequest.getServerName();
//		final String requestUrl = httpRequest.getRequestURL().toString();
//		final String requestUri = httpRequest.getRequestURI().toString();
		userService.saveUser(userDto);
		log.info("Method Ending SaveUser");
		return userDto;

	}

}
