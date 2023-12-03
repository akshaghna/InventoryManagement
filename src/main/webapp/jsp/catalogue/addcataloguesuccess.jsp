<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ogha Add Catalogue</title>
<style><%@include file="/css/im1.css"%></style>
</head>
<body class="bg">
<header>Ogha Inventory Management System - Add Catalogue</header>
<label class="success">Added Catalogue Successful</label>
<div class="center">
<form action="/InventoryManagement/addcatalogueservlet" method="post">
<label>Catalogue Name</label>
<input type="text" name="catalogueName" />
<label>Year</label>
<input type="number" name="year" />
<label>Season</label>
<input type="text" name="season" />
</br></br>
<input type="Submit" value="Add" />
</form>
</br>
<input type="button" onclick="location.href='/InventoryManagement/userhomeservlet';" value="Back" />
</div>
</body>
</html>