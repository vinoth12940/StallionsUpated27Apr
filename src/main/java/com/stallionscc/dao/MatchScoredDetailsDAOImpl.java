package com.stallionscc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stallionscc.entity.MatchDetails;
import com.stallionscc.entity.MatchScoredDetails;

@Repository
public class MatchScoredDetailsDAOImpl implements MatchScoredDetailsDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<MatchScoredDetails> getMatchScoredDetails() {
		// TODO Auto-generated method stub
					Session currentSession = sessionFactory.getCurrentSession();
					// create a query  ... sort by last name
					Query<MatchScoredDetails> theQuery = 
							currentSession.createQuery("from MatchScoredDetails order by matchScoreDetailsSK",
									MatchScoredDetails.class);
					// execute query and get result list
					List<MatchScoredDetails> matchScoredDetails = theQuery.getResultList();
								
					// return the results		
					return matchScoredDetails;
	}

	@Override
	public void saveMatchScoredDetails(MatchScoredDetails theMatchScoredDetails) {
		// TODO Auto-generated method stub
		// get current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
						
				// save/upate the Tournament ... finally LOL
				currentSession.saveOrUpdate(theMatchScoredDetails);
	}

	@Override
	public MatchScoredDetails getMatchScoredDetails(int matchScoreDetailsSK) {
		// TODO Auto-generated method stub
		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
						
				// now retrieve/read from database using the primary key
				MatchScoredDetails matchScoredDetails = currentSession.get(MatchScoredDetails.class, matchScoreDetailsSK);
						
				return matchScoredDetails;
	}

}
