package com.cg.sams.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class HomeWork {
	@Id
	private Integer homeWorkId;
	private LocalDate dateOfHomeWork;
	private String task;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Standard> standard;
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
	public List<Standard> getStandard() {
		return standard;
	}
	public void setStandard(List<Standard> standard) {
		this.standard = standard;
	}
	
}
