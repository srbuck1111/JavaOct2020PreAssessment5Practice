package com.example.pretestpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("username") String username, 
						@RequestParam("pass") String password,
						Model model) {
		model.addAttribute("name", username);
		if(password.equals("potato")) return "secret";
		return "sorry";
	}
	
}
