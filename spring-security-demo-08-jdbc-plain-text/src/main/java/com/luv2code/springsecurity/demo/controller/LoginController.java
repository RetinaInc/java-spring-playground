package com.luv2code.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String showLoginForm() {
		return "fancy-login";
	}

	@GetMapping("/access-denied")
	public String acessDenied() {
		return "access-denied";
	}
}
