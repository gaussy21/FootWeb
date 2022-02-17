package com.zdrv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

	
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/game")
	public String game() {
		return "game";
	}
	
	@GetMapping("/rank")
	public String rank() {
		return "rank";
	}
	
	@PostMapping("/home")
	public String homePost() {
		return "addDone";
	}
}
