package com.stallionscc.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stallionscc.dto.MatchPlayingXIDetails;
import com.stallionscc.entity.MatchDetails;
import com.stallionscc.entity.MatchPlayingXI;
import com.stallionscc.entity.PlayerDetails;
import com.stallionscc.service.MatchDetailsService;
import com.stallionscc.service.MatchPlayingXIService;
import com.stallionscc.service.PlayerDetailsService;
import com.stallionscc.service.TournamentDetailsService;

@Controller
@RequestMapping("/matchPlayingXI")
public class MatchPlayingXIController {

	@Autowired
	MatchDetailsService matchDetailsService;
	
	@Autowired
	TournamentDetailsService tournamentDetailsService;
	
	@Autowired
	PlayerDetailsService playerDetailsService;
	
	@Autowired
	MatchPlayingXIService matchPlayingXIService;
	
	@ModelAttribute("pojoForm")
	public MatchPlayingXIDetails populatePojos() {
	    // Don't forget to initialize the pojos list or else it won't work
		MatchPlayingXIDetails pojoForm = new MatchPlayingXIDetails();
	    List<MatchPlayingXI> pojos = new ArrayList<MatchPlayingXI>();
	    for(int i=0; i<11; i++) {
	        pojos.add(new MatchPlayingXI());
	    }
	    pojoForm.setPojos(pojos);
	    return pojoForm;
	}
	
	@GetMapping("/stallionsPlayingXI")
	public String showStallionsPlayingXI(Model theModel) {
		
		//matchPlayingXIDetailsForm.add(new MatchPlayingXI());
		Set<String> activePlayerDetails = playerDetailsService.getAvtivePlayersDetails();
		theModel.addAttribute("matchPlayingXIDetailsForm", new MatchPlayingXIController().populatePojos());
		theModel.addAttribute("activePlayerNameList", activePlayerDetails);
		
		return "stallionsPlayingXI-form";
	}
	
	@PostMapping("/saveStallionsPlayingXIDetails")
	public String saveForm(@ModelAttribute("pojoForm") MatchPlayingXIDetails pojoForm) {
		
		List<MatchDetails> matchDetails = matchDetailsService.getMatchDetails();
		
		//get Matchsk
		MatchDetails maxMatchSk = matchDetails.stream().max(Comparator.comparing(v -> v.getMatchSK())).get();
	    
		for(MatchPlayingXI pojo : pojoForm.getPojos()) {
	    	pojo.setMatchSK(maxMatchSk.getMatchSK());
	    	
	    	//get playersk
			List<PlayerDetails> playerDetail = playerDetailsService.getPlayersDetails();
			for(PlayerDetails players : playerDetail) {
				if((players.getFirst_Name()+",").equalsIgnoreCase(pojo.getPlayers_Name())){
					pojo.setPlayersSK(players.getPlayersSk());
					pojo.setPlayers_Name(Integer.toString(players.getPlayersSk()));
				}
			}
	    	
	    	matchPlayingXIService.saveMatchPlayingXI(pojo);
	    }
	    return "opponentPlayingXI-form";
	}
	
	
	@GetMapping("/opponentPlayingXI")
	public String showOpponentPlayingXI(Model theModel) {
		
		
		Set<String> activePlayerDetails = playerDetailsService.getAvtivePlayersDetails();
		theModel.addAttribute("matchPlayingXIDetailsForm", new MatchPlayingXIController().populatePojos());
		theModel.addAttribute("activePlayerNameList", activePlayerDetails);
		
		return "opponentPlayingXI-form";
	}
	
	@PostMapping("/saveOpponentPlayingXIDetails")
	public String saveOpponentForm(@ModelAttribute("pojoForm") MatchPlayingXIDetails pojoForm) {
	    for(MatchPlayingXI pojo : pojoForm.getPojos()) {
	    	matchPlayingXIService.saveMatchPlayingXI(pojo);
	    }
	    return "";
	}
}
