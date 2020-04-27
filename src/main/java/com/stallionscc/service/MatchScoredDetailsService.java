package com.stallionscc.service;

import java.util.List;

import com.stallionscc.entity.MatchScoredDetails;

public interface MatchScoredDetailsService {
	
	public List<MatchScoredDetails> getMatchScoredDetails();

	public void saveMatchScoredDetails(MatchScoredDetails theMatchScoredDetails);

	public MatchScoredDetails getMatchScoredDetails(int matchScoreDetailsSK);
}
