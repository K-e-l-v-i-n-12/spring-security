package de.kelvin12.springsecurity.test;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import de.kelvin12.springsecurity.security.CustomUserDetails;

@RequestMapping
public interface UserApi {

	@GetMapping("/userByInterface")
	public String getUserByInterface(@AuthenticationPrincipal CustomUserDetails userDetails);

	@GetMapping("/userByImplementation")
	public String getUserByImplementation(CustomUserDetails userDetails);
}