package com.yashwant.cateloge.services;

import java.sql.Date;



import org.springframework.stereotype.Service;

@Service
public class LoanPlan {

	
	private int PlanId;
	private String PlanName;
	private int LoanTypeId;
	private int PrincipleAmount;
	private int Tenure;
	private double InterestRate;
	private int InterestAmount;
	private int TotalPayable;
	private double EMI;
	private Date PlanValidity;
	private String UpdatedReason;
	private Date PlanAddedOn;
	
	public int getPlanId() {
		return PlanId;
	}
	public void setPlanId(int planId) {
		PlanId = planId;
	}
	public String getPlanName() {
		return PlanName;
	}
	public void setPlanName(String planName) {
		PlanName = planName;
	}
	public int getLoanTypeId() {
		return LoanTypeId;
	}
	public void setLoanTypeId(int loanTypeId) {
		LoanTypeId = loanTypeId;
	}
	public int getPrincipleAmount() {
		return PrincipleAmount;
	}
	public void setPrincipleAmount(int principleAmount) {
		PrincipleAmount = principleAmount;
	}
	public int getTenure() {
		return Tenure;
	}
	public void setTenure(int tenure) {
		Tenure = tenure;
	}
	public double getInterestRate() {
		return InterestRate;
	}
	public void setInterestRate(double interestRate) {
		InterestRate = interestRate;
	}
	public int getInterestAmount() {
		return InterestAmount;
	}
	public void setInterestAmount(int interestAmount) {
		InterestAmount = interestAmount;
	}
	public int getTotalPayable() {
		return TotalPayable;
	}
	public void setTotalPayable(int totalPayable) {
		TotalPayable = totalPayable;
	}
	public double getEMI() {
		return EMI;
	}
	public void setEMI(double eMI) {
		EMI = eMI;
	}
	public Date getPlanValidity() {
		return PlanValidity;
	}
	public void setPlanValidity(Date planValidity) {
		PlanValidity = planValidity;
	}
	public String getUpdatedReason() {
		return UpdatedReason;
	}
	public void setUpdatedReason(String updatedReason) {
		UpdatedReason = updatedReason;
	}
	public Date getPlanAddedOn() {
		return PlanAddedOn;
	}
	public void setPlanAddedOn(Date planAddedOn) {
		PlanAddedOn = planAddedOn;
	}
	
	
	
}
