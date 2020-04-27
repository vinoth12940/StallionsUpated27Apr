package com.stallionscc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stallionscc.dao.MatchDetailsDAO;
import com.stallionscc.entity.MatchDetails;

@Service
public class MatchDetailsServiceImpl implements MatchDetailsService {

	@Autowired
	MatchDetailsDAO matchDetailsDAO; 
	
	@Override
	@Transactional
	public List<MatchDetails> getMatchDetails() {
		// TODO Auto-generated method stub
		return matchDetailsDAO.getMatchDetails();
	}

	@Override
	@Transactional
	public void saveMatchDetail(MatchDetails theMatchDetails) {
		// TODO Auto-generated method stub
		matchDetailsDAO.saveMatchDetail(theMatchDetails);
	}

	@Override
	@Transactional
	public MatchDetails getMatchDetail(int matchSK) {
		// TODO Auto-generated method stub
		return matchDetailsDAO.getMatchDetail(matchSK);
	}

	@Override
	@Transactional
	public void deleteMatchDetail(int matchSK) {
		// TODO Auto-generated method stub
		matchDetailsDAO.deleteMatchDetail(matchSK);
	}

}
