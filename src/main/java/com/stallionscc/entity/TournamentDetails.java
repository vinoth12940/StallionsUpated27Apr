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

@Entity
@Table(name="st_tournamentdetails")
public class TournamentDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TournamentSk")
	private int tournamentSk;
	
	@Column(name="Tournament_Name")
	private String tournamentName;
	
	@Column(name="Start_Date")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date startDate;
	
	@Column(name="End_Date")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date endDate;
	
	@Column(name="No_of_Matches")
	private int noOfMatches;
	
	@Column(name="Match_Type")
	private String matchType;
	
	@Column(name="StallionsTournamentResult")
	private String stallionsTournamentResult;
	
	

	public TournamentDetails() {
		super();
	}

	public TournamentDetails(int tournamentSk, String tournamentName, Date startDate, Date endDate, int noOfMatches,
			String matchType, String stallionsTournamentResult) {
		super();
		this.tournamentSk = tournamentSk;
		this.tournamentName = tournamentName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.noOfMatches = noOfMatches;
		this.matchType = matchType;
		this.stallionsTournamentResult = stallionsTournamentResult;
	}

	public int getTournamentSk() {
		return tournamentSk;
	}

	public void setTournamentSk(int tournamentSk) {
		this.tournamentSk = tournamentSk;
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

	public int getNoOfMatches() {
		return noOfMatches;
	}

	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}

	public String getMatchType() {
		return matchType;
	}

	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	public String getStallionsTournamentResult() {
		return stallionsTournamentResult;
	}

	public void setStallionsTournamentResult(String stallionsTournamentResult) {
		this.stallionsTournamentResult = stallionsTournamentResult;
	}

	@Override
	public String toString() {
		return "TournamentDetails [tournamentSk=" + tournamentSk + ", tournamentName=" + tournamentName + ", startDate="
				+ startDate + ", endDate=" + endDate + ", noOfMatches=" + noOfMatches + ", matchType=" + matchType
				+ ", stallionsTournamentResult=" + stallionsTournamentResult + "]";
	}
	
}
