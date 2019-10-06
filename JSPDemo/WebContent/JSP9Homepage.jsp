<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<h3>Training Portal</h3>
<!--  -->
	
	<%
	//out.print(favLang);
		// the default if there are no cookies
		String favLang = "Java";
	//out.print(favLang);
		// get the cookies from browser
		Cookie[] theCookies = request.getCookies();
		// find our favorite cookie
		 if (theCookies != null) {
			 out.print("1111");
			for(Cookie tempCookie:theCookies)
			{
				if ("myApp.favoriteLanguage".equals(tempCookie.getName())) {
					if(tempCookie.getValue()!="")
					{
					favLang = tempCookie.getValue();
					out.print(favLang);
					break;
					}
				}
			}
		} 
	%>
	<%= favLang %>
	<!-- now show a personalized page based on the language selected -->
	<h4>new books for the language : <% out.print(favLang); %></h4>
	<ul>
	<li>blah blah blah</li>
	<li>blah blah blah</li>
	<li>blah blah blah</li>
	</ul>
	<h4>Latest News for the language : <%= favLang %></h4>
	<ul>
	<li>blah blah blah</li>
	<li>blah blah blah</li>
	<li>blah blah blah</li>
	</ul>
	<h4>Jobs for the language : <%= favLang %></h4>
	<ul>
	<li>blah blah blah</li>
	<li>blah blah blah</li>
	<li>blah blah blah</li>
	</ul>
	<hr>
	<a href="JSP9.1CookiesPersonalizeForm.html">Personalize this page</a>
</body>
</html>