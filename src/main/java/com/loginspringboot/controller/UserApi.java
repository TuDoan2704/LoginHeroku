package com.loginspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApi {
 
	@GetMapping("/hello")
	public String helloWorld(){
		
		return "Hello World";
	}
}
