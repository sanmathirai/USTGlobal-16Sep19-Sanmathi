<%@page import="com.ustglobal.empspringmvc.dto.EmployeeBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	EmployeeBean bean = (EmployeeBean) session.getAttribute("bean");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<fieldset>
	
		<a href="./changepassword">change password</a> <a href="./update">Update
			profile</a> <a href="./delete">Delete profile</a> <a href="./logout">logout</a>
		<h3>${msg}</h3>
		<center>
			<h2>
				Welcome :
				<%=bean.getName()%></h2>
			<h2>Search EMployee</h2>
			<form action="./search">
				<table>
					<tr>
						<td><input type="number" name="id"></td>
						<td><input type="submit" value="search"></td>
					</tr>
				</table>
			</form>
		</center>
	</fieldset>
	<%EmployeeBean employeeBean = (EmployeeBean)request.getAttribute("bean");
	
	%>
	<%if( employeeBean!= null ){%>
	<table>
					<tr>
						<th>Name</th>
						<th>Email</th>
						<th>gender</th>
						<th>DOJ</th>
					</tr>
					<tr>
					<td><%= employeeBean.getName() %></td>
					<td><%= employeeBean.getEmail() %></td>
					<td><%= employeeBean.getGender() %></td>
					<td><%= employeeBean.getDate() %></td>
					<td></td>
					
					
					</tr>
				</table>
	
	<% }  %>
	

	
	
</body>
</html>