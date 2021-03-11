package com.cg.sams.dto;

import java.time.LocalDate;

public class HomeWorkDTO {
	private Integer homeWorkId;
	private LocalDate dateOfHomeWork;
	//private Course course;
	private String task;
	public Integer getHomeWorkId() {
		return homeWorkId;
	}
	public void setHomeWorkId(Integer homeWorkId) {
		this.homeWorkId = homeWorkId;
	}
	public LocalDate getDateOfHomeWork() {
		return dateOfHomeWork;
	}
	public void setDateOfHomeWork(LocalDate dateOfHomeWork) {
		this.dateOfHomeWork = dateOfHomeWork;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
}
