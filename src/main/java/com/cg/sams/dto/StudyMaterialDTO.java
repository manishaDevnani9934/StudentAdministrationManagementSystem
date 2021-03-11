package com.cg.sams.dto;

public class StudyMaterialDTO {
	private Integer studyMaterialId;
	private String title;
	private String description;
	//  private Course course;
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
}
