<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="data" value="foran,Singh"></c:set>
	Length of the string ${data} is :${fn:length(data)}
	<br>
	<br>
	<!-- remember to pass data inside the function, not like in java where str.toUpperCase -->
	Converting to upper case :
	<b>${data}</b>->${fn:toUpperCase(data)}
	<br>
	<br> Converting to lower case :
	<b>${data}</b>->${fn:toLowerCase(data)}
	<br>
	<br> Does the string starts with
	<b>for</b>
	 ? ${fn:startsWith(data,"for")}
	<br>
	<br>

	
</body>
</html>