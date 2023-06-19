<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>home</title>
        <link rel="stylesheet" href="bootstrap.min.css">
    </head>

    <body>
        <div class="container">
            <h2>Loan Application</h2>
            <hr>
            <form action="checkLogin" method="post">
                <table>
                    <tr>
                        <td>User Id</td>
                        <td><input type="text" name="uid" id="uid" required class="form-control"></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="pwd" id="pwd" required class="form-control"></td>
                    </tr>
                    <tr>
                        <td><input type="submit" class="btn btn-success"></td>
                    </tr>
                </table>
            </form>
            <a href="register">register</a>
        </div>
    </body>

    </html>