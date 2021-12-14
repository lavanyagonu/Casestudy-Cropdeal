package com.casestudy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="Farmerdetails")
public class Farmerdetails {
	@Id
	private int id;
	private String farmerUsername;
	private String farmerPassword;
	private String farmerName;
	private String location;
	private int phnum;
	
	
	public Farmerdetails(int id, String farmerUsername, String farmerPassword, String farmerName, String location,
			int phnum) {
		super();
		this.id = id;
		this.farmerUsername = farmerUsername;
		this.farmerPassword = farmerPassword;
		this.farmerName = farmerName;
		this.location = location;
		this.phnum = phnum;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFarmerUsername() {
		return farmerUsername;
	}
	public void setFarmerUsername(String farmerUsername) {
		this.farmerUsername = farmerUsername;
	}
	public String getFarmerPassword() {
		return farmerPassword;
	}
	public void setFarmerPassword(String farmerPassword) {
		this.farmerPassword = farmerPassword;
	}
	public String getFarmerName() {
		return farmerName;
	}
	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
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
		return "Farmerdetails [id=" + id + ", farmerUsername=" + farmerUsername + ", farmerPassword=" + farmerPassword+",farmerName="+ farmerName+",location="+location+",phnum="+phnum+"]";
}
}