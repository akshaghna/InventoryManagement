<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ogha Registration Form</title>
<style><%@include file="/css/im1.css"%></style>
</head>
<body>
<header>Ogha Inventory Management System - Register Account</header>

<form action="/InventoryManagement/registerservlet" method="post">
 <div class="form-column">
	<label>First Name</label>
	<input type="text" name="first_name" />
	<br>
	<label>Last Name</label>
	<input type="text" name="last_name" />
	<br>
	<label>UserName</label>
	<input type="text" name="username" />
	<br>
	<label>Password</label>
	<input type="password" name="password" />
 </div>
 <div class="form-column">
	<label>Address</label>
	<input type="text" name="address" />
	<br>
	<label>EmailID</label>
	<input type="text" name="emailid" />
	<br>
	<label>Contact No</label>
	<input type="text" name="contact" />
</div>
<div class="center">
	<input type="submit" value="Submit" />
</div>
</form>
<div class="center">
<input type="button" onclick="location.href='/InventoryManagement/jsp/login/loginform';" value="Home" />
</div>
</body>
</html>