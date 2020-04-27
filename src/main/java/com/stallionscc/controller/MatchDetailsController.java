package com.stallionscc.controller;

import java.util.Collections;
import java.util.Comparator;
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

import com.stallionscc.dto.MatchAndMatchScoreDetails;
import com.stallionscc.entity.MatchDetails;
import com.stallionscc.entity.MatchScoredDetails;
import com.stallionscc.entity.PlayerDetails;
import com.stallionscc.entity.TournamentDetails;
import com.stallionscc.service.MatchDetailsService;
import com.stallionscc.service.MatchScoredDetailsService;
import com.stallionscc.service.PlayerDetailsService;
import com.stallionscc.service.TournamentDetailsService;

@Controller
@RequestMapping("/matchDetails")
public class MatchDetailsController {

	@Autowired
	MatchDetailsService matchDetailsService;
	
	@Autowired
	MatchScoredDetailsService matchScoredDetailsService;
	
	@Autowired
	TournamentDetailsService tournamentDetailsService;
	
	@Autowired
	PlayerDetailsService playerDetailsService;
	
	@GetMapping("/list")
	public String listMatchDetails(Model theModel) {
		
		Set<TournamentDetails> tournamentNamelist1 = new HashSet<>();
		//List<TournamentDetails> tournamentNamelist1=new ArrayList<TournamentDetails>();
		List<MatchDetails> matchDetails =  matchDetailsService.getMatchDetails();
		List<TournamentDetails> tournamentDetails = tournamentDetailsService.getTournamentDetails();
		
		for (TournamentDetails temp : tournamentDetails) {
			for (MatchDetails temp1 : matchDetails) {
			 if(temp.getTournamentSk() == temp1.getTournamentSk()) {
				 tournamentNamelist1.add(temp);
				 };
			 }
		}
		
		theModel.addAttribute("theMatchDetails", matchDetails);
		theModel.addAttribute("tournamentNamelist", tournamentNamelist1);
		return "list-matchDetails";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		MatchAndMatchScoreDetails matchAndMatchScoreDetails = new MatchAndMatchScoreDetails();
		
		Set<String> tournamentDetails = tournamentDetailsService.getTournamentName();
		Set<String> activePlayers = playerDetailsService.getAvtivePlayersDetails();
		theModel.addAttribute("matchAndMatchScoreDetails", matchAndMatchScoreDetails);
		theModel.addAttribute("tournamentNameList", tournamentDetails);
		theModel.addAttribute("activePlayerNameList", activePlayers);
		
		return "matchDetails-form";
	}
	
	@PostMapping("/saveMatchDetails")
	public String saveMatch(@ModelAttribute("matchAndMatchScoreDetails") MatchAndMatchScoreDetails theMatchDetails,BindingResult result, Model model) {
		
		if (result.hasErrors()) {
	         return "matchDetails-form";
	    }		
		// save the MatchDetails using our service
		MatchDetails matchDetails = new MatchDetails();
		//matchDetails.setMatchSK(theMatchDetails.getMatchSK());
		matchDetails.setOpponent_Team_Name(theMatchDetails.getOpponent_Team_Name());
		matchDetails.setMatch_Date(theMatchDetails.getMatch_Date());
		
		//Geting tournamentsk
		
		List<TournamentDetails> tournamentDetails = tournamentDetailsService.getTournamentDetails();
		
		for (TournamentDetails temp : tournamentDetails) {
			
			 if(temp.getTournamentName().equalsIgnoreCase(theMatchDetails.getMatch_Time())) {
				 	System.out.println(temp.getTournamentSk());
				 	matchDetails.setTournamentSk(temp.getTournamentSk());
			 }
		 }
		
		//get playersk
		List<PlayerDetails> playerDetail = playerDetailsService.getPlayersDetails();
		
		for(PlayerDetails players : playerDetail) {
			if((players.getFirst_Name()+",").equalsIgnoreCase(theMatchDetails.getmOM_player_name())){
				matchDetails.setPlayersSk(players.getPlayersSk());
			}
		}
		matchDetails.setIs_Tournament_Match(theMatchDetails.getIs_Tournament_Match());
		matchDetails.setGround_Name(theMatchDetails.getGround_Name());
		matchDetails.setMatch_Type(theMatchDetails.getMatch_Type());
		matchDetails.setMatch_Overs(theMatchDetails.getMatch_Overs());
		matchDetails.setStallions_Match_Result(theMatchDetails.getStallions_Match_Result());
		matchDetails.setMatch_Result(theMatchDetails.getMatch_Result());
		matchDetails.setiS_Toss_Stallions(theMatchDetails.getiS_Toss_Stallions());
		matchDetails.setToss_Summary(theMatchDetails.getToss_Summary());
		matchDetails.setIs_MOM_Stallions(theMatchDetails.getIs_MOM_Stallions());
		//get playersk
				List<PlayerDetails> playerDetail1 = playerDetailsService.getPlayersDetails();
				for(PlayerDetails players : playerDetail1) {
					if((players.getFirst_Name()+",").equalsIgnoreCase(theMatchDetails.getmOM_player_name())){
						matchDetails.setmOM_player_name(String.valueOf(players.getPlayersSk()));
					}
				}
		
		
		matchDetailsService.saveMatchDetail(matchDetails);	
		
		List<MatchDetails> match = matchDetailsService.getMatchDetails();
		MatchDetails mtcdet = Collections.max(match,Comparator.comparing(m -> m.getMatchSK()));
		System.out.println(mtcdet.getMatchSK());
		// save the MatchDetails using our service
		MatchScoredDetails matchScoredDetails = new MatchScoredDetails();
		matchScoredDetails.setMatchSK(String.valueOf(mtcdet.getMatchSK()));
		matchScoredDetails.setToss(theMatchDetails.getToss());
		matchScoredDetails.setBattingFirst(theMatchDetails.getBattingFirst());
		matchScoredDetails.setTotalRuns(theMatchDetails.getTotalRuns());
		matchScoredDetails.setWickets(theMatchDetails.getWickets());
		matchScoredDetails.setOvers(theMatchDetails.getOvers());
		matchScoredDetails.setPenalty_Points(theMatchDetails.getPenalty_Points());
		matchScoredDetails.setBonus_Points(theMatchDetails.getBonus_Points());
		/*matchScoredDetails.setByes(theMatchDetails.getByes());
		matchScoredDetails.setLeg_Byes(theMatchDetails.getLeg_Byes());
		matchScoredDetails.setNo_Balls(theMatchDetails.getNo_Balls());
		matchScoredDetails.setWide(theMatchDetails.getWide());
		matchScoredDetails.setExtras(theMatchDetails.getExtras());
		matchScoredDetails.setPenalty_Runs(theMatchDetails.getPenalty_Runs());
		matchScoredDetails.setRuns_in_each_over(theMatchDetails.getRuns_in_each_over());*/
		matchScoredDetails.setIsStallionsDetails(theMatchDetails.getIsStallionsDetails());
		
		matchScoredDetailsService.saveMatchScoredDetails(matchScoredDetails);
		
		List<MatchDetails> match1 = matchDetailsService.getMatchDetails();
		MatchDetails mtcdet1 = Collections.max(match1,Comparator.comparing(m1 -> m1.getMatchSK()));
		System.out.println(mtcdet1.getMatchSK());
		
		MatchScoredDetails matchScoredDetails1 = new MatchScoredDetails();
		matchScoredDetails1.setMatchSK(String.valueOf(mtcdet1.getMatchSK()));
		matchScoredDetails1.setToss(theMatchDetails.getToss1());
		matchScoredDetails1.setBattingFirst(theMatchDetails.getBattingFirst1());
		matchScoredDetails1.setTotalRuns(theMatchDetails.getTotalRuns1());
		matchScoredDetails1.setWickets(theMatchDetails.getWickets1());
		matchScoredDetails1.setOvers(theMatchDetails.getOvers1());
		matchScoredDetails1.setPenalty_Points(theMatchDetails.getPenalty_Points1());
		matchScoredDetails1.setBonus_Points(theMatchDetails.getBonus_Points1());
		/*matchScoredDetails1.setByes(theMatchDetails.getByes1());
		matchScoredDetails1.setLeg_Byes(theMatchDetails.getLeg_Byes1());
		matchScoredDetails1.setNo_Balls(theMatchDetails.getNo_Balls1());
		matchScoredDetails1.setWide(theMatchDetails.getWide1());
		matchScoredDetails1.setExtras(theMatchDetails.getExtras1());
		matchScoredDetails1.setPenalty_Runs(theMatchDetails.getPenalty_Runs1());
		matchScoredDetails1.setRuns_in_each_over(theMatchDetails.getRuns_in_each_over1());*/
		matchScoredDetails1.setIsStallionsDetails(theMatchDetails.getIsStallionsDetails1());
		
		matchScoredDetailsService.saveMatchScoredDetails(matchScoredDetails1);
		return "redirect:/matchDetails/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("matchId") int matchSK,
									Model theModel) {
		
		// get the tournament from our service
		MatchDetails theMatchDetails = matchDetailsService.getMatchDetail(matchSK);	
		
		// set tournament as a model attribute to pre-populate the form
		theModel.addAttribute("matchDetails", theMatchDetails);
		
		// send over to our form		
		return "matchDetails-form";
	}
}
