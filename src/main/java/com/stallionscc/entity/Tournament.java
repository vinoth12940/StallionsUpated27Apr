/**
 * 
 */
package com.stallionscc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author rvinoth
 *
 */
@Entity
@Table(name="tournament")
public class Tournament {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="tournament_Name")
	private String tournamentName;
	
	@Column(name="start_Date")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startDate;
	
	@Column(name="end_Date")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date endDate;
	
	@Column(name="match_type")
	private String matchType;

	
	@Column(name="no_Of_Matches")
	private String noOfMatches;

	public Tournament() {
		super();
	}

	public Tournament(int id, String tournamentName, Date startDate, Date endDate, String matchType,
			String noOfMatches) {
		super();
		this.id = id;
		this.tournamentName = tournamentName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.matchType = matchType;
		this.noOfMatches = noOfMatches;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTournamentName() {
		return tournamentName;
	}

	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getMatchType() {
		return matchType;
	}

	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	public String getNoOfMatches() {
		return noOfMatches;
	}

	public void setNoOfMatches(String noOfMatches) {
		this.noOfMatches = noOfMatches;
	}

	@Override
	public String toString() {
		return "Tournament [id=" + id + ", tournamentName=" + tournamentName + ", startDate=" + startDate + ", endDate="
				+ endDate + ", matchType=" + matchType + ", noOfMatches=" + noOfMatches + "]";
	}
}
