/**
 * 
 */
package com.stallionscc.dao;

import java.util.List;

import com.stallionscc.entity.Tournament;

/**
 * @author rvinoth
 *
 */
public interface TournamentDAO {
	
	public List<Tournament> getTournament();

	public void savePlayer(Tournament theTournament);

	public Tournament getTournament(int theId);

	public void deleteTournament(int theId);

}
