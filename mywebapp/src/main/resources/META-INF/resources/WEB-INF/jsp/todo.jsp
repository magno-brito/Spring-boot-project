<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html >
    <head>
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
        <title>Add Todo</title>
    </head>

    <body style="font-size:14pt;text-align:center;background-color:#3006A2;color: white;">

     <nav class="navbar navbar-expand-md navbar-light bg-light " >
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

    <div  style="background-color: #6267EF">
            <h1>Enter ToDo Details</h1>
             <div>
                <form:form method="post" modelAttribute="todo">
                    <div style="padding:20pt;">
                        <form:label path="description">Description</form:label>
                        <form:input type="text" path="description" required="required" />

                    </div>

                     <div style="padding:5pt;">
                            <form:label path="targetDate">Target Date</form:label>
                            <form:input type="text" path="targetDate" id="targetDate" required="required" />

                     </div>
                    <form:input type="hidden" path="done"/>
                    <form:input type="hidden" path="id"/>
                    <input type="submit" class="btn btn-success" value="Submit"/>
                </form:form>
             </div>




            <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
            <script src="webjars/jquery/3.6.0/jquery.min.js"></script>


        </div>

    </body>
</html>