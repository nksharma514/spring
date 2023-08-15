<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- for using of JSP Expression Language this should be false, by-default it is true  -->
<%@page isELIgnored="false"%>

<!--     for using of JSTL tag -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>about</title>
</head>
<body>

	<h1>This is all about me, hello guys..</h1>

	<%
	String place = (String) request.getAttribute("place");
	%>

	<h2>
		i am from
		<%=place%></h2>

	<!-- using of JSP Expression Language -->
	${place}
	<hr>


	<!-- using of JSTL tags -->

	<c:forEach var="item" items="${num }">
		<h2>${item }</h2>
	</c:forEach>

</body>
</html>