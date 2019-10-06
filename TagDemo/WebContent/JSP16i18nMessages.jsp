<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!-- else read locale sent by browser HTTP request -->
<c:set var="theLocale" value="${not empty param.theLocale?param.theLocale:pageContext.request.locale}" scope="session">
</c:set>
<fmt:setLocale value="${theLocale}"/>
<fmt:setBundle basename="javaCoreTags.resources.mylabels"/>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- links back to the page with a locale -->
<a href="JSP16i18nMessages.jsp?theLocale=en_US">English (US)</a> |
<a href="JSP16i18nMessages.jsp?theLocale=es_ES">Spanish (ES)</a> |
<a href="JSP16i18nMessages.jsp?theLocale=de_DE">Germany (DE)</a>
<!-- from the property file -->
<hr>
<br>
<fmt:message key="label.greeting"/><br>
<fmt:message key="label.firstname"/> : Foran<br>
<fmt:message key="label.lastname"/> : Singh<br>
<fmt:message key="label.welcome"/>
<hr>
Selected Locale: ${theLocale}
</body>
</html>