package com.yashwant.cateloge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yashwant.cateloge.entitiess.InterestRatesEntity;
import com.yashwant.cateloge.entitiess.LoanPlanJPA;
import com.yashwant.cateloge.repositoriess.InterestRatesRepository;
import com.yashwant.cateloge.repositoriess.LoanPlanJPARepository;

@Service
public class LoanPlanJPAService {

	@Autowired
	private LoanPlanJPARepository loanplanjparepo;

	@Autowired
	private InterestRatesRepository interestRatesRepository;

	public List<LoanPlanJPA> getAllProducts() {
		return loanplanjparepo.findAll();
	}

	public LoanPlanJPA calculateInterestAmount(LoanPlanJPA loanPlan) {
	    double interestRate = loanPlan.getInterestRate();
	    int tenure = loanPlan.getTenure();
	    double principleAmount = loanPlan.getPrincipleAmount();

	    if (tenure <= 20 && interestRate == 10.0) {
	        interestRate += 0.2 * tenure;
	    } else if (tenure <= 30 && interestRate == 8.5) {
	        interestRate += 0.3 * tenure;
	    } else if (interestRate == 7.5 || interestRate == 8.0) {
	        interestRate += 0.25 * tenure;
	    }

	    double interestAmount = (principleAmount * tenure * interestRate) / 100;

	    loanPlan.setInterestAmount((int) interestAmount);

	    return loanPlan;
	}


}
