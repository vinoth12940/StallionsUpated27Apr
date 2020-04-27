package com.stallionscc.service;

import java.util.List;

import com.stallionscc.entity.MatchDetails;


public interface MatchDetailsService {

	public List<MatchDetails> getMatchDetails();

	public void saveMatchDetail(MatchDetails theMatchDetails);

	public MatchDetails getMatchDetail(int matchSK);
	
	public void deleteMatchDetail(int matchSK);
}
