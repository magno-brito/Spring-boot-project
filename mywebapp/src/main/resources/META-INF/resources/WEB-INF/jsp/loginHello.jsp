<html>
    <head>
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
        <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
        <title> My Second HTML page </title>
    </head>
    <body style="font-size:14pt;text-align:center;background-color:#3006A2;color:white;padding-top:50px">
        <div class="container" style="background-color: #6267EF; border-radius: 10px;padding:20px">
            <h1>This is my initial page</h1>
            <div style="margin-left:30%">
                <form  method="post" style="text-align:left">
                                <label for="name">Name:</label><br>
                                <input type="text" id="name" name="name"><br>
                                <label for="password">Password:</label><br>
                                <input type="password" id="password" name="password"><br>
                                <div style="margin-top:10pt; margin-bottom:10pt">
                                     <input type="submit" name"Submit" value="Submit">
                                </div>
                                <div style="margin-left:-7pt">
                                    <pre> ${errorMessage} </pre>
                                </div>

                </form>
            </div>

        </div>

            <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
            <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    </body>
</html>