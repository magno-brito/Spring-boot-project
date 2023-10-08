<html>
    <head>
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
        <title> Welcome Page</title>
    </head>
    <body style="font-size:14pt;text-align:center;background-color:#3006A2;color: white;">
        <div class="container" style="background-color: #6267EF; margin-left:30%; ">
            <h1>Welcome to my Spring Boot Course Project</h1>
            <p> Your name: ${name} </p>
            <p> Your password: ${password} </p>
            <div>
                <a href="list-todos"> Manage your todos </a>

            </div>
        </div>

        <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.0/jquery.min.js"></script>

    </body>
</html>