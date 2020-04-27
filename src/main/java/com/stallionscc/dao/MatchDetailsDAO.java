package com.stallionscc.dao;

import java.util.List;

import com.stallionscc.entity.MatchDetails;




public interface MatchDetailsDAO {

	public List<MatchDetails> getMatchDetails();

	public void saveMatchDetail(MatchDetails theMatchDetails);

	public MatchDetails getMatchDetail(int matchSK);
	
	public MatchDetails getMatchByYear(int year);

	public void deleteMatchDetail(int matchSK);

}
