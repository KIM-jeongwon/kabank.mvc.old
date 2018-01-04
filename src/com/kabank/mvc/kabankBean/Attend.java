package com.kabank.mvc.kabankBean;
public class Attend {
	private String id, week, status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Attend [id=" + id + ", week=" + week + ", status=" + status + "]";
	}
}
