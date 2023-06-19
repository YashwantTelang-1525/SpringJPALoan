package com.yashwant.cateloge.services;

import org.springframework.stereotype.Service;

@Service
public class TestingJUnit {
	
	public String areRevEqual(String str) {
		String check = "";
		for(int i=str.length()-1; i>=0; i--) {
			check += str.charAt(i);
		}
		return check;
	}
}
