<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./form" method="post">
		<table>

			<tr>
				<td>Id</td>
				<td><input type="text" name="id"></td>
			</tr>


			<tr>
				<td>Name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>Date</td>
				<td><input type="Date" name="date"></td>
			</tr>
			<tr>
			<td>Gender</td>
				
				<td><input type="radio" name="gender" value="male">Male</td>
			
				
				<td><input type="radio" name="gender" value="female">FeMale</td>
			</tr>
			<tr>
			<td><input type="reset" value="reset"></td>
			<td><input type="submit" value="submit"></td>
		</tr>
		</table>
	</form>
</body>
</html>
