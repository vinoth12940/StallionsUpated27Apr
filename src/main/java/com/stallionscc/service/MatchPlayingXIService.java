package com.stallionscc.service;

import java.util.List;

import com.stallionscc.entity.MatchPlayingXI;

public interface MatchPlayingXIService {
	
	public List<MatchPlayingXI> getMatchPlayingXI();

	public void saveMatchPlayingXI(MatchPlayingXI theMatchPlayingXI);

	public MatchPlayingXI getMatchPlayingXI(int matchPlayingXISK);

	public void deleteMatchPlayingXI(int matchPlayingXISK);

}
