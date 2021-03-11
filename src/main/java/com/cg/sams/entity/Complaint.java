package com.cg.sams.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Complaint {
	@Id
	private Integer complaintId;
	private String complainMessage;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="complain_students", joinColumns = @JoinColumn(name="complainId"),
	inverseJoinColumns = @JoinColumn(name="studentId"))
	private List<Student> student;
	public Integer getComplaintId() {
		return complaintId;
	}
	public void setComplaintId(Integer complaintId) {
		this.complaintId = complaintId;
	}
	public String getComplainMessage() {
		return complainMessage;
	}
	public void setComplainMessage(String complainMessage) {
		this.complainMessage = complainMessage;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}	
}
