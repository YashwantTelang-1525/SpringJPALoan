package com.yashwant.cateloge.controllers;


import java.util.List;
import java.util.Optional;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yashwant.cateloge.entitiess.InterestRatesEntity;
import com.yashwant.cateloge.entitiess.LoanPlanJPA;
import com.yashwant.cateloge.models.LoanPlanOperation;
import com.yashwant.cateloge.repositoriess.InterestRatesRepository;
import com.yashwant.cateloge.repositoriess.LoanPlanJPARepository;
import com.yashwant.cateloge.services.InterestRateJPAService;
import com.yashwant.cateloge.services.LoanPlan;
import com.yashwant.cateloge.services.LoanPlanJPAService;
import com.yashwant.cateloge.services.LoanUser;




@Controller
@ComponentScan(basePackages= {"com.yashwant.cateloge.models"})
public class YaarController {
	
	@Autowired
	LoanPlanOperation lop;
	
	@Autowired
	private LoanPlanJPAService loanplanjpaservice;
	
	@Autowired
	LoanPlanJPARepository loanjparepo;
	
	@Autowired
	InterestRatesRepository interestratesrepository;
	
	@Autowired
	InterestRateJPAService interestRateJPAService;
	
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/homePage")
	public String homeUser() {
		return "homePage";
	}
	
	@RequestMapping("/addLoanPlans")
	public String addPlanForm(){
		return "addLoanPlan";
	}
	
	@RequestMapping("/updatelopn")
	public String UpdateLoanPlanPage() {
		return "UpdateLoanPlans";
	}
	
	@RequestMapping("/register")
	public String userRegister() {
		return "registeruser";
	}
	
	@RequestMapping("/logout")
	public String logOut() {
		return "index";
	}
	
	@RequestMapping("adminPage")
	public String backadminpage(){
		return "adminPage";
	}
	
	@RequestMapping("findLoanById")
	public String findloanIDpage() {
		return "findLoanById";
	}
	
	@RequestMapping("loanSavejsp")
	public String addloanjpa() {
		return "addLoanJPA";
	}
	
	@RequestMapping("/addUser")
	public String addAccount(LoanUser obj) {
		String state = lop.addUser(obj);
		String page = "";
		if(state.equals("Success"))
			page="userAdded";
		else
			page="userAddError";
		return page;
	}
	
	@RequestMapping("/checkLogin")
	public String checkLogin(LoanUser obj) {
		String isValid = lop.checkLoanUser(obj);
		String check="";
		
		if(isValid.equals("user"))
			check="homePage";
		else if(isValid.equals("admin"))
			check="adminPage";
		else
			check="logInFail";
		return check;
	}
	
	
	@RequestMapping("/addPlan")
	public String addingPlan(LoanPlan LP) {
		String st = lop.addLoanPlan(LP);
		String page = "";
		
		if(st.equals("Success")) 
			page="loanPlanAdded";
		else
			page="loanPlanAddError";
		return page;
	}
	
	
	@RequestMapping("/updateLoanPlans")
	public String updatedCompData(LoanPlan lp) {
		String p="";
		String rs=lop.updateLoanPlan(lp);
		if(rs.equals("Success")) 
			p="loanUpdated";
		
		else 
			p="loanUpdateFail";
		return p;
	}
	
	@RequestMapping("/loanlist")
	public ModelAndView compList() {
		ModelAndView mv=new ModelAndView();
		List<LoanPlan> list=lop.getLoanPlanList();
		mv.addObject("lsst", list);
		mv.setViewName("plans");
		return mv;
	}
	
	@PostMapping("/loanSave")
	public String saveLoanPlanJPA(LoanPlanJPA loanPlanJPA) {
	    loanPlanJPA.setTotalPayable((int) (loanPlanJPA.getPrincipleAmount() + ((1 + loanPlanJPA.getInterestRate()) * loanPlanJPA.getTenure())));
	    loanPlanJPA.setPlanAddedOn(new Date());
	    LoanPlanJPA updatedLoanPlan = loanplanjpaservice.calculateInterestAmount(loanPlanJPA);
	    System.out.println(updatedLoanPlan);
	    loanjparepo.save(updatedLoanPlan);
	    return "successPage";
	}



	
	@RequestMapping("/loans")
	public ModelAndView getAllLoans() {

		List<LoanPlanJPA> loanList = loanplanjpaservice.getAllProducts();
		ModelAndView modelAndView = new ModelAndView("loanlistJPA");
		
		modelAndView.addObject("loanlist", loanList);
		return modelAndView;
	}
	
	@RequestMapping("/listOfInterestRates")
	public ModelAndView getInterestRates() {

		List<InterestRatesEntity> interestList = interestRateJPAService.getInterestRates();
		ModelAndView modelAndView = new ModelAndView("interestlistJPA");
		
		modelAndView.addObject("interestlist", interestList);
		return modelAndView;
	}
	
	@RequestMapping("/loanPlanById")
	public ModelAndView getLoanByID(int planID) {
	    Optional<LoanPlanJPA> loanOptional = loanjparepo.findById(planID);
	    
	   
	        LoanPlanJPA loan = loanOptional.get();
	        System.out.println(loan);
	        
	        ModelAndView modelAndView = new ModelAndView("loanplanjpaID");
	        modelAndView.addObject("loan", loan);
	        
	        System.out.print("Executed!");
	        return modelAndView;
	   
	}
}
