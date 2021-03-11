package com.cg.sams.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Staff {
	@Id
	private Integer staffId;
	private String firstName;
	private String lastName;
	private String gender;
	private LocalDate dateOfBirth;
	private LocalDate dateOfJoining;
	private String address;
	private String designation;
	private Long staffContactNo;
	@OneToOne
	private StaffLogin staffLogin;
	public Integer getStaffId() {
		return staffId;
	}
	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
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
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Long getStaffContactNo() {
		return staffContactNo;
	}
	public void setStaffContactNo(Long staffContactNo) {
		this.staffContactNo = staffContactNo;
	}
	public StaffLogin getStaffLogin() {
		return staffLogin;
	}
	public void setStaffLogin(StaffLogin staffLogin) {
		this.staffLogin = staffLogin;
	}
}
