package com.stallionscc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stallionscc.entity.MatchDetails;

@Repository
public class MatchDetailsDAOImpl implements MatchDetailsDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<MatchDetails> getMatchDetails() {
			// TODO Auto-generated method stub
			Session currentSession = sessionFactory.getCurrentSession();
			// create a query  ... sort by last name
			Query<MatchDetails> theQuery = 
					currentSession.createQuery("from MatchDetails order by matchSK",
								MatchDetails.class);
			// execute query and get result list
			List<MatchDetails> matchDetails = theQuery.getResultList();
						
			// return the results		
			return matchDetails;
	}

	@Override
	public void saveMatchDetail(MatchDetails theMatchDetails) {
		// TODO Auto-generated method stub
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// save/upate the Tournament ... finally LOL
		currentSession.saveOrUpdate(theMatchDetails);
	}

	@Override
	public MatchDetails getMatchDetail(int matchSK) {
		// TODO Auto-generated method stub
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// now retrieve/read from database using the primary key
		MatchDetails matchDetails = currentSession.get(MatchDetails.class, matchSK);
				
		return matchDetails;
	}

	@Override
	public MatchDetails getMatchByYear(int year) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMatchDetail(int matchSK) {
		// TODO Auto-generated method stub
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from MatchDetails where id=:matchDetailsId");
				theQuery.setParameter("matchDetailsId", matchSK);
				
				theQuery.executeUpdate();
	}

}
