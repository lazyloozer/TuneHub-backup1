package com.kodnest.tunehub.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;
@CrossOrigin("*")
@RestController
public class NavController {
	@GetMapping("/login")
	public String login(){
		return "login";
		
	}
	@GetMapping("/Registration")
	public String Registration(){
		return "Registration";
		
	}
	@GetMapping("/newsong")
	public String newsong() {
		return"newsong";
	}
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		
		return "index";
	}
	
	
	
	
	

}
