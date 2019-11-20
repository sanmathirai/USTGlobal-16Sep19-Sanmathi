<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!-- include directive -->
    <%@include file="/index.jsp" %>
    
    <!-- tag lib directive 
    <%@taglib uri="" %>-->
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:green">This is include jsp</h1>
<jsp:include page="/index.jsp" />
<jsp:include page="/first" />
</body>
</html>