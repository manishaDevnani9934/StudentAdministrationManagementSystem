package com.cg.sams.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Student {
	@Id
	private Integer studentId;
	private String firstName;
	private String lastName;
	private String gender;
	private LocalDate dateOfBirth;
	private String address;
	private String emailId;
	private Long studentContactNo;
	private String guardianName;
	private Long guardianContactNo;
	@ManyToOne(cascade = CascadeType.ALL)
	private List<Course> course;
	@ManyToMany(mappedBy ="student")
	private Complaint complaint;
	@OneToOne
	private StudentLogin studentLogin;
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
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	public Complaint getComplaint() {
		return complaint;
	}
	public void setComplaint(Complaint complaint) {
		this.complaint = complaint;
	}
	public StudentLogin getStudentLogin() {
		return studentLogin;
	}
	public void setStudentLogin(StudentLogin studentLogin) {
		this.studentLogin = studentLogin;
	}
}
