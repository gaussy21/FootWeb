package com.zdrv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.zdrv.service.ResultService;


@Controller
public class ResultController {

	@Autowired
	private ResultService resultService;
	
	@PostMapping("/game/{id}")
	private String add(@PathVariable int id, Model model) {
		model.addAttribute("result", resultService.getResultById(id));
		return "addDone";
	}
}
