<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">



<html lang="en">

<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="https://use.fontawesome.com/9c842829ac.js"></script>
</head>

<body>
  
<h1> Registration Form</h1>

<form:form action="Register" method="post" commandName="Register"  >

			<table style="width: 50%">
			<tr>
					<td>User ID</td>
					<td><input type="text" name="userid" /></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name" /></td>
				</tr>
				
				<tr>
					<td>Email</td>
					<td><input type="text" name="email" /></td>
				</tr>
					<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td>Confirm Password</td>
					<td><input type="password" name="confirmpassword" /></td>
				</tr>
				
				<tr>
					<td>Mobile No</td>
					<td><input type="text" name="mobile" /></td>
				</tr>
			</table>
			
			<input type="submit" value="Submit" />
</form:form>

</body>
</html>