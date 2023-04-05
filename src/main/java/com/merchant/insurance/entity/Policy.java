package com.merchant.insurance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Policy {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "Policy_Number")
	private String policyNumber;

	@Column(name = "Policy_Type")
	private String policyType;

	@Column(name = "Coverage_Amount")
	private String coverageAmount;

	@Column(name = "Premium")
	private String premium;

	@Column(name = "START_DATE")
	private String startDate;

	@Column(name = "END_DATE")
	private String endDate;

	@Column(name = "client_id")
	private String clientId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public String getCoverageAmount() {
		return coverageAmount;
	}

	public void setCoverageAmount(String coverageAmount) {
		this.coverageAmount = coverageAmount;
	}

	public String getPremium() {
		return premium;
	}

	public void setPremium(String premium) {
		this.premium = premium;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

}
