<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>interestList</title>
</head>
<body>

	<h2>Interest List</h2>
	<table>
		<tr>
			<th>id</th>
			<th>loanType</th>
			<th>baseInterestRates</th>
			
		</tr>

		<c:forEach var="list" items="${interestlist}">
			<tr>
				<td>${list.id}</td>
				<td>${list.baseInterestRate}</td>
				<td>${list.loanType}</td>
				
			</tr>
		</c:forEach>
	</table>

</body>
</html>