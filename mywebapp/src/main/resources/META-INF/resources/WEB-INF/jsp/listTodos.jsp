<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
        <title>List of To Dos</title>
    </head>
    <body style="font-size:14pt;text-align:center;background-color:#3006A2;color:white;">

    <nav class="navbar navbar-expand-md navbar-light bg-light ">
    	<div class="collapse navbar-collapse">
    		<ul class="navbar-nav">
    			<li class="nav-item"><a class="nav-link" href="/">Home</a></li>
    			<li class="nav-item"><a class="nav-link" href="/list-todos">ToDos</a></li>
    		</ul>
    	</div>
    	<ul class="navbar-nav">
    		<li class="nav-item"><a class="nav-link" href="/logout">Logout</a></li>
    	</ul>
    </nav>

    <div style="background-color: #6267EF;padding:20px">
            <h1>Welcome to my Spring Boot Course Project</h1>
             <div style="margin-top:20pt; margin-bottom:20pt"> <b><u>User: ${name}</u></b></div>
            <table class="table">
                <thead>
                    <tr>

                        <th>Description</th>
                        <th>Target Date</th>
                        <th>Is Done?</th>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${todos}" var="todo">
                    <tr >

                        <td>${todo.description}</td>
                        <td>${todo.targetDate}</td>
                        <td>${todo.done}</td>
                        <td> <a href="delete-todo?id=${todo.id}" class="btn btn-warning">Delete </a></td>
                        <td> <a href="update-todo?id=${todo.id}" class="btn btn-success">Update </a></td>
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