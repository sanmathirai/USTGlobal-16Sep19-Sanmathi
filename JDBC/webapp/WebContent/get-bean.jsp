<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="com.ustglobal.webapp.servlets.EMployee" scope="request"></jsp:useBean>
</body>
</html>

<h1><%=obj.getName()%></h1>
<h1><%=obj.getId()%></h1>