package com.cg.sams.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Teacher {
	@Id
	private Integer teacherId;
	private String firstName;
	private String lastName;
	private String gender;
	private LocalDate dateOfBirth;
	private LocalDate dateOfJoining;
	private String address;
	private String qualification;
	private Long teacherContactNo;
	@OneToOne
	private Course course;
	@OneToOne
	private TeacherLogin teacherLogin;
	public Integer getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(Integer teacherId) {
		this.teacherId = teacherId;
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
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public Long getTeacherContactNo() {
		return teacherContactNo;
	}
	public void setTeacherContactNo(Long teacherContactNo) {
		this.teacherContactNo = teacherContactNo;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public TeacherLogin getTeacherLogin() {
		return teacherLogin;
	}
	public void setTeacherLogin(TeacherLogin teacherLogin) {
		this.teacherLogin = teacherLogin;
	}
}
