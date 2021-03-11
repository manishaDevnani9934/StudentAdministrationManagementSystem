package com.cg.sams.dto;

import java.time.LocalDate;

public class NoticeDTO {
	private Integer noticeId;
	private String noticeMessage;
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
}
