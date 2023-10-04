<html>
    <head>
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

        <title> My Second HTML page </title>
    </head>
    <body style="font-size:14pt;text-align:center;background-color:gray">
        <h1>This is my initial page</h1>
        <pre> ${errorMessage} </pre>
        <form method="post">
            Name: <input type="text" name="name"><br>
            Password: <input type="password" name="password"><br>
            <input type="submit" name="Submit">

        </form>


    </body>
</html>