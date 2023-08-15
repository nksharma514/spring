<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- for using of SpEL Expression Language this should be false, by-default it is true  -->
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is home page</h1>
	<h1>Called by Home Controller</h1>

	<%
	String name = (String) request.getAttribute("name");
	%>
	<%
	Integer id = (Integer) request.getAttribute("id");
	%>

	<%
	List<String> friend = (List<String>) request.getAttribute("f");
	%>


	<h2>
		My name is
		<%=name%>
	</h2>
	<h2>
		Id is
		<%=id%></h2>

	<h3>
		<%
		for (String s : friend) {
			out.println(s);
		}
		%>
	</h3>

	<!-- or -->
	<%
	for (String s : friend) {
	%>
	<h2><%=s%></h2>
	<%
	}
	%>




	<!-- using of SpEL Expression Language -->
	${name }
	<br> ${id }
	<br> ${f }

</body>
</html>