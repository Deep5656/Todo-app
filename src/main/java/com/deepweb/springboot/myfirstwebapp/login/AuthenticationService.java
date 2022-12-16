package com.deepweb.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

//@Service annotation is used with classes that provide some business functionalities.
@Service
public class AuthenticationService {

	public boolean authenticate(String username, String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("deepweb");
		boolean isValidPassword = password.equalsIgnoreCase("dummy");

		return isValidUserName && isValidPassword;
	}
}
