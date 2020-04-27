/**
 * 
 */
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

import com.stallionscc.entity.Player;
import com.stallionscc.entity.Tournament;
import com.stallionscc.service.TournamentService;

/**
 * @author rvinoth
 *
 */
@Controller
@RequestMapping("/tournament")
public class TournamentController {

	// need to inject our Player service
	@Autowired
	TournamentService tournamentService;
	
	@GetMapping("/list")
	public String listTournaments(Model theModel) {
		
		// get customers from the service
		List<Tournament> theTournaments = tournamentService.getTournament();
				
		// add the customers to the model
		theModel.addAttribute("tournaments", theTournaments);
		
		return "list-tournaments";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Tournament theTournament = new Tournament();
		
		theModel.addAttribute("tournament", theTournament);
		
		return "tournament-form";
	}
	
	@PostMapping("/saveTournament")
	public String saveTournament(@ModelAttribute("tournament") Tournament theTournament,BindingResult result, Model model) {
		
		if (result.hasErrors()) {
	         return "tournament-form";
	    }		
		// save the customer using our service
		tournamentService.savePlayer(theTournament);	
		
		return "redirect:/tournament/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("tournamentId") int theId,
									Model theModel) {
		
		// get the tournament from our service
		Tournament theTournament = tournamentService.getTournament(theId);	
		
		// set tournament as a model attribute to pre-populate the form
		theModel.addAttribute("tournament", theTournament);
		
		// send over to our form		
		return "tournament-form";
	}
	
	@GetMapping("/delete")
	public String deleteTournament(@RequestParam("tournamentId") int theId) {
		
		// delete the customer
		tournamentService.deleteTournament(theId);
		
		return "redirect:/tournament/list";
	}
}
