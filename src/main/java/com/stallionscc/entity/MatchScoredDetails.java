package com.stallionscc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="st_matchscoredetails")
public class MatchScoredDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MatchScoreDetailsSK")
	private int matchScoreDetailsSK;
	
	@Column(name="MatchSK")
	private String matchSK;
	
	@Column(name="Toss")
	private String toss;
	
	@Column(name="BattingFirst")
	private String battingFirst;
	
	@Column(name="TotalRuns")
	private int totalRuns;
	
	@Column(name="Wickets")
	private int wickets;
	
	@Column(name="Overs")
	private float overs;
	
	@Column(name="Penalty_Points")
	private int penalty_Points;
	
	@Column(name="Bonus_Points")
	private int bonus_Points;
	
	@Column(name="Byes")
	private int byes;
	
	@Column(name="Leg_Byes")
	private int leg_Byes;
	
	@Column(name="No_Balls")
	private int no_Balls;
	
	@Column(name="Wide")
	private int wide;
	
	@Column(name="Extras")
	private int extras;
	
	@Column(name="Penalty_Runs")
	private int penalty_Runs;
	
	@Column(name="Runs_in_each_over")
	private String runs_in_each_over;
	
	@Column(name="IsStallionsDetails")
	private String isStallionsDetails;

	public MatchScoredDetails() {
		super();
	}

	public MatchScoredDetails(int matchScoreDetailsSK, String matchSK, String toss, String battingFirst, int totalRuns,
			int wickets, float overs, int penalty_Points, int bonus_Points, int byes, int leg_Byes, int no_Balls,
			int wide, int extras, int penalty_Runs, String runs_in_each_over, String isStallionsDetails) {
		super();
		this.matchScoreDetailsSK = matchScoreDetailsSK;
		this.matchSK = matchSK;
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
	}

	public int getMatchScoreDetailsSK() {
		return matchScoreDetailsSK;
	}

	public void setMatchScoreDetailsSK(int matchScoreDetailsSK) {
		this.matchScoreDetailsSK = matchScoreDetailsSK;
	}

	public String getMatchSK() {
		return matchSK;
	}

	public void setMatchSK(String matchSK) {
		this.matchSK = matchSK;
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

	@Override
	public String toString() {
		return "MatchScoredDetails [matchScoreDetailsSK=" + matchScoreDetailsSK + ", matchSK=" + matchSK + ", toss="
				+ toss + ", battingFirst=" + battingFirst + ", totalRuns=" + totalRuns + ", wickets=" + wickets
				+ ", overs=" + overs + ", penalty_Points=" + penalty_Points + ", bonus_Points=" + bonus_Points
				+ ", byes=" + byes + ", leg_Byes=" + leg_Byes + ", no_Balls=" + no_Balls + ", wide=" + wide
				+ ", extras=" + extras + ", penalty_Runs=" + penalty_Runs + ", runs_in_each_over=" + runs_in_each_over
				+ ", isStallionsDetails=" + isStallionsDetails + "]";
	}		
}
