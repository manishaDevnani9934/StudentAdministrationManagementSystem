package com.cg.sams.dto;

public class StudentLoginDTO {
	private String studentId;
	private String password;
	public String getUserName() {
		return studentId;
	}
	public void setUserName(String userName) {
		this.studentId = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
