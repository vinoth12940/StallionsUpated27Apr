package com.stallionscc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stallionscc.entity.MatchPlayingXI;
import com.stallionscc.entity.MatchScoredDetails;

@Repository
public class MatchPlayingXIDAOImpl implements MatchPlayingXIDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<MatchPlayingXI> getMatchPlayingXI() {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		// create a query  ... sort by last name
		Query<MatchPlayingXI> theQuery = 
				currentSession.createQuery("from MatchPlayingXI order by matchPlayingXISK",
						MatchPlayingXI.class);
		// execute query and get result list
		List<MatchPlayingXI> matchPlayingXI = theQuery.getResultList();
					
		// return the results		
		return matchPlayingXI;

	}

	@Override
	public void saveMatchPlayingXI(MatchPlayingXI theMatchPlayingXI) {
		// TODO Auto-generated method stub
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// save/upate the Tournament ... finally LOL
		currentSession.saveOrUpdate(theMatchPlayingXI);
	}

	@Override
	public MatchPlayingXI getMatchPlayingXI(int matchPlayingXISK) {
		// TODO Auto-generated method stub
		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
						
				// now retrieve/read from database using the primary key
				MatchPlayingXI matchPlayingXI = currentSession.get(MatchPlayingXI.class, matchPlayingXISK);
						
				return matchPlayingXI;
	}

	@Override
	public void deleteMatchPlayingXI(int matchPlayingXISK) {
		// TODO Auto-generated method stub
		
	}

}
