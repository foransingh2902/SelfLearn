<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation Title</title>
</head>
<body>
	The Student is confirmed :
	<%=request.getParameter("firstName")%>
	<%=request.getParameter("lastName")%><br> country :<%=request.getParameter("country")%><br>
	favorite language:<%=request.getParameter("favoriteLanguage")%><br>
	Courses Attended :
	<!-- Using scriptlet -->
	<ul>
		<!-- getParameterValues will give us an array -->
		<%
			String[] langs = request.getParameterValues("attendCourse");
		//Checking if user have selected any value on not. If it didn't select any value then it will throw
		// a NullPointerException. To avoid it check it before fetching.
			if (langs != null) {
				for (String tempLang : langs) {
					// generating html on the fly
					out.print("<li>" + tempLang + "</li>");
				}
			}
		%>
		<!-- the same can't be received using ${param} -->
	</ul>
	<br>
	<br>
	<!-- or alternate: but this one is only for displaying form data -->
	The Student is confirmed : ${param.firstName} ${param.lastName},
	country :${param.country} and favorite language:
	${param.favoriteLanguage}
</body>
</html>