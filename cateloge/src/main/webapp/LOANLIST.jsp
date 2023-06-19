<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loan List</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body>
<div class="container">
<h2 class="display-5">Loan record</h2>

<table class="table table-bordered table-hover table-dark" style="color: white;">
<tr>
<th>PlanId</th>
<th>PlanName</th>
<th>LoanTypeId</th>
<th>PrincipleAmount</th>
<th>Tenure</th>
<th>InterestRate</th>
<th>InterestAmount</th>
<th>TotalPayable</th>
<th>EMI</th>
<th>PlanValidity</th>
</tr>



<%
Connection con;
PreparedStatement pst;
ResultSet rs;
try {
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loanplan?user=root&password=PAVILION@@1235");
pst=con.prepareStatement("select * from LoanPlans;");
rs=pst.executeQuery();
while(rs.next()) {

%>
<tr>
<td><%=rs.getInt("PlanId")%></td>
<td><%=rs.getString("PlanName")%></td>
<td><%=rs.getInt("LoanTypeId")%></td>
<td><%=rs.getInt("PrincipleAmount")%></td>
<td><%=rs.getDouble("InterestRate")%></td>
<td><%=rs.getInt("InterestAmount")%></td>
<td><%=rs.getInt("TotalPayable")%></td>
<td><%=rs.getInt("TotalPayable")%></td>
<td><%=rs.getDouble("EMI")%></td>
<td><%=rs.getDate("PlanValidity")%></td>

</tr>
<%


}
}
catch(Exception e){
 e.printStackTrace();
}
%>

</table>
<a href="adminPage">back</a>
</div>
</body>
</html>