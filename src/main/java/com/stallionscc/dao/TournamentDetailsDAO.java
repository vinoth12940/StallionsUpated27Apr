package com.stallionscc.dao;

import java.util.List;
import java.util.Set;

import com.stallionscc.entity.TournamentDetails;



public interface TournamentDetailsDAO {

	public List<TournamentDetails> getTournamentDetails();

	public void saveTorunamentDetail(TournamentDetails theTournamentDetails);

	public TournamentDetails getTournamentDetail(int tournamentSk);
	
	public TournamentDetails getTournamentByYear(int year);

	public void deleteTournamentDetail(int tournamentSk);
	
	public Set<String> getTournamentName();

}
