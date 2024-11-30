package com.jbk.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.jbk.enums.InterviewStatus;
@Entity
@Table(name = "interview")
public class Interview {

	@Id
	@Column(name = "id", nullable = false, unique = true)
	private long id;
	
	@Column(name = "student_id", nullable = false)
	private long studentId;
	
	@Column(name = "job_application_id", nullable = false)
	private long jobApplicationId;
	
	@Column(name = "interview_date",nullable = false)
	private Date interviewDate;

	@Column(name = "interview_status",nullable = false)
	private String interviewStatus = InterviewStatus.SCHEDULED.getValue();
	
	
	public Interview() {
		// TODO Auto-generated constructor stub
	}


	public Interview(long id, long studentId, long jobApplicationId, Date interviewDate, String interviewStatus) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.jobApplicationId = jobApplicationId;
		this.interviewDate = interviewDate;
		this.interviewStatus = interviewStatus;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public long getStudentId() {
		return studentId;
	}


	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}


	public long getJobApplicationId() {
		return jobApplicationId;
	}


	public void setJobApplicationId(long jobApplicationId) {
		this.jobApplicationId = jobApplicationId;
	}


	public Date getInterviewDate() {
		return interviewDate;
	}


	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}


	public String getInterviewStatus() {
		return interviewStatus;
	}


	public void setInterviewStatus(String interviewStatus) {
		this.interviewStatus = interviewStatus;
	}


	@Override
	public String toString() {
		return "Interview [id=" + id + ", studentId=" + studentId + ", jobApplicationId=" + jobApplicationId
				+ ", interviewDate=" + interviewDate + ", interviewStatus=" + interviewStatus + "]";
	}
	
	
	
}
