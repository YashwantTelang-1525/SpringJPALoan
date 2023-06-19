<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>find loan by id</title>
        <link rel="stylesheet" href="bootstrap.min.css">
    </head>

    <body>

        <div class="container">
            <form action="loanPlanById">
                <table>
                    <tr>
                        <td>ID</td>
                        <td><input type="number" name="planID" id="planID"></td>
                    </tr>
                    <tr>
                        <td><input type="submit"></td>
                    </tr>
                </table>
            </form>

        </div>

    </body>

    </html>