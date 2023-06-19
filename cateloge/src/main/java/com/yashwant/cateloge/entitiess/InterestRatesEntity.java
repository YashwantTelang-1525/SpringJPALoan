package com.yashwant.cateloge.entitiess;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.List;

import javax.persistence.Column;

@Entity
@Table(name = "baseinterestratesjpa") // added jpa in the last
public class InterestRatesEntity {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "loanType")
	private String loanType;

	@Column(name = "baseInterestRate")
	private Double baseInterestRate;

	public int getId() {
		return id;
	}

	public String getLoanType() {
		return loanType;
	}

	public Double getBaseInterestRate() {
		return baseInterestRate;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public void setBaseInterestRate(Double baseInterestRate) {
		this.baseInterestRate = baseInterestRate;
	}

}
