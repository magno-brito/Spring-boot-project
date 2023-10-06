<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
        <title>List of To Dos</title>
    </head>
    <body style="font-size:14pt;text-align:center;background-color:gray">

    <div class="container">
            <h1>Welcome to my Spring Boot Course Project</h1>
             <div> User: ${name} </div>
            <table class="table">
                <thead>
                    <tr>
                        <th>id</th>
                        <th>Description</th>
                        <th>Target Date</th>
                        <th>Is Done?</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${todos}" var="todo">
                    <tr >
                        <td>${todo.id}</td>
                        <td>${todo.description}</td>
                        <td>${todo.targetDate}</td>
                        <td>${todo.done}</td>
                    </tr>
                    </c:forEach>

                </tbody>

            </table>
            <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
            <script src="webjars/jquery/3.6.0/jquery.min.js"></script>

        </div>

    </body>
</html>