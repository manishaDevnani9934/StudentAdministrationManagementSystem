package com.cg.sams.dto;

import java.time.LocalDate;

public class StudentDTO {
	private Integer studentId;
	private String firstName;
	private String lastName;
	private String gender;
	private String standard;
    private LocalDate dateOfBirth;
	private String address;
	private String emailId;
	private Long studentContactNo;
	private String guardianName;
	private Long guardianContactNo;
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Long getStudentContactNo() {
		return studentContactNo;
	}
	public void setStudentContactNo(Long studentContactNo) {
		this.studentContactNo = studentContactNo;
	}
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public Long getGuardianContactNo() {
		return guardianContactNo;
	}
	public void setGuardianContactNo(Long guardianContactNo) {
		this.guardianContactNo = guardianContactNo;
	}
	
}
