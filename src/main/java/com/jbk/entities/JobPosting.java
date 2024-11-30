package com.jbk.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job_posting")
public class JobPosting {

	@Id
	@Column(name = "id", nullable = false, unique = true)
	private long id;

	@Column(name = "job_title", nullable = false)
	private String jobTitle;

	@Column(name = "company_name", nullable = false)
	private String companyName;

	@Column(name = "job_description", nullable = false)
	private String jobDescription;

	@Column(name = "job_location", nullable = false)
	private String jobLocation;

	@Column(name = "eligibility_criteria", nullable = false)
	private String eligibilityCriteria;

	public JobPosting() {
		// TODO Auto-generated constructor stub
	}

	public JobPosting(long id, String jobTitle, String companyName, String jobDescription, String jobLocation,
			String eligibilityCriteria) {
		super();
		this.id = id;
		this.jobTitle = jobTitle;
		this.companyName = companyName;
		this.jobDescription = jobDescription;
		this.jobLocation = jobLocation;
		this.eligibilityCriteria = eligibilityCriteria;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getJobLocation() {
		return jobLocation;
	}

	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}

	public String getEligibilityCriteria() {
		return eligibilityCriteria;
	}

	public void setEligibilityCriteria(String eligibilityCriteria) {
		this.eligibilityCriteria = eligibilityCriteria;
	}

	@Override
	public String toString() {
		return "JobPosting [id=" + id + ", jobTitle=" + jobTitle + ", companyName=" + companyName + ", jobDescription="
				+ jobDescription + ", jobLocation=" + jobLocation + ", eligibilityCriteria=" + eligibilityCriteria
				+ "]";
	}

}
