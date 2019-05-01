<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lets see</title>
</head>
<body>
	<c:choose>
		<c:when test="${flag}">
			<c:out value="today is your day!"/>
		</c:when>
		<c:otherwise>
			<c:redirect url="/betterLuck"/>
		</c:otherwise>
	</c:choose>
</body>
</html>