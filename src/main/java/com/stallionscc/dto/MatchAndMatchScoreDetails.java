package com.stallionscc.dto;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


public class MatchAndMatchScoreDetails {
	
	private int matchSK;
	
	private int matchScoreDetailsSK;
	
	private int tournamentSk;
	
	private int playersSk;
	
	private String opponent_Team_Name;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date match_Date;
	
	private String Match_Time;
	
	private String is_Tournament_Match;
	
	private String ground_Name;
	
	private String match_Type;
	
	private String match_Overs;
	
	private String stallions_Match_Result;
	
	private String match_Result;
	
	private String iS_Toss_Stallions;
	
	private String toss_Summary;
	
	private String is_MOM_Stallions;
	
	private String mOM_player_name;

	private String toss;
	
	private String battingFirst;
	
	private int totalRuns;
	
	private int wickets;
	
	private float overs;	
	
	private int penalty_Points;
	
	private int bonus_Points;
	
	private int byes;
	
	private int leg_Byes;
	
	private int no_Balls;
	
	private int wide;
	
	private int extras;
	
	private int penalty_Runs;
	
	private String runs_in_each_over;
	
	private String isStallionsDetails;
	
	private String toss1;
	
	private String battingFirst1;
	
	private int totalRuns1;
	
	private int wickets1;
	
	private float overs1;	
	
	private int penalty_Points1;
	
	private int bonus_Points1;
	
	private int byes1;
	
	private int leg_Byes1;
	
	private int no_Balls1;
	
	private int wide1;
	
	private int extras1;
	
	private int penalty_Runs1;
	
	private String runs_in_each_over1;
	
	private String isStallionsDetails1;

	public MatchAndMatchScoreDetails() {
		super();
	}

	public MatchAndMatchScoreDetails(int matchSK, int matchScoreDetailsSK, int tournamentSk, int playersSk,
			String opponent_Team_Name, Date match_Date, String match_Time, String is_Tournament_Match,
			String ground_Name, String match_Type, String match_Overs, String stallions_Match_Result,
			String match_Result, String iS_Toss_Stallions, String toss_Summary, String is_MOM_Stallions,
			String mOM_player_name, String toss, String battingFirst, int totalRuns, int wickets, float overs,
			int penalty_Points, int bonus_Points, int byes, int leg_Byes, int no_Balls, int wide, int extras,
			int penalty_Runs, String runs_in_each_over, String isStallionsDetails, String toss1, String battingFirst1,
			int totalRuns1, int wickets1, float overs1, int penalty_Points1, int bonus_Points1, int byes1,
			int leg_Byes1, int no_Balls1, int wide1, int extras1, int penalty_Runs1, String runs_in_each_over1,
			String isStallionsDetails1) {
		super();
		this.matchSK = matchSK;
		this.matchScoreDetailsSK = matchScoreDetailsSK;
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
		this.toss = toss;
		this.battingFirst = battingFirst;
		this.totalRuns = totalRuns;
		this.wickets = wickets;
		this.overs = overs;
		this.penalty_Points = penalty_Points;
		this.bonus_Points = bonus_Points;
		this.byes = byes;
		this.leg_Byes = leg_Byes;
		this.no_Balls = no_Balls;
		this.wide = wide;
		this.extras = extras;
		this.penalty_Runs = penalty_Runs;
		this.runs_in_each_over = runs_in_each_over;
		this.isStallionsDetails = isStallionsDetails;
		this.toss1 = toss1;
		this.battingFirst1 = battingFirst1;
		this.totalRuns1 = totalRuns1;
		this.wickets1 = wickets1;
		this.overs1 = overs1;
		this.penalty_Points1 = penalty_Points1;
		this.bonus_Points1 = bonus_Points1;
		this.byes1 = byes1;
		this.leg_Byes1 = leg_Byes1;
		this.no_Balls1 = no_Balls1;
		this.wide1 = wide1;
		this.extras1 = extras1;
		this.penalty_Runs1 = penalty_Runs1;
		this.runs_in_each_over1 = runs_in_each_over1;
		this.isStallionsDetails1 = isStallionsDetails1;
	}

	public int getMatchSK() {
		return matchSK;
	}

	public void setMatchSK(int matchSK) {
		this.matchSK = matchSK;
	}

	public int getMatchScoreDetailsSK() {
		return matchScoreDetailsSK;
	}

	public void setMatchScoreDetailsSK(int matchScoreDetailsSK) {
		this.matchScoreDetailsSK = matchScoreDetailsSK;
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

	public String getToss() {
		return toss;
	}

	public void setToss(String toss) {
		this.toss = toss;
	}

	public String getBattingFirst() {
		return battingFirst;
	}

	public void setBattingFirst(String battingFirst) {
		this.battingFirst = battingFirst;
	}

	public int getTotalRuns() {
		return totalRuns;
	}

	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public float getOvers() {
		return overs;
	}

	public void setOvers(float overs) {
		this.overs = overs;
	}

	public int getPenalty_Points() {
		return penalty_Points;
	}

	public void setPenalty_Points(int penalty_Points) {
		this.penalty_Points = penalty_Points;
	}

	public int getBonus_Points() {
		return bonus_Points;
	}

	public void setBonus_Points(int bonus_Points) {
		this.bonus_Points = bonus_Points;
	}

	public int getByes() {
		return byes;
	}

	public void setByes(int byes) {
		this.byes = byes;
	}

	public int getLeg_Byes() {
		return leg_Byes;
	}

	public void setLeg_Byes(int leg_Byes) {
		this.leg_Byes = leg_Byes;
	}

	public int getNo_Balls() {
		return no_Balls;
	}

	public void setNo_Balls(int no_Balls) {
		this.no_Balls = no_Balls;
	}

	public int getWide() {
		return wide;
	}

	public void setWide(int wide) {
		this.wide = wide;
	}

	public int getExtras() {
		return extras;
	}

	public void setExtras(int extras) {
		this.extras = extras;
	}

	public int getPenalty_Runs() {
		return penalty_Runs;
	}

	public void setPenalty_Runs(int penalty_Runs) {
		this.penalty_Runs = penalty_Runs;
	}

	public String getRuns_in_each_over() {
		return runs_in_each_over;
	}

	public void setRuns_in_each_over(String runs_in_each_over) {
		this.runs_in_each_over = runs_in_each_over;
	}

	public String getIsStallionsDetails() {
		return isStallionsDetails;
	}

	public void setIsStallionsDetails(String isStallionsDetails) {
		this.isStallionsDetails = isStallionsDetails;
	}

	public String getToss1() {
		return toss1;
	}

	public void setToss1(String toss1) {
		this.toss1 = toss1;
	}

	public String getBattingFirst1() {
		return battingFirst1;
	}

	public void setBattingFirst1(String battingFirst1) {
		this.battingFirst1 = battingFirst1;
	}

	public int getTotalRuns1() {
		return totalRuns1;
	}

	public void setTotalRuns1(int totalRuns1) {
		this.totalRuns1 = totalRuns1;
	}

	public int getWickets1() {
		return wickets1;
	}

	public void setWickets1(int wickets1) {
		this.wickets1 = wickets1;
	}

	public float getOvers1() {
		return overs1;
	}

	public void setOvers1(float overs1) {
		this.overs1 = overs1;
	}

	public int getPenalty_Points1() {
		return penalty_Points1;
	}

	public void setPenalty_Points1(int penalty_Points1) {
		this.penalty_Points1 = penalty_Points1;
	}

	public int getBonus_Points1() {
		return bonus_Points1;
	}

	public void setBonus_Points1(int bonus_Points1) {
		this.bonus_Points1 = bonus_Points1;
	}

	public int getByes1() {
		return byes1;
	}

	public void setByes1(int byes1) {
		this.byes1 = byes1;
	}

	public int getLeg_Byes1() {
		return leg_Byes1;
	}

	public void setLeg_Byes1(int leg_Byes1) {
		this.leg_Byes1 = leg_Byes1;
	}

	public int getNo_Balls1() {
		return no_Balls1;
	}

	public void setNo_Balls1(int no_Balls1) {
		this.no_Balls1 = no_Balls1;
	}

	public int getWide1() {
		return wide1;
	}

	public void setWide1(int wide1) {
		this.wide1 = wide1;
	}

	public int getExtras1() {
		return extras1;
	}

	public void setExtras1(int extras1) {
		this.extras1 = extras1;
	}

	public int getPenalty_Runs1() {
		return penalty_Runs1;
	}

	public void setPenalty_Runs1(int penalty_Runs1) {
		this.penalty_Runs1 = penalty_Runs1;
	}

	public String getRuns_in_each_over1() {
		return runs_in_each_over1;
	}

	public void setRuns_in_each_over1(String runs_in_each_over1) {
		this.runs_in_each_over1 = runs_in_each_over1;
	}

	public String getIsStallionsDetails1() {
		return isStallionsDetails1;
	}

	public void setIsStallionsDetails1(String isStallionsDetails1) {
		this.isStallionsDetails1 = isStallionsDetails1;
	}

	@Override
	public String toString() {
		return "MatchAndMatchScoreDetails [matchSK=" + matchSK + ", matchScoreDetailsSK=" + matchScoreDetailsSK
				+ ", tournamentSk=" + tournamentSk + ", playersSk=" + playersSk + ", opponent_Team_Name="
				+ opponent_Team_Name + ", match_Date=" + match_Date + ", Match_Time=" + Match_Time
				+ ", is_Tournament_Match=" + is_Tournament_Match + ", ground_Name=" + ground_Name + ", match_Type="
				+ match_Type + ", match_Overs=" + match_Overs + ", stallions_Match_Result=" + stallions_Match_Result
				+ ", match_Result=" + match_Result + ", iS_Toss_Stallions=" + iS_Toss_Stallions + ", toss_Summary="
				+ toss_Summary + ", is_MOM_Stallions=" + is_MOM_Stallions + ", mOM_player_name=" + mOM_player_name
				+ ", toss=" + toss + ", battingFirst=" + battingFirst + ", totalRuns=" + totalRuns + ", wickets="
				+ wickets + ", overs=" + overs + ", penalty_Points=" + penalty_Points + ", bonus_Points=" + bonus_Points
				+ ", byes=" + byes + ", leg_Byes=" + leg_Byes + ", no_Balls=" + no_Balls + ", wide=" + wide
				+ ", extras=" + extras + ", penalty_Runs=" + penalty_Runs + ", runs_in_each_over=" + runs_in_each_over
				+ ", isStallionsDetails=" + isStallionsDetails + ", toss1=" + toss1 + ", battingFirst1=" + battingFirst1
				+ ", totalRuns1=" + totalRuns1 + ", wickets1=" + wickets1 + ", overs1=" + overs1 + ", penalty_Points1="
				+ penalty_Points1 + ", bonus_Points1=" + bonus_Points1 + ", byes1=" + byes1 + ", leg_Byes1=" + leg_Byes1
				+ ", no_Balls1=" + no_Balls1 + ", wide1=" + wide1 + ", extras1=" + extras1 + ", penalty_Runs1="
				+ penalty_Runs1 + ", runs_in_each_over1=" + runs_in_each_over1 + ", isStallionsDetails1="
				+ isStallionsDetails1 + "]";
	}

	
}
