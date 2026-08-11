package com.study.ecommerce.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String confirmPassword;
}
