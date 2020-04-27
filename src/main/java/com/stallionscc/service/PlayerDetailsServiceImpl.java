package com.stallionscc.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stallionscc.dao.PlayerDetailsDAO;
import com.stallionscc.entity.PlayerDetails;

@Service
public class PlayerDetailsServiceImpl implements PlayerDetailsService {
	
	@Autowired
	PlayerDetailsDAO playerDetailsDAO;
	
	@Override
	@Transactional
	public List<PlayerDetails> getPlayersDetails() {
		// TODO Auto-generated method stub
		return playerDetailsDAO.getPlayersDetails();
	}

	@Override
	@Transactional
	public void savePlayersDetails(PlayerDetails thePlayersDetails) {
		// TODO Auto-generated method stub
		playerDetailsDAO.savePlayersDetails(thePlayersDetails);
	}

	@Override
	@Transactional
	public PlayerDetails getPlayersDetails(int playersSk) {
		// TODO Auto-generated method stub
		return playerDetailsDAO.getPlayersDetails(playersSk);
	}

	@Override
	@Transactional
	public void deletePlayerDetails(int playersSk) {
		// TODO Auto-generated method stub
		playerDetailsDAO.deletePlayerDetails(playersSk);
	}

	@Override
	@Transactional
	public Set<String> getAvtivePlayersDetails() {
		// TODO Auto-generated method stub
		return playerDetailsDAO.getAvtivePlayersDetails();
	}

}
