package com.stallionscc.service;

import java.util.List;
import java.util.Set;

import com.stallionscc.entity.PlayerDetails;

public interface PlayerDetailsService {

	public List<PlayerDetails> getPlayersDetails();

	public void savePlayersDetails(PlayerDetails thePlayersDetails);

	public PlayerDetails getPlayersDetails(int playersSk);

	public void deletePlayerDetails(int playersSk);
	
	public Set<String> getAvtivePlayersDetails();
	
}
