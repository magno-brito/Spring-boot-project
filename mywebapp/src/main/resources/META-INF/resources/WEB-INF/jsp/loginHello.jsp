<html>
    <head>
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
        <title> My Second HTML page </title>
    </head>
    <body style="font-size:14pt;text-align:center;background-color:gray">
        <div class="container">
            <h1>This is my initial page</h1>
            <pre> ${errorMessage} </pre>
            <form method="post">
                Name: <input type="text" name="name"><br>
                Password: <input type="password" name="password"><br>
                <input type="submit" name="Submit">
            </form>
        </div>

            <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
            <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    </body>
</html>