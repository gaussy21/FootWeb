package com.zdrv.controller;

import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.zdrv.domain.Result;
import com.zdrv.domain.Team;
import com.zdrv.service.ResultService;
import com.zdrv.service.TeamService;

@Controller
public class HomeController {

	@Autowired
	private ResultService resultService;
	
	@Autowired
	private TeamService teamService;
	
	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("teams", teamService.getAllTeams());
		Result result = new Result();
		result.setHomeScore(0);
		result.setAwayScore(0);
		result.setDate(new Date());
		model.addAttribute("result", result);
		return "home";
	}
	
	@PostMapping("/home")
	public String homePost(@Valid Result result, @Valid Team team, Errors errors) {
		if(errors.hasErrors()) {
			return "home";
		}
		resultService.insertResult(result);
		return "addDone";
	}
	
	
}
