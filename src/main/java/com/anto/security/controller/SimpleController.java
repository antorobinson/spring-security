package com.anto.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@GetMapping("/")
	public String publicMethod() {
		return "<h1>Hello from public method</h1>";
	}

	@GetMapping("/user")
	public String userMethod() {
		return "<h1>Hello from user method</h1>";
	}
	
	@GetMapping("/admin")
	public String adminMethod() {
		return "<h1>Hello from admin method</h1>";
	}
	
	
}
