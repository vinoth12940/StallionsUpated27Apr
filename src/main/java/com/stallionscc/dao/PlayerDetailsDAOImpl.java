package com.stallionscc.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stallionscc.entity.PlayerDetails;
import com.stallionscc.entity.TournamentDetails;


@Repository
public class PlayerDetailsDAOImpl implements PlayerDetailsDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<PlayerDetails> getPlayersDetails() {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		// create a query  ... sort by last name
		Query<PlayerDetails> theQuery = 
				currentSession.createQuery("from PlayerDetails order by playersSk",
						PlayerDetails.class);
		// execute query and get result list
		List<PlayerDetails> playerDetails = theQuery.getResultList();
				
		// return the results		
		return playerDetails;
	}

	@Override
	public void savePlayersDetails(PlayerDetails thePlayersDetails) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// save/upate the Tournament ... finally LOL
		currentSession.saveOrUpdate(thePlayersDetails);	

	}

	@Override
	public PlayerDetails getPlayersDetails(int playersSk) {
		// TODO Auto-generated method stub
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// now retrieve/read from database using the primary key
		PlayerDetails thePlayersDetails = currentSession.get(PlayerDetails.class, playersSk);
				
		return thePlayersDetails;
	}

	@Override
	public void deletePlayerDetails(int playersSk) {
		// TODO Auto-generated method stub
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from PlayerDetails where id=:playerDetailsDetailsId");
				theQuery.setParameter("playerDetailsDetailsId", playersSk);
				
				theQuery.executeUpdate();
	}

	@Override
	public Set<String> getAvtivePlayersDetails() {
		// TODO Auto-generated method stub
				Session currentSession = sessionFactory.getCurrentSession();
				// create a query  ... sort by last name
				Query<PlayerDetails> theQuery = 
						currentSession.createQuery("FROM PlayerDetails as P WHERE P.status = 'Y'",
								PlayerDetails.class);
				// execute query and get result list from Cat as cat where cat.name='Fritz'
				List<PlayerDetails> activePlayers = theQuery.getResultList();
				
				Set<String> activePlayerNameList = new HashSet<>();
				
				for (PlayerDetails temp : activePlayers) {
					activePlayerNameList.add(temp.getFirst_Name());
					
				}
				return activePlayerNameList;
			}
	}

