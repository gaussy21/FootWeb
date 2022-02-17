package com.zdrv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.zdrv.domain.Result;




@Controller
public class ResultController {

	
	
	
	@GetMapping("/game")
	private String add(Model model) {
		model.addAttribute("result", new Result());
		return "game";
	}
	
}
