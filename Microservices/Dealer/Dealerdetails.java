package com.casestudy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Dealerdetails")
public class Dealerdetails {
	@Id
	private int id;
	private String dealerUsername;
	private String dealerPassword;
	private String dealerName;
	private String location;
	private int phnum;
	

	public Dealerdetails(int id, String dealerUsername, String dealerPassword, String dealerName, String location,
			int phnum) {
		super();
		this.id = id;
		this.dealerUsername = dealerUsername;
		this.dealerPassword = dealerPassword;
		this.dealerName = dealerName;
		this.location = location;
		this.phnum = phnum;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDealerUsername() {
		return dealerUsername;
	}
	public void setDealerUsername(String dealerUsername) {
		this.dealerUsername = dealerUsername;
	}
	public String getDealerPassword() {
		return dealerPassword;
	}
	public void setDealerPassword(String dealerPassword) {
		this.dealerPassword = dealerPassword;
	}
	public String getDealerName() {
		return dealerName;
	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPhnum() {
		return phnum;
	}
	public void setPhnum(int phnum) {
		this.phnum = phnum;
	}
	@Override
	public String toString() {
		return "Dealerdetails [id=" + id + ", dealerUsername=" + dealerUsername + ", dealerPassword=" + dealerPassword
				+ ", dealerName=" + dealerName + ", location=" + location + ", phnum=" + phnum + "]";
	}
}
