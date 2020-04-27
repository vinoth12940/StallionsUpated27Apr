package com.stallionscc.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="st_matchdetails")
public class MatchDetails {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MatchSK")
	private int matchSK;
	
	@Column(name="TournamentSk")
	private int tournamentSk;
	
	@Column(name="PlayersSk")
	private int playersSk;
	
	@Column(name="Opponent_Team_Name")
	private String opponent_Team_Name;
	
	@Column(name="Match_Date")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date match_Date;
	
	@Column(name="Match_Time")
	private String Match_Time;
	
	@Column(name="Is_Tournament_Match")
	private String is_Tournament_Match;
	
	@Column(name="Ground_Name")
	private String ground_Name;
	
	@Column(name="Match_Type")
	private String match_Type;
	
	@Column(name="Match_Overs")
	private String match_Overs;
	
	@Column(name="Stallions_Match_Result")
	private String stallions_Match_Result;
	
	@Column(name="Match_Result")
	private String match_Result;
	
	@Column(name="IS_Toss_Stallions")
	private String iS_Toss_Stallions;
	
	@Column(name="Toss_Summary")
	private String toss_Summary;
	
	@Column(name="Is_MOM_Stallions")
	private String is_MOM_Stallions;
	
	@Column(name="MOM_player_name")
	private String mOM_player_name;
	
	public MatchDetails() {
		super();
	}

	public MatchDetails(int matchSK, int tournamentSk, int playersSk, String opponent_Team_Name, Date match_Date,
			String match_Time, String is_Tournament_Match, String ground_Name, String match_Type, String match_Overs,
			String stallions_Match_Result, String match_Result, String iS_Toss_Stallions, String toss_Summary,
			String is_MOM_Stallions, String mOM_player_name) {
		super();
		this.matchSK = matchSK;
		this.tournamentSk = tournamentSk;
		this.playersSk = playersSk;
		this.opponent_Team_Name = opponent_Team_Name;
		this.match_Date = match_Date;
		Match_Time = match_Time;
		this.is_Tournament_Match = is_Tournament_Match;
		this.ground_Name = ground_Name;
		this.match_Type = match_Type;
		this.match_Overs = match_Overs;
		this.stallions_Match_Result = stallions_Match_Result;
		this.match_Result = match_Result;
		this.iS_Toss_Stallions = iS_Toss_Stallions;
		this.toss_Summary = toss_Summary;
		this.is_MOM_Stallions = is_MOM_Stallions;
		this.mOM_player_name = mOM_player_name;
	}

	public int getMatchSK() {
		return matchSK;
	}

	public void setMatchSK(int matchSK) {
		this.matchSK = matchSK;
	}

	public int getTournamentSk() {
		return tournamentSk;
	}

	public void setTournamentSk(int tournamentSk) {
		this.tournamentSk = tournamentSk;
	}

	public int getPlayersSk() {
		return playersSk;
	}

	public void setPlayersSk(int playersSk) {
		this.playersSk = playersSk;
	}

	public String getOpponent_Team_Name() {
		return opponent_Team_Name;
	}

	public void setOpponent_Team_Name(String opponent_Team_Name) {
		this.opponent_Team_Name = opponent_Team_Name;
	}

	public Date getMatch_Date() {
		return match_Date;
	}

	public void setMatch_Date(Date match_Date) {
		this.match_Date = match_Date;
	}

	public String getMatch_Time() {
		return Match_Time;
	}

	public void setMatch_Time(String match_Time) {
		Match_Time = match_Time;
	}

	public String getIs_Tournament_Match() {
		return is_Tournament_Match;
	}

	public void setIs_Tournament_Match(String is_Tournament_Match) {
		this.is_Tournament_Match = is_Tournament_Match;
	}

	public String getGround_Name() {
		return ground_Name;
	}

	public void setGround_Name(String ground_Name) {
		this.ground_Name = ground_Name;
	}

	public String getMatch_Type() {
		return match_Type;
	}

	public void setMatch_Type(String match_Type) {
		this.match_Type = match_Type;
	}

	public String getMatch_Overs() {
		return match_Overs;
	}

	public void setMatch_Overs(String match_Overs) {
		this.match_Overs = match_Overs;
	}

	public String getStallions_Match_Result() {
		return stallions_Match_Result;
	}

	public void setStallions_Match_Result(String stallions_Match_Result) {
		this.stallions_Match_Result = stallions_Match_Result;
	}

	public String getMatch_Result() {
		return match_Result;
	}

	public void setMatch_Result(String match_Result) {
		this.match_Result = match_Result;
	}

	public String getiS_Toss_Stallions() {
		return iS_Toss_Stallions;
	}

	public void setiS_Toss_Stallions(String iS_Toss_Stallions) {
		this.iS_Toss_Stallions = iS_Toss_Stallions;
	}

	public String getToss_Summary() {
		return toss_Summary;
	}

	public void setToss_Summary(String toss_Summary) {
		this.toss_Summary = toss_Summary;
	}

	public String getIs_MOM_Stallions() {
		return is_MOM_Stallions;
	}

	public void setIs_MOM_Stallions(String is_MOM_Stallions) {
		this.is_MOM_Stallions = is_MOM_Stallions;
	}

	public String getmOM_player_name() {
		return mOM_player_name;
	}

	public void setmOM_player_name(String mOM_player_name) {
		this.mOM_player_name = mOM_player_name;
	}

	@Override
	public String toString() {
		return "MatchDetails [matchSK=" + matchSK + ", tournamentSk=" + tournamentSk + ", playersSk=" + playersSk
				+ ", opponent_Team_Name=" + opponent_Team_Name + ", match_Date=" + match_Date + ", Match_Time="
				+ Match_Time + ", is_Tournament_Match=" + is_Tournament_Match + ", ground_Name=" + ground_Name
				+ ", match_Type=" + match_Type + ", match_Overs=" + match_Overs + ", stallions_Match_Result="
				+ stallions_Match_Result + ", match_Result=" + match_Result + ", iS_Toss_Stallions=" + iS_Toss_Stallions
				+ ", toss_Summary=" + toss_Summary + ", is_MOM_Stallions=" + is_MOM_Stallions + ", mOM_player_name="
				+ mOM_player_name + "]";
	}

	
}
