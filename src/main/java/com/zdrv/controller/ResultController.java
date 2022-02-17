package com.zdrv.controller;

import org.springframework.stereotype.Controller;



@Controller
public class ResultController {

	/**
	@Autowired
	private ResultService resultService;
	
	@PostMapping("/game/{id}")
	private String add(@PathVariable int id, Model model) {
		model.addAttribute("result", resultService.getResultById(id));
		return "addDone";
	}
	*/
}
