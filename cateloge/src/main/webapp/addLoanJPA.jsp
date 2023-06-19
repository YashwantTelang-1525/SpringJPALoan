<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>Add Loan Plan</title>
        <link rel="stylesheet" href="bootstrap.min.css">
    </head>

    <body>
        <div class="container">
            <form action="loanSave" method="post">
                <table>
                    <tr>
                        <td>PlanId</td>
                        <td><input type="number" name="planId" id="PlanId" required class="form-control"></td>
                    </tr>
                    <tr>
                        <td>PlanName</td>
                        <td><input type="text" name="planName" id="PlanName" required class="form-control"></td>
                    </tr>
                    <tr>
                        <td>LoanTypeId</td>
                        <td><input type="number" name="loanTypeId" id="LoanTypeId" required class="form-control" min="1" max="4"></td>
                    </tr>
                    <tr>
                        <td>PrincipleAmount</td>
                        <td><input type="number" name="principleAmount" id="PrincipleAmount" required class="form-control"></td>
                    </tr>
                    <tr>
                        <td>Tenure</td>
                        <td><input type="number" name="tenure" id="Tenure" min="1" max="300" required class="form-control"></td>
                    </tr>
                    <tr>
                        <td>InterestRate</td>
                        <td> <select id="InterestRate" name="interestRate" class="form-control">
                            <option value=8.5>Home</option>
                            <option value=10>Personal</option>
                            <option value=7.5>Medical</option>
                            <option value=8.0>Vehicle</option>
                            </select>
                        </td>
                    </tr>
                    <!-- <tr>
                        <td>InterestAmount</td>
                        <td><input type="number" name="interestAmount" id="InterestAmount" required class="form-control"></td>
                    </tr> -->
                    <tr>
                        <td>EMI</td>
                        <td><input type="number" name="emi" id="EMI" required class="form-control"></td>
                    </tr>
                    <tr>
                        <td>PlanValidity</td>
                        <td><input type="date" class="date" name="planValidity" id="planValidity" required class="form-control" placeholder="dd-mm-yyyy"></td>
                    </tr>
                    <tr>
                        <td><input type="submit" class="btn btn-success"></td>
                    </tr>
                </table>
            </form>
        </div>
    </body>

    </html>