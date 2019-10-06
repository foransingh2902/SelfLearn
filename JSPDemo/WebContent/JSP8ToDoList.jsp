<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- Step 1:Create HTML form -->
	<!-- sending data to itself -->
	<form action="JSP8ToDoList.jsp">
		Add New Item:<input type="text" name="theItem"> <input
			type="submit" value="Submit">
	</form>
	<br>
	<!-- using the passed parameter -->
<!-- "Item Entered:<%=request.getParameter("theItem")%>"-->
	<!-- Step 2:Add new item to "ToDoList" -->
	<%
		// get the TO DO items from the session
		List<String> items = (List<String>) session.getAttribute("myToDoList");
		//if the TO DO items doesn't exist, then create a new one 
		if (items == null) {
			items = new ArrayList<String>();
			session.setAttribute("myToDoList", items);
		}
		// see if there is form data to add
		String theItem=request.getParameter("theItem");
		if(theItem!=null)
		{
			items.add(theItem);
		}
	%>
	<!-- Step 3:Display all "ToDoList" item from session -->
	<hr>
	<b>To List Items</b>
	<ol>
	<% 
		for(String temp:items)
		{
		out.println("<li>"+temp+"</li>");	
		}
	
	%>
	</ol>
	
</body>
</html>