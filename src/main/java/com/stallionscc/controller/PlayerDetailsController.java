package com.stallionscc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stallionscc.entity.PlayerDetails;

import com.stallionscc.service.PlayerDetailsService;



@Controller
@RequestMapping("/playerDetails")
public class PlayerDetailsController {

	@Autowired
	PlayerDetailsService playerDetailsService;
	
	@GetMapping("/list")
	public String listPlayerDetails(Model theModel) {
		
		List<PlayerDetails> playerDetails =  playerDetailsService.getPlayersDetails();
			
		theModel.addAttribute("thePlayerDetails", playerDetails);
		
		return "list-playerDetails";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		PlayerDetails playerDetails = new PlayerDetails();
		
		theModel.addAttribute("playerDetails", playerDetails);
		
		return "playerDetails-form";
	}
	
	@PostMapping("/savePlayerDetails")
	public String savePlayer(@ModelAttribute("playerDetails") PlayerDetails thePlayerDetails,BindingResult result, Model model) {
		
		if (result.hasErrors()) {
	         return "playerDetails-form";
	    }		
		
		System.out.println(thePlayerDetails.getRole());
		System.out.println(thePlayerDetails.getStatus());
		// save the customer using our service
		playerDetailsService.savePlayersDetails(thePlayerDetails);	
		
		return "redirect:/playerDetails/list";
	}
	
		
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("playersSk") int playersSk,
									Model theModel) {
		
		// get the tournament from our service
		PlayerDetails thePlayerDetails = playerDetailsService.getPlayersDetails(playersSk);	
		
		// set tournament as a model attribute to pre-populate the form
		theModel.addAttribute("playerDetails", thePlayerDetails);
		
		// send over to our form		
		return "playerDetails-form";
	}
}
