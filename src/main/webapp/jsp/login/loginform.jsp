<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ogha Login</title>
 <style><%@include file="/css/im1.css"%></style>
</head>
<body class="bg">
<header>Ogha Inventory Management System - Login/Register</header>
<div class="center">
<form action="/InventoryManagement/login" method="Post">
	<label>User Name</label>
	<input type="text" name="username" />
	<label>Password</label>
	<input type="password" name="password" />
	</br></br>
	<input type="submit" value="Login" />
</form>
</br>
<input type="button" onclick="location.href='/InventoryManagement/jsp/login/register.jsp';" value="Register" />
</div>
</body>
</html>