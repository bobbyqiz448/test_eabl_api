package com.eabl.api.model;

import javax.persistence.*;

//import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;

@Data
//commented lines did not seem to work, actually did not work
//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name="eabl_users")
public class User {
	
	

	

	
	@Id
	@Column(name="user_id")
	private String id;

	@Column(name="first_name")
	private String fName;

	@Column(name="last_name")
	private String lName;

	@Column(name="tel_no")
	private String telNo;

	@Column(name="biz_no")
	private String businessNo;

	@Column(name="reward_points")
	private int points;

	public User() {
	}

	public User(String id, String fName, String lName, String telNo, String businessNo, int points) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.telNo = telNo;
		this.businessNo = businessNo;
		this.points = points;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String getBusinessNo() {
		return businessNo;
	}

	public void setBusinessNo(String businessNo) {
		this.businessNo = businessNo;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}
}
