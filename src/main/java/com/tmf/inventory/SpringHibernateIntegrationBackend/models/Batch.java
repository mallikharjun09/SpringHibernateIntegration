package com.tmf.inventory.SpringHibernateIntegrationBackend.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
public class Batch {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int batchId;
	private int courseId;
	private Date startDate, endDate;
	
	public Batch() {}
	
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	public Batch(int courseId, Date startDate, Date endDate) {
		this.courseId = courseId;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	@Override
	public String toString() {
		return "Batch [batchId=" + batchId + ", courseId=" + courseId + ", startDate=" + startDate + ", endDate="
				+ endDate + "]";
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
