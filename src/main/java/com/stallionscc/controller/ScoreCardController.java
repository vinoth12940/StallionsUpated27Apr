package com.stallionscc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/scoreCard")
public class ScoreCardController {
	
	@GetMapping("/")
	public String showWelcome() {
		return "scoreCard";
	}
	
}
