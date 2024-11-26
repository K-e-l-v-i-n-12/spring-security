package de.kelvin12.springsecurity.test;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RestController;

import de.kelvin12.springsecurity.security.CustomUserDetails;

@RestController
public class UserController implements UserApi {

	protected String getUser(CustomUserDetails userDetails) {
		if (userDetails == null) {
			return "User is not authenticated!";
		}
		return "Hello, " + userDetails.getUsername();
	}

	@Override
	public String getUserByInterface(CustomUserDetails userDetails) {
		return getUser(userDetails);
	}

	public String getUserByImplementation(@AuthenticationPrincipal CustomUserDetails userDetails) {
		return getUser(userDetails);
	}
}