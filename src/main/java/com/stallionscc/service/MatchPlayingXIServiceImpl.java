package com.stallionscc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stallionscc.dao.MatchPlayingXIDAO;
import com.stallionscc.entity.MatchPlayingXI;
@Service
public class MatchPlayingXIServiceImpl implements MatchPlayingXIService {
	
	@Autowired
	MatchPlayingXIDAO matchPlayingXIDAO; 
	@Transactional
	@Override
	public List<MatchPlayingXI> getMatchPlayingXI() {
		// TODO Auto-generated method stub
		return matchPlayingXIDAO.getMatchPlayingXI();
	}
	
	@Transactional
	@Override
	public void saveMatchPlayingXI(MatchPlayingXI theMatchPlayingXI) {
		// TODO Auto-generated method stub
		matchPlayingXIDAO.saveMatchPlayingXI(theMatchPlayingXI);
	}
	
	@Transactional
	@Override
	public MatchPlayingXI getMatchPlayingXI(int matchPlayingXISK) {
		// TODO Auto-generated method stub
		return matchPlayingXIDAO.getMatchPlayingXI(matchPlayingXISK);
	}

	@Transactional
	@Override
	public void deleteMatchPlayingXI(int matchPlayingXISK) {
		// TODO Auto-generated method stub

	}

}
