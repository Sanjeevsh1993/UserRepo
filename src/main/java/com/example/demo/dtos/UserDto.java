package com.example.demo.dtos;

import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class UserDto extends AuditDto {

	@Size(min = 3, max = 20)
	private String firstName;

	@Size(min = 3, max = 20)
	private String lastName;

	@Pattern(regexp = ".+@.+\\.[a-z]+", message = "Not valid Email Id")
	private String email;

	private String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
