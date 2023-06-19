package com.yashwant.cateloge.services;

import org.springframework.stereotype.Service;

@Service
public class LoanUser {
	
	private String uid;
	private String unm;
	private String pwd;
	
	public String getUid() {
		return uid;
	}
	public String getUnm() {
		return unm;
	}
	public String getPwd() {
		return pwd;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public void setUnm(String unm) {
		this.unm = unm;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
}
