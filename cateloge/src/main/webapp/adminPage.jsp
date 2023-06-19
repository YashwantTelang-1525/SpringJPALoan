<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>adminPage</title>
        <link rel="stylesheet" href="bootstrap.min.css">
    </head>

    <body>
        <div class="container">
            <h3>Bank Manager</h3>
            <a href="logout" style="text-align: right; justify-content: right; margin-right: 0px;">logout</a>
            <hr>
            <a href="addLoanPlans">create new loan plan</a><br>
            <a href="updatelopn">update existing loan plans</a><br>
            <a href="loanlist">view loan plans</a><br>
            <a href="loanSavejsp">loan save jpa</a><br>
            <a href="loans">show loans jpa</a><br>
            <a href="findLoanById">get(jpa) plan By id</a><br>
            <a href="listOfInterestRates">get interestRate JPA</a><br>
        </div>
    </body>

    </html>