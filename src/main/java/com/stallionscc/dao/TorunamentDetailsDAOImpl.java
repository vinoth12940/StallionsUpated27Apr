package com.stallionscc.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stallionscc.entity.TournamentDetails;

@Repository
public class TorunamentDetailsDAOImpl implements TournamentDetailsDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<TournamentDetails> getTournamentDetails() {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		// create a query  ... sort by last name
		Query<TournamentDetails> theQuery = 
				currentSession.createQuery("from TournamentDetails order by tournamentSk",
						TournamentDetails.class);
		// execute query and get result list
		List<TournamentDetails> tournamentDetails = theQuery.getResultList();
				
		// return the results		
		return tournamentDetails;
	}

	@Override
	public void saveTorunamentDetail(TournamentDetails theTournamentDetails) {
		// TODO Auto-generated method stub
		// get current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
						
				// save/upate the Tournament ... finally LOL
				currentSession.saveOrUpdate(theTournamentDetails);	
	}

	@Override
	public TournamentDetails getTournamentDetail(int tournamentSk) {
		// TODO Auto-generated method stub
		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
						
				// now retrieve/read from database using the primary key
				TournamentDetails theTournamentDetails = currentSession.get(TournamentDetails.class, tournamentSk);
						
				return theTournamentDetails;
	}

	@Override
	public void deleteTournamentDetail(int tournamentSk) {
		// TODO Auto-generated method stub
		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
						
				// delete object with primary key
				Query theQuery = 
						currentSession.createQuery("delete from TournamentDetails where id=:tournamentDetailsId");
						theQuery.setParameter("tournamentDetailsId", tournamentSk);
						
						theQuery.executeUpdate();

	}

	@Override
	public TournamentDetails getTournamentByYear(int year) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getTournamentName() {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		// create a query  ... sort by last name
		Query<TournamentDetails> theQuery = 
				currentSession.createQuery("from TournamentDetails order by tournamentSk",
						TournamentDetails.class);
		// execute query and get result list
		List<TournamentDetails> tournamentDetails = theQuery.getResultList();
		
		Set<String> tournamentNamelist1 = new HashSet<>();
		
		for (TournamentDetails temp : tournamentDetails) {
			tournamentNamelist1.add(temp.getTournamentName());
			
		}
		return tournamentNamelist1;
	}

}
