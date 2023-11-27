<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ogha Registration Form</title>
<style><%@include file="/css/im1.css"%></style>
</head>
<body class="bg">
<header>Ogha Inventory Management System - Register Account</header>
<label class="warning">Registration Failed, Try again</label>
<form action="/InventoryManagement/registerservlet" method="post">
 <div class="center">
	<label>First Name</label>
	<input type="text" name="first_name" />
	<label>Last Name</label>
	<input type="text" name="last_name" />
	<label>UserName</label>
	<input type="text" name="username" />
	<label>Password</label>
	<input type="password" name="password" />
 	<label>Address</label>
	<input type="text" name="address" />
	<label>EmailID</label>
	<input type="text" name="emailid" />
	<label>Contact No</label>
	<input type="text" name="contact" />
	<input type="submit" value="Submit" />
</form>
<input type="button" onclick="location.href='/InventoryManagement/jsp/login/loginform.jsp';" value="Home" />
</div>
</body>
</html>