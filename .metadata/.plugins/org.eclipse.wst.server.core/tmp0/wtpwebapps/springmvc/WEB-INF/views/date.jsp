<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- for using of SpEL Expression Language this should be false, by-default it is true  -->
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Date Page</title>
</head>
<body>

	<%
	LocalDateTime now = (LocalDateTime) request.getAttribute("time");
	%>
	<%
	String hello = (String) request.getAttribute("Hello");
	%>

	<h1>
		Date and Time is
		<%=now.toString()%></h1>
	<h1>
		Print here
		<%=hello%></h1>

	<!-- using of SpEL Expression Language -->
	<h2>
		${time} <br> ${Hello}
	</h2>



</body>
</html>