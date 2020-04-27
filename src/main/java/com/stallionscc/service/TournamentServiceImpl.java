/**
 * 
 */
package com.stallionscc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stallionscc.dao.TournamentDAO;
import com.stallionscc.entity.Tournament;

/**
 * @author rvinoth
 *
 */
@Service
public class TournamentServiceImpl implements TournamentService{

	// need to inject TournamentDAO
	@Autowired
	TournamentDAO tournamentDAO;
	
	/* (non-Javadoc)
	 * @see com.stallionscc.service.TournamentService#getTournament()
	 */
	@Override
	@Transactional
	public List<Tournament> getTournament() {
		// TODO Auto-generated method stub
		return tournamentDAO.getTournament();
	}

	/* (non-Javadoc)
	 * @see com.stallionscc.service.TournamentService#savePlayer(com.stallionscc.entity.Tournament)
	 */
	@Override
	@Transactional
	public void savePlayer(Tournament theTournament) {
		// TODO Auto-generated method stub
		tournamentDAO.savePlayer(theTournament);
	}

	/* (non-Javadoc)
	 * @see com.stallionscc.service.TournamentService#getTournament(int)
	 */
	@Override
	@Transactional
	public Tournament getTournament(int theId) {
		// TODO Auto-generated method stub
		return tournamentDAO.getTournament(theId);
	}

	/* (non-Javadoc)
	 * @see com.stallionscc.service.TournamentService#deleteTournament(int)
	 */
	@Override
	@Transactional
	public void deleteTournament(int theId) {
		// TODO Auto-generated method stub
		tournamentDAO.deleteTournament(theId);
	}

}
