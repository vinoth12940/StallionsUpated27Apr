package com.stallionscc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="st_matchplayingxi")
public class MatchPlayingXI {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MatchPlayingXISK")
	private int matchPlayingXISK;
	
	@Column(name="MatchSK")
	private int matchSK;
	
	@Column(name="PlayersSK")
	private int playersSK;
	
	@Column(name="Players_Name")
	private String players_Name;
	
	@Column(name="Batting_Order")
	private int batting_Order;
	
	@Column(name="Is_Captain")
	private String is_Captain;
	
	@Column(name="Is_Wicket_Keeper")
	private String is_Wicket_Keeper;
	
	@Column(name="Is_Rested")
	private String is_Rested;
	
	@Column(name="IsStallionsDetails")
	private String isStallionsDetails;
	
	@Column(name="Is_NotAvailable")
	private String is_NotAvailable;
	
	@Column(name="Notes")
	private String notes;

	public MatchPlayingXI() {
		super();
	}

	public MatchPlayingXI(int matchPlayingXISK, int matchSK, int playersSK, String players_Name, int batting_Order,
			String is_Captain, String is_Wicket_Keeper, String is_Rested, String isStallionsDetails,
			String is_NotAvailable, String notes) {
		super();
		this.matchPlayingXISK = matchPlayingXISK;
		this.matchSK = matchSK;
		this.playersSK = playersSK;
		this.players_Name = players_Name;
		this.batting_Order = batting_Order;
		this.is_Captain = is_Captain;
		this.is_Wicket_Keeper = is_Wicket_Keeper;
		this.is_Rested = is_Rested;
		this.isStallionsDetails = isStallionsDetails;
		this.is_NotAvailable = is_NotAvailable;
		this.notes = notes;
	}

	public int getMatchPlayingXISK() {
		return matchPlayingXISK;
	}

	public void setMatchPlayingXISK(int matchPlayingXISK) {
		this.matchPlayingXISK = matchPlayingXISK;
	}

	public int getMatchSK() {
		return matchSK;
	}

	public void setMatchSK(int matchSK) {
		this.matchSK = matchSK;
	}

	public int getPlayersSK() {
		return playersSK;
	}

	public void setPlayersSK(int playersSK) {
		this.playersSK = playersSK;
	}

	public String getPlayers_Name() {
		return players_Name;
	}

	public void setPlayers_Name(String players_Name) {
		this.players_Name = players_Name;
	}

	public int getBatting_Order() {
		return batting_Order;
	}

	public void setBatting_Order(int batting_Order) {
		this.batting_Order = batting_Order;
	}

	public String getIs_Captain() {
		return is_Captain;
	}

	public void setIs_Captain(String is_Captain) {
		this.is_Captain = is_Captain;
	}

	public String getIs_Wicket_Keeper() {
		return is_Wicket_Keeper;
	}

	public void setIs_Wicket_Keeper(String is_Wicket_Keeper) {
		this.is_Wicket_Keeper = is_Wicket_Keeper;
	}

	public String getIs_Rested() {
		return is_Rested;
	}

	public void setIs_Rested(String is_Rested) {
		this.is_Rested = is_Rested;
	}

	public String getIsStallionsDetails() {
		return isStallionsDetails;
	}

	public void setIsStallionsDetails(String isStallionsDetails) {
		this.isStallionsDetails = isStallionsDetails;
	}

	public String getIs_NotAvailable() {
		return is_NotAvailable;
	}

	public void setIs_NotAvailable(String is_NotAvailable) {
		this.is_NotAvailable = is_NotAvailable;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "MatchPlayingXI [matchPlayingXISK=" + matchPlayingXISK + ", matchSK=" + matchSK + ", playersSK="
				+ playersSK + ", players_Name=" + players_Name + ", batting_Order=" + batting_Order + ", is_Captain="
				+ is_Captain + ", is_Wicket_Keeper=" + is_Wicket_Keeper + ", is_Rested=" + is_Rested
				+ ", isStallionsDetails=" + isStallionsDetails + ", is_NotAvailable=" + is_NotAvailable + ", notes="
				+ notes + "]";
	}
	
}
