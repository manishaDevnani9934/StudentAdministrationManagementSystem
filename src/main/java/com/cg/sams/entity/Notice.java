package com.cg.sams.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Notice {
	@Id
	private Integer noticeId;
	private String noticeMessage;
	private LocalDate issueDateOfNotice;
	private LocalDate dateOfNotice;
	public Integer getNoticeId() {
		return noticeId;
	}
	public void setNoticeId(Integer noticeId) {
		this.noticeId = noticeId;
	}
	public String getNoticeMessage() {
		return noticeMessage;
	}
	public void setNoticeMessage(String noticeMessage) {
		this.noticeMessage = noticeMessage;
	}
	public LocalDate getDateOfNotice() {
		return dateOfNotice;
	}
	public void setDateOfNotice(LocalDate dateOfNotice) {
		this.dateOfNotice = dateOfNotice;
	}
	public LocalDate getIssueDateOfNotice() {
		return issueDateOfNotice;
	}
	public void setIssueDateOfNotice(LocalDate issueDateOfNotice) {
		this.issueDateOfNotice = issueDateOfNotice;
	}
}
