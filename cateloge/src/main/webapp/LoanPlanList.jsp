<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 	 <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LoanPlan List</title>
<link rel="stylesheet" href="bootstrap.min.css">
            <link href="https://unpkg.com/tailwindcss@^1.0/dist/tailwind.min.css" rel="stylesheet">
        </head>
        <style>
            body {
                background-color: black;
            }
            
            tr:hover {
                background-color: cadetblue;
            }
        </style>

        

        <body>

            <div class="container">

                <section class="text-gray-600 body-font">
                    <div class="flex flex-col text-center w-full mb-15">
                        <h1 class="sm:text-3xl text-2xl font-medium title-font mb-4 text-gray-900">Comapnies list</h1>
                    </div>
                    <div class="container px-3 py-18 mx-auto flex flex-col">
                        <div class="lg:w-4/6 mx-auto">
                            <div class="rounded-lg h-64 overflow-hidden">
                                <img alt="content" class="object-cover object-center h-full w-full" src="https://source.unsplash.com/1200x500/?quotes">
                            </div>
                            <div class="flex flex-col sm:flex-row mt-10">
                            </div>
                        </div>
                        <table class="table table-bordered table-hover" style="color: white;">
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
                            <c:forEach  var="ln" items="${lsst}">
                                <tr>
                                    <td>${ln.PlanId}</td>
                                    <td>${ln.PlanName}</td>
                                    <td>${ln.LoanTypeId}</td>
                                    <td>${ln.PrincipleAmount}</td>
                                    <td>${ln.Tenure}</td>
                                    <td>${ln.InterestRate}</td>
                                    <td>${ln.InterestAmount}</td>
                                    <td>${ln.TotalPayable}</td>
                                    <td>${ln.EMI}</td>
                                    <td>${ln.PlanValidity}</td>
                                </tr>
                            </c:forEach>
                        </table>
                    </div>

                </section>
            </div>
        </body>


        </html>