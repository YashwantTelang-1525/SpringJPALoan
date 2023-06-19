package com.yashwant.cateloge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.yashwant.cateloge.entitiess.InterestRatesEntity;
import com.yashwant.cateloge.entitiess.LoanPlanJPA;
import com.yashwant.cateloge.repositoriess.InterestRatesRepository;
import com.yashwant.cateloge.repositoriess.LoanPlanJPARepository;

@RestController
@RequestMapping("/loanplan/api")
public class APIController {
	
	@Autowired 
	private InterestRatesRepository repo;
	
	@Autowired
	private LoanPlanJPARepository loanPlanJPARepository;

	@GetMapping("/test")
	public String getMess() {
		return "this is api";
	}

	@GetMapping("/interestrate/all")
	@ResponseBody
	public List<InterestRatesEntity> getAllInterestRates(){
		List<InterestRatesEntity> list=repo.findAll();
		return list;
	}

	@PostMapping("/acc/add")
	public LoanPlanJPA addCompany(LoanPlanJPA obj) {
		loanPlanJPARepository.save(obj);
		System.out.println("saved");
		return obj;
	}
	
	
}
