<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="javaCoreTags.Student"%>
<%
	// just create some sample data......normallly provided by MVC
	List<Student> data = new ArrayList<Student>();
	data.add(new Student("foran", "singh", false));
	data.add(new Student("gaurav", "mittal", true));
	data.add(new Student("dilpreet", "singh", true));
	pageContext.setAttribute("myStudents", data);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Gold Customer</th>
		</tr>
		<c:forEach var="tempStudent" items="${myStudents}">
			<!-- this will call as tempStudent.getFirstName(), tempStudent.getLastName,tempStudent.isGoldCustomer() in background -->
			<tr>
				<td>${tempStudent.firstName}</td>
				<td>${tempStudent.lastName}</td>
				<td>
				<c:if test="${tempStudent.goldCustomer}">
				Special Discount
				</c:if>
				<!-- no else statement in core tags -->
				<c:if test="${not tempStudent.goldCustomer}">
				-
				</c:if>
				</td>
				
			</tr>
		</c:forEach>
	</table>
</body>
</html>