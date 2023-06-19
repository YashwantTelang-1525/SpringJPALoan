<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<h2>Product List</h2>
	<table>
		<tr>
			<th>ID</th>
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
		<c:forEach var="loan" items="${loanlist}">
			<tr>
				<td>${loan.planId}</td>
				<td>${loan.planName}</td>
				<td>${loan.loanTypeId}</td>
				<td>${loan.principleAmount}</td>
				<td>${loan.tenure}</td>
				<td>${loan.interestRate}</td>
				<td>${loan.interestAmount}</td>
				<td>${loan.totalPayable}</td>
				<td>${loan.emi}</td>
				<td>${loan.planValidity}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>