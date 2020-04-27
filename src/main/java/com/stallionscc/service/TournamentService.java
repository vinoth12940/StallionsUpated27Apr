/**
 * 
 */
package com.stallionscc.service;

import java.util.List;

import com.stallionscc.entity.Tournament;

/**
 * @author rvinoth
 *
 */
public interface TournamentService {

	public List<Tournament> getTournament();

	public void savePlayer(Tournament theTournament);

	public Tournament getTournament(int theId);

	public void deleteTournament(int theId);
}
