package com.cg.sams.dto;

public class StaffLogin {
	private String staffId;
	private String password;
	public String getUserName() {
		return staffId;
	}
	public void setUserName(String userName) {
		this.staffId = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
