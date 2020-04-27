package com.stallionscc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stallionscc.dao.MatchScoredDetailsDAO;
import com.stallionscc.entity.MatchScoredDetails;

@Service
public class MatchScoredDetailsServiceImpl implements MatchScoredDetailsService {
	@Autowired
	MatchScoredDetailsDAO matchScoredDetailsDAO;
	
	
	@Override
	@Transactional
	public List<MatchScoredDetails> getMatchScoredDetails() {
		// TODO Auto-generated method stub
		return matchScoredDetailsDAO.getMatchScoredDetails();
	}

	@Override
	@Transactional
	public void saveMatchScoredDetails(MatchScoredDetails theMatchScoredDetails) {
		// TODO Auto-generated method stub
		matchScoredDetailsDAO.saveMatchScoredDetails(theMatchScoredDetails);
	}

	@Override
	@Transactional
	public MatchScoredDetails getMatchScoredDetails(int matchScoreDetailsSK) {
		// TODO Auto-generated method stub
		return matchScoredDetailsDAO.getMatchScoredDetails(matchScoreDetailsSK);
	}

}
