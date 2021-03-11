package com.cg.sams.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Course {
	@Id
	private Integer courseId;
	private String courseName;
	@OneToMany(mappedBy="course")
	private Student student;
	@OneToMany(mappedBy ="course")
	private StudyMaterial studyMaterial;
	@OneToOne(mappedBy = "course")
	private Teacher teacher;
	@OneToMany(mappedBy ="standard")
	private HomeWork homeWork;
	@ManyToMany(mappedBy = "course")
	private List<Standard> standard;
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public StudyMaterial getStudyMaterial() {
		return studyMaterial;
	}
	public void setStudyMaterial(StudyMaterial studyMaterial) {
		this.studyMaterial = studyMaterial;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public HomeWork getHomeWork() {
		return homeWork;
	}
	public void setHomeWork(HomeWork homeWork) {
		this.homeWork = homeWork;
	}
	public List<Standard> getStandard() {
		return standard;
	}
	public void setStandard(List<Standard> standard) {
		this.standard = standard;
	}
}
