/**
 * 
 */
package com.stallionscc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stallionscc.entity.Tournament;

/**
 * @author rvinoth
 *
 */
@Repository
public class TournamentDAOImpl implements TournamentDAO{
	
	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
		
	/* (non-Javadoc)
	 * @see com.stallionscc.dao.TournamentDAO#getTournament()
	 */
	@Override
	public List<Tournament> getTournament() {
		
		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
						
				// create a query  ... sort by last name
				Query<Tournament> theQuery = 
						currentSession.createQuery("from Tournament order by tournamentName",
								Tournament.class);
				
				// execute query and get result list
				List<Tournament> tournament = theQuery.getResultList();
						
				// return the results		
				return tournament;
	}

	/* (non-Javadoc)
	 * @see com.stallionscc.dao.TournamentDAO#savePlayer(com.stallionscc.entity.Tournament)
	 */
	@Override
	public void savePlayer(Tournament theTournament) {
		
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// save/upate the Tournament ... finally LOL
		currentSession.saveOrUpdate(theTournament);
		
		
	}

	/* (non-Javadoc)
	 * @see com.stallionscc.dao.TournamentDAO#getTournament(int)
	 */
	@Override
	public Tournament getTournament(int theId) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// now retrieve/read from database using the primary key
		Tournament theTournament = currentSession.get(Tournament.class, theId);
				
		return theTournament;
	}

	/* (non-Javadoc)
	 * @see com.stallionscc.dao.TournamentDAO#deleteTournament(int)
	 */
	@Override
	public void deleteTournament(int theId) {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from Tournament where id=:tournamentId");
				theQuery.setParameter("tournamentId", theId);
				
				theQuery.executeUpdate();
		
	}

}
