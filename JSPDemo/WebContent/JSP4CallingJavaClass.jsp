<%@page import="jspCoding.CallingClassInJSP,java.util.*"%>
<!-- import statement to make use of the class. Can import multiple by using comma -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Let's have some fun
	<%=jspCoding.CallingClassInJSP.makeItLowerCase("Fun Fun")%>
	<!-- need to give full package name if we haven't import the class. Above we are using static method -->
	<br>
	<!-- Here we are calling class method using object -->
	here to the upper case:<%=new CallingClassInJSP().makeItUpperCase("hello world")%>
</body>
</html>