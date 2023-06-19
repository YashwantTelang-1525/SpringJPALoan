package com.yashwant.cateloge.entitiess;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "loanPlansJPA")
public class LoanPlanJPA {

	@Id
	private int planId;
	private String planName;
	private int loanTypeId;
	private int principleAmount;
	private int tenure;
	private double interestRate;
	private int interestAmount;
	private int totalPayable;
	private double emi;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date planValidity;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date planAddedOn;

	@Override
	public String toString() {
		return "LoanPlanJPA [planId=" + planId + ", planName=" + planName + ", loanTypeId=" + loanTypeId
				+ ", principleAmount=" + principleAmount + ", tenure=" + tenure + ", interestRate=" + interestRate
				+ ", interestAmount=" + interestAmount + ", totalPayable=" + totalPayable + ", emi=" + emi
				+ ", planValidity=" + planValidity + ", planAddedOn=" + planAddedOn + "]";
	}

	public LoanPlanJPA() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoanPlanJPA(int planId, String planName, int loanTypeId, int principleAmount, int tenure,
			double interestRate, int interestAmount, int totalPayable, double emi, Date planValidity,
			Date planAddedOn) {
		super();
		this.planId = planId;
		this.planName = planName;
		// this.loanTypeId = loanTypeId;
		this.principleAmount = principleAmount;
		this.tenure = tenure;
		this.interestRate = interestRate;
		this.interestAmount = interestAmount;
		this.totalPayable = totalPayable;
		this.emi = emi;
		this.planValidity = planValidity;

		this.planAddedOn = planAddedOn;
	}

	public int getPlanId() {
		return planId;
	}

	public void setPlanId(int planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public int getLoanTypeId() {
		return loanTypeId;
	}

	public void setLoanTypeId(int loanTypeId) {
		this.loanTypeId = loanTypeId;
	}

	public int getPrincipleAmount() {
		return principleAmount;
	}

	public void setPrincipleAmount(int principleAmount) {
		this.principleAmount = principleAmount;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public int getInterestAmount() {
		return interestAmount;
	}

	public void setInterestAmount(int interestAmount) {
		this.interestAmount = interestAmount;
	}

	public int getTotalPayable() {
		return totalPayable;
	}

	public void setTotalPayable(int totalPayable) {
		this.totalPayable = totalPayable;
	}

	public double getEmi() {
		return emi;
	}

	public void setEmi(double emi) {
		this.emi = emi;
	}

	public Date getPlanValidity() {
		return planValidity;
	}

	public void setPlanValidity(Date planValidity) {
		this.planValidity = planValidity;
	}

	public Date getPlanAddedOn() {
		return planAddedOn;
	}

	public void setPlanAddedOn(Date planAddedOn) {
		this.planAddedOn = planAddedOn;
	}


}
