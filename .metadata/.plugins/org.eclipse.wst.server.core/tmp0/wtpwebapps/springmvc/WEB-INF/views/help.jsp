<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- for using of SpEL Expression Language this should be false, by-default it is true  -->
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>

	<h1>Help page is working fine</h1>

	<%
	String name = (String) request.getAttribute("name1");
	%>
	<%
	String place = (String) request.getAttribute("place");
	%>

	<h2>
		Her name is
		<%=name%></h2>
	<h2>
		She live in
		<%=place%></h2>


	<!-- using of SpEL Expression Language -->
	${name1 }
	<br> ${place }

</body>
</html>