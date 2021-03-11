package com.cg.sams.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Standard {
	@Id
	private Integer standardId;
	private String standardName;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="standard_courses", joinColumns = @JoinColumn(name="courseId"),
	inverseJoinColumns = @JoinColumn(name="standardId"))
	private List<Course> course;
	public Integer getStandardId() {
		return standardId;
	}
	public void setStandardId(Integer standardId) {
		this.standardId = standardId;
	}
	public String getStandardName() {
		return standardName;
	}
	public void setStandardName(String standardName) {
		this.standardName = standardName;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
}
