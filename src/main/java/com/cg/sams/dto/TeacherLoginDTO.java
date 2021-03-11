package com.cg.sams.dto;

public class TeacherLoginDTO {
	private String teacherId;
	private String password;
	public String getUserName() {
		return teacherId;
	}
	public void setUserName(String userName) {
		this.teacherId = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
