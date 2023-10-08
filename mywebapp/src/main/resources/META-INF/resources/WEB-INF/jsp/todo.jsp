<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html style="margin-left:40%; margin-right:40%">
    <head>
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
        <title>Add Todo</title>
    </head>

    <body style="font-size:14pt;text-align:center;background-color:#3006A2;color: white;">
    <div class="container" style="background-color: #6267EF; margin-left:30%; margin-right: 30%; border-radius: 10px;padding:20px">
            <h1>Enter ToDo Details</h1>
             <div>
                <form method="post">
                    Description: <input type="text" name="description"/>
                    <input type="submit" class="btn btn-success"/>
                </form>
             </div>




            <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
            <script src="webjars/jquery/3.6.0/jquery.min.js"></script>

        </div>

    </body>
</html>