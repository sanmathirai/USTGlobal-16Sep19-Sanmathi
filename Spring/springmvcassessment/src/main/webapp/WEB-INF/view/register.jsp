<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<center>
			<form action="./register" method="post">
				<h1>Register page</h1>
				<table>
					<tr>
						<td>Name</td>
						<td><input type="text" name="name"></td>
					</tr>
					<tr>
						<td>Email</td>
						<td><input type="email" name="email"></td>
					</tr>
					<tr>
						<td>Password</td>
						<td><input type="password" name="password"></td>
					</tr>
					
					<tr>
						<td colspan="2" align="center"><input type="submit"
							value="Register"></td>
					</tr>
				</table>
			</form>
			<a href="login.jsp">Click here to login</a>
		</center>
	</fieldset>
</body>
</html>