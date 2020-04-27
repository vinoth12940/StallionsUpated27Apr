package com.stallionscc.service;

import java.util.List;

import com.stallionscc.entity.Player;

public interface PlayerService {

	public List<Player> getPlayers();

	public void savePlayer(Player thePlayer);

	public Player getPlayer(int theId);

	public void deletePlayer(int theId);
	
}
