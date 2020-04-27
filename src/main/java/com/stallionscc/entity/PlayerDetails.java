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
@Table(name="st_players")
public class PlayerDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="PlayersSk")
	private int playersSk;
	
	@Column(name="First_Name")
	private String first_Name;
	
	@Column(name="Last_Name")
	private String last_Name;
	
	@Column(name="Date_of_birth")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date_Of_Birth;
	
	@Column(name="Born_Place")
	private String born_Place;
	
	@Column(name="Nick_Name")
	private String nick_Name;
	
	@Column(name="Batting_Style")
	private String batting_Style;
	
	@Column(name="Bowling_Style")
	private String bowling_Style;
	
	@Column(name="Role1")
	private String role;
	
	@Column(name="Personal_Contact_Email_Id")
	private String personal_Contact_Email_Id;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="Contract_Number")
	private String contract_Number;
	
	@Column(name="Status1")
	private String status;
	
	
	public PlayerDetails() {
		super();
	}

	public PlayerDetails(int playersSk, String first_Name, String last_Name, Date date_Of_Birth, String born_Place,
			String nick_Name, String batting_Style, String bowling_Style, String role, String personal_Contact_Email_Id,
			String address, String contract_Number, String status) {
		super();
		this.playersSk = playersSk;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.date_Of_Birth = date_Of_Birth;
		this.born_Place = born_Place;
		this.nick_Name = nick_Name;
		this.batting_Style = batting_Style;
		this.bowling_Style = bowling_Style;
		this.role = role;
		this.personal_Contact_Email_Id = personal_Contact_Email_Id;
		this.address = address;
		this.contract_Number = contract_Number;
		this.status = status;
		
	}

	public int getPlayersSk() {
		return playersSk;
	}

	public void setPlayersSk(int playersSk) {
		this.playersSk = playersSk;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public Date getDate_Of_Birth() {
		return date_Of_Birth;
	}

	public void setDate_Of_Birth(Date date_Of_Birth) {
		this.date_Of_Birth = date_Of_Birth;
	}

	public String getBorn_Place() {
		return born_Place;
	}

	public void setBorn_Place(String born_Place) {
		this.born_Place = born_Place;
	}

	public String getNick_Name() {
		return nick_Name;
	}

	public void setNick_Name(String nick_Name) {
		this.nick_Name = nick_Name;
	}

	public String getBatting_Style() {
		return batting_Style;
	}

	public void setBatting_Style(String batting_Style) {
		this.batting_Style = batting_Style;
	}

	public String getBowling_Style() {
		return bowling_Style;
	}

	public void setBowling_Style(String bowling_Style) {
		this.bowling_Style = bowling_Style;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPersonal_Contact_Email_Id() {
		return personal_Contact_Email_Id;
	}

	public void setPersonal_Contact_Email_Id(String personal_Contact_Email_Id) {
		this.personal_Contact_Email_Id = personal_Contact_Email_Id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContract_Number() {
		return contract_Number;
	}

	public void setContract_Number(String contract_Number) {
		this.contract_Number = contract_Number;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "PlayerDetails [playersSk=" + playersSk + ", first_Name=" + first_Name + ", last_Name=" + last_Name
				+ ", date_Of_Birth=" + date_Of_Birth + ", born_Place=" + born_Place + ", nick_Name=" + nick_Name
				+ ", batting_Style=" + batting_Style + ", bowling_Style=" + bowling_Style + ", role=" + role
				+ ", personal_Contact_Email_Id=" + personal_Contact_Email_Id + ", address=" + address
				+ ", contract_Number=" + contract_Number + ", status=" + status + "]";
	}
	
}
