package com.stallionscc.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stallionscc.dao.TournamentDetailsDAO;
import com.stallionscc.entity.TournamentDetails;

@Service
public class TournamentDetailsServiceImpl implements TournamentDetailsService {
	
	@Autowired
	TournamentDetailsDAO tournamentDetailsDAO;
	
	
	@Override
	@Transactional
	public List<TournamentDetails> getTournamentDetails() {
		// TODO Auto-generated method stub
		return tournamentDetailsDAO.getTournamentDetails();
	}

	@Override
	@Transactional
	public void saveTorunamentDetail(TournamentDetails theTournamentDetails) {
		// TODO Auto-generated method stub
		tournamentDetailsDAO.saveTorunamentDetail(theTournamentDetails);
	}

	@Override
	@Transactional
	public TournamentDetails getTournamentDetail(int tournamentSk) {
		// TODO Auto-generated method stub
		return tournamentDetailsDAO.getTournamentDetail(tournamentSk);
	}

	@Override
	@Transactional
	public void deleteTournamentDetail(int tournamentSk) {
		// TODO Auto-generated method stub
		tournamentDetailsDAO.deleteTournamentDetail(tournamentSk);
	}

	@Override
	@Transactional
	public Set<String> getTournamentName() {
		// TODO Auto-generated method stub
		return tournamentDetailsDAO.getTournamentName();
	}

}
