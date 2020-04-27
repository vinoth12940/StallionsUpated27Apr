package com.stallionscc.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.stallionscc.entity.TournamentDetails;
import com.stallionscc.service.TournamentDetailsService;



@Controller
@RequestMapping("/tournamentDetails")
public class TournamentDetailsController {

	@Autowired
	TournamentDetailsService tournamentDetailsService;
	
	@GetMapping("/list")
	public String listTournamentDetails(Model theModel) {
		
		int seasonYear = 0 ;
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		
		List<TournamentDetails> tournamentDetails =  tournamentDetailsService.getTournamentDetails();
		
		for (TournamentDetails temp : tournamentDetails) {
			java.sql.Date year =  (java.sql.Date) temp.getEndDate();
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(year);
			seasonYear = calendar.get(Calendar.YEAR);
			num.add(seasonYear);
		}
		
		Set<Integer> hs = new HashSet<>();
		hs.addAll(num);
		num.clear();
		num.addAll(hs);
		
		Collections.sort(num); 
		
		theModel.addAttribute("theTournamentDetails", tournamentDetails);
		theModel.addAttribute("seasonYear", num);
		return "list-tournamntDetails";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		TournamentDetails theTournamentDetails = new TournamentDetails();
		
		theModel.addAttribute("tournamentDetails", theTournamentDetails);
		
		return "tournamentDetails-form";
	}
	
	@PostMapping("/saveTournament")
	public String saveTournament(@ModelAttribute("tournamentDetails") TournamentDetails theTournamentDetail,BindingResult result, Model model) {
		
		if (result.hasErrors()) {
	         return "tournament-form";
	    }		
		// save the customer using our service
		tournamentDetailsService.saveTorunamentDetail(theTournamentDetail);	
		
		return "redirect:/tournamentDetails/list";
	}
	
	@GetMapping("/showYearwiseTournament")
	public String showTournamentByYear(@RequestParam("seasonYears") int year,
			Model theModel) {
		
		System.out.println();
		/*// get the tournament from our service
		TournamentDetails theTournamentDetails = tournamentDetailsService.getTournamentDetail(year);	
		
		// set tournament as a model attribute to pre-populate the form
		theModel.addAttribute("tournamentDetails", theTournamentDetails);
		*/
		// send over to our form		
		return "redirect:/tournamentDetails/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("tournamentId") int tournamentSk,
									Model theModel) {
		
		// get the tournament from our service
		TournamentDetails theTournamentDetails = tournamentDetailsService.getTournamentDetail(tournamentSk);	
		
		// set tournament as a model attribute to pre-populate the form
		theModel.addAttribute("tournamentDetails", theTournamentDetails);
		
		// send over to our form		
		return "tournamentDetails-form";
	}
}
