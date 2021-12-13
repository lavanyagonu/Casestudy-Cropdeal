package com.casestudy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="Admindetails")
public class Admindetails {
	
	@Id
	private int id;
	private String adminUsername;
	private String adminPassword;
	private String adminName;
	private String adminEmail;
	private int phnum;
	
	public Admindetails(int id, String adminUsername, String adminPassword, String adminName, String adminEmail,
			int phnum) {
		super();
		this.id = id;
		this.adminUsername = adminUsername;
		this.adminPassword = adminPassword;
		this.adminName = adminName;
		this.adminEmail = adminEmail;
		this.phnum = phnum;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdminUsername() {
		return adminUsername;
	}
	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public int getPhnum() {
		return phnum;
	}
	public void setPhnum(int phnum) {
		this.phnum = phnum;
	}
	@Override
	public String toString() {
		return "Admindetails [id=" + id + ", adminUsername=" + adminUsername + ", adminPassword=" + adminPassword
				+ ", adminName=" + adminName + ", adminEmail=" + adminEmail + ", phnum=" + phnum + "]";
	}
}
