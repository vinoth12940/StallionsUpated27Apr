package com.stallionscc.service;

import java.util.List;
import java.util.Set;

import com.stallionscc.entity.TournamentDetails;

public interface TournamentDetailsService {

	public List<TournamentDetails> getTournamentDetails();

	public void saveTorunamentDetail(TournamentDetails theTournamentDetails);

	public TournamentDetails getTournamentDetail(int tournamentSk);

	public void deleteTournamentDetail(int tournamentSk);
	
	public Set<String> getTournamentName();
}
