<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>Update loan plan</title>
        <link rel="stylesheet" href="bootstrap.min.css">
    </head>

    <body>
        <div class="container">
            <h2>Update a Loan Plan</h2>
            <hr>
            <form action="updateLoanPlans" method="post">
                <table>
                    <tr>
                        <td>PlanId</td>
                        <td><input type="number" name="PlanId" id="PlanId" required class="form-control"></td>
                    </tr>
                    <tr>
                        <td>PlanName</td>
                        <td><input type="text" name="PlanName" id="PlanName" required class="form-control"></td>
                    </tr>


                    <tr>
                        <td>Tenure</td>
                        <td><input type="number" name="Tenure" id="Tenure" min="1" max="300" required class="form-control"></td>
                    </tr>
                    <tr>
                        <td>InterestRate</td>
                        <td><input type="number" name="InterestRate" id="InterestRate" required class="form-control"></td>
                    </tr>
                    <tr>
                        <td>InterestAmount</td>
                        <td><input type="number" name="InterestAmount" id="InterestAmount" required class="form-control"></td>
                    </tr>
                    <tr>
                        <td>EMI</td>
                        <td><input type="number" name="EMI" id="EMI" required class="form-control"></td>
                    </tr>
                    <tr>
                        <td>PlanValidity</td>
                        <td><input type="date" name="PlanValidity" id="PlanValidity" required class="form-control"></td>
                    </tr>
                    <tr>
                        <td>UpdatedReason</td>
                        <td><input type="text" name="UpdatedReason" id="UpdatedReason" required class="form-control"></td>
                    </tr>
                    <tr>
                        <td><input type="submit" class="btn btn-success"></td>
                    </tr>
                </table>
            </form>
            <a href="adminPage">back</a>
        </div>
    </body>

    </html>