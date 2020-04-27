package com.stallionscc.dao;

import java.util.List;

import com.stallionscc.entity.MatchScoredDetails;


public interface MatchScoredDetailsDAO {

	public List<MatchScoredDetails> getMatchScoredDetails();

	public void saveMatchScoredDetails(MatchScoredDetails theMatchScoredDetails);

	public MatchScoredDetails getMatchScoredDetails(int matchScoreDetailsSK);
		
}
