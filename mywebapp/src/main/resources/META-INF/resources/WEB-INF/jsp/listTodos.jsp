<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html style="margin-left:40%; margin-right:40%">
    <head>
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
        <title>List of To Dos</title>
    </head>
    <body style="font-size:14pt;text-align:center;background-color:#3006A2;color: white;">

    <div class="container" style="background-color: #6267EF; margin-left:30%; margin-right: 30%; border-radius: 10px;padding:20px">
            <h1>Welcome to my Spring Boot Course Project</h1>
             <div> User: ${name} </div>
            <table class="table">
                <thead>
                    <tr>
                        <th>id</th>
                        <th>Description</th>
                        <th>Target Date</th>
                        <th>Is Done?</th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${todos}" var="todo">
                    <tr >
                        <td>${todo.id}</td>
                        <td>${todo.description}</td>
                        <td>${todo.targetDate}</td>
                        <td>${todo.done}</td>
                        <td> <a href="delete-todo?id=${todo.id}" class="btn btn-warning">DELETE ${todo.id}</a></td>
                    </tr>
                    </c:forEach>

                </tbody>

            </table>

            <a href="add-todo" class="btn btn-success">Add ToDo</a>

            <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
            <script src="webjars/jquery/3.6.0/jquery.min.js"></script>

        </div>

    </body>
</html>