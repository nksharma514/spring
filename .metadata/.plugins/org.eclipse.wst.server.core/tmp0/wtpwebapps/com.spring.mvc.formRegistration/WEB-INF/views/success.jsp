<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>


<%-- 
<h1>Welcome ${user.name1 }</h1>
<H1>Your email address is ${user.email1 }</H1>
<h1>Your password is ${user.pass } try to secure password</h1>
--%>

<h1> ${Header }</h1>
<p> ${Description }</p>

<h2 style="color:green" >${msg }</h2>

<hr>

<h1>Welcome ${user.name }</h1>
<H1>Your email address is ${user.email }</H1>
<h1>Your password is ${user.password } try to secure password</h1>



</body>
</html>