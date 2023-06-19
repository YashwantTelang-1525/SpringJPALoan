package com.yashwant.cateloge.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.yashwant.cateloge.services.LoanPlan;
import com.yashwant.cateloge.services.LoanUser;





@Service
public class LoanPlanOperation {

	public String addUser(LoanUser user) {

		Connection con;
		PreparedStatement pst;
		String status = "";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/loanplan?user=root&password=PAVILION@@1235");
			pst = con.prepareStatement("insert into loanuser values(?,?,?,?)");
			pst.setString(1, user.getUid());
			pst.setString(2, user.getUnm());
			pst.setString(3, user.getPwd());
			pst.setString(4, "user");
			pst.executeUpdate();
			con.close();
			status = "Success";
		} catch (Exception e) {
			status = "Error";
		}
		return status;
	}

	public String checkLoanUser(LoanUser user) {
		String isuser = "";

		Connection con;
		PreparedStatement pst;
		ResultSet rs;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					//"jdbc:mysql://bhp0xkdgodic9mksnvzs-mysql.services.clever-cloud.com:3306/bhp0xkdgodic9mksnvzs?user=ujgojvjs7oupb22g&password=FW9FCTN0EhTvPBjSxi6z"
					"jdbc:mysql://localhost:3306/loanplan?user=root&password=PAVILION@@1235");
			pst = con.prepareStatement("select * from loanuser where uid=? and pwd=?");
			pst.setString(1, user.getUid());
			pst.setString(2, user.getPwd());
			rs = pst.executeQuery();

			if (rs.next()) {
				if (rs.getString("usertype").equals("admin")) {
					isuser = "admin";
				} else {
					isuser = "user";
				}
			} else {
				isuser = "false";
			}
		} catch (Exception e) {
			System.out.println(e);
		}

		return isuser;
	}

	public String addLoanPlan(LoanPlan obj) {
		System.out.println("jjjj");
		String status;
		Connection con;
		PreparedStatement pst;
		
		try {
			 java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
			
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(
					//"jdbc:mysql://bhp0xkdgodic9mksnvzs-mysql.services.clever-cloud.com:3306/bhp0xkdgodic9mksnvzs?user=ujgojvjs7oupb22g&password=FW9FCTN0EhTvPBjSxi6z"
					"jdbc:mysql://localhost:3306/loanplan?user=root&password=PAVILION@@1235");
			pst = con.prepareStatement("insert into LoanPlans values(?,?,?,?,?,?,?,?,?,?,?)");
			pst.setInt(1, obj.getPlanId());
			pst.setString(2, obj.getPlanName());
			pst.setInt(3, obj.getLoanTypeId());
			pst.setInt(4, obj.getPrincipleAmount());
			pst.setInt(5, obj.getTenure());
			pst.setDouble(6, obj.getInterestRate());
			pst.setInt(7, obj.getInterestAmount());
			pst.setInt(8, (int)(obj.getPrincipleAmount()*Math.pow((obj.getInterestAmount()+1), (obj.getTenure()/12))));
			pst.setDouble(9, obj.getEMI());
			pst.setDate(10, obj.getPlanValidity());
			pst.setDate(11, date);
			System.out.println("reach upto excute");
			pst.executeUpdate();
			con.close();
			status="Success";
			System.out.println("reach upto excute");
		}
		catch(Exception e) {
			System.out.println(e);
			status="Error";
		}
		return status;
	}
	
	
	public String updateLoanPlan(LoanPlan obj) {
	    String st = "";
	    Connection con = null;
	    PreparedStatement pst = null;
	    PreparedStatement pst1 = null;
	    try {
	        
	        Class.forName("com.mysql.cj.jdbc.Driver");

	        con = DriverManager.getConnection(//"jdbc:mysql://bhp0xkdgodic9mksnvzs-mysql.services.clever-cloud.com:3306/bhp0xkdgodic9mksnvzs?user=ujgojvjs7oupb22g&password=FW9FCTN0EhTvPBjSxi6z"
	        		"jdbc:mysql://localhost:3306/loanplan?user=root&password=PAVILION@@1235");

	        pst = con.prepareStatement("UPDATE LoanPlans SET PlanName=?, Tenure=?, InterestRate=?, InterestAmount=?, EMI=?, PlanValidity=? WHERE PlanId=?");
	        pst1 = con.prepareStatement("INSERT INTO LoanPlansHistory(UpdatedDate, UpdatedReason, LoanPlanId) VALUES (?, ?, ?)");
	        
	        pst.setString(1, obj.getPlanName());
	        pst.setInt(2, obj.getTenure());
	        pst.setDouble(3, obj.getInterestRate());
	        pst.setInt(4, obj.getInterestAmount());
	        pst.setDouble(5, obj.getEMI());
	        pst.setDate(6, obj.getPlanValidity());
	        pst.setInt(7, obj.getPlanId());
	        
	        java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
	        pst1.setDate(1, date);
	        pst1.setString(2, obj.getUpdatedReason());
	        pst1.setInt(3, obj.getPlanId());
	        System.out.println("reach");
	       
	        pst.executeUpdate();
	        pst1.executeUpdate();
	        
	        st = "Success";
	    }
	    
	    catch (Exception e) {
	    	System.out.println(e);
	    } 
	    
	    return st;
	}
	
public ArrayList<LoanPlan> getLoanPlanList(){
		
		ArrayList<LoanPlan> lst = new ArrayList<>();
		LoanPlan loan=new LoanPlan();
		
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
	            con = DriverManager.getConnection(//"jdbc:mysql://bhp0xkdgodic9mksnvzs-mysql.services.clever-cloud.com:3306/bhp0xkdgodic9mksnvzs?user=ujgojvjs7oupb22g&password=FW9FCTN0EhTvPBjSxi6z"
	            		"jdbc:mysql://localhost:3306/loanplan?user=root&password=PAVILION@@1235");
				pst=con.prepareStatement("select * from LoanPlans;");
				rs=pst.executeQuery();
				while(rs.next()) {
					loan=new LoanPlan();
					
					loan.setPlanId(rs.getInt("PlanId"));
					loan.setPlanName(rs.getString("PlanName"));
					loan.setLoanTypeId(rs.getInt("LoanTypeId"));
					loan.setPrincipleAmount(rs.getInt("PrincipleAmount"));
					loan.setTenure(rs.getInt("Tenure"));
					loan.setInterestRate(rs.getDouble("InterestRate"));
					loan.setInterestAmount(rs.getInt("InterestAmount"));
					loan.setTotalPayable(rs.getInt("TotalPayable"));
					loan.setEMI(rs.getDouble("EMI"));
					loan.setPlanValidity(rs.getDate("PlanValidity"));
					
					
					System.out.println("setted");
					lst.add(loan);			
					System.out.println("obj added");
					}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return lst;
	}
	
}
