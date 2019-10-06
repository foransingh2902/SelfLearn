<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- must import the library -->
<!-- the uri attribute value resolves to a location the container understands and the prefix attribute 
informs a container what bits of markup are custom actions -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- here prefix 'c' is the 'core' -->    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="stuff" value="<%= new Date()%>"/>
Time on server is :${stuff}
</body>
</html>