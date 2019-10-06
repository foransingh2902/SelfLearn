<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- must import the javax servlet jar files in project before using this -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String[] cities = { "mumbai", "singapore", "delhi" };
	pageContext.setAttribute("myCities", cities);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="tempCity" items="${myCities}">
		${tempCity}<br>
	</c:forEach>
</body>
</html>