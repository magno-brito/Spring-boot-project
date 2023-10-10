<html>
    <head>
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
        <title> Welcome Page</title>
    </head>
    <body style="font-size:14pt;text-align:center;background-color:#3006A2;color: white;">
     <nav class="navbar navbar-expand-md navbar-light bg-light">
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
        <div  style="background-color: #6267EF; padding:20pt ">
            <h1 style="margin-bottom:20pt">Welcome to my Spring Boot Course Project</h1>
            <p> Your name: ${name} </p>
            <p> Your password: ${password} </p>
            <div>
                <a style="color:yellow" href="list-todos"> Manage your todos </a>

            </div>
        </div>

        <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="webjars/jquery/3.6.0/jquery.min.js"></script>

    </body>
</html>