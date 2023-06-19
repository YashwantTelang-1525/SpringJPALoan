<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>register user</title>
        <link rel="stylesheet" href="bootstrap.min.css">
    </head>

    <body>

        <div class="container">
            <h2>Register Yourself</h2>
            <hr>
            <form action="addUser" method="post">
                <table>
                    <tr>
                        <td>User Id</td>
                        <td><input type="text" name="uid" id="uid" required class="form-control"></td>
                    </tr>
                    <tr>
                        <td>User name</td>
                        <td><input type="text" name="unm" id="unm" required class="form-control"></td>
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
            <a href="./">login</a>
        </div>

    </body>

    </html>