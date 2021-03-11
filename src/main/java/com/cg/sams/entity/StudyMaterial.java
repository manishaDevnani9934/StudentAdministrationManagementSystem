package com.cg.sams.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class StudyMaterial {
	@Id
	private Integer studyMaterialId;
	private String title;
	private String description;
	@ManyToOne(cascade = CascadeType.ALL)
	private List<Course> course;
	public Integer getStudyMaterialId() {
		return studyMaterialId;
	}
	public void setStudyMaterialId(Integer studyMaterialId) {
		this.studyMaterialId = studyMaterialId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
}
