package com.yashwant.cateloge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yashwant.cateloge.entitiess.InterestRatesEntity;

import com.yashwant.cateloge.repositoriess.InterestRatesRepository;

@Service
public class InterestRateJPAService {
	
	@Autowired 
	private InterestRatesRepository interestRatesRepository;
	
	public List<InterestRatesEntity> getInterestRates() {
        return interestRatesRepository.findAll();
    }

}
