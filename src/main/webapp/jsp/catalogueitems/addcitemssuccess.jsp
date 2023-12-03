<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ogha Add Catalogue Items</title>
<style><%@include file="/css/im2.css"%></style>
</head>
<body class="bg">
<header>Ogha Inventory Management System - Add Catalogue Items</header>
<label class="success">Added Catalogue Items Successful</label>
<div class="center">
<form action="/InventoryManagement/addcitemsservlet" method="post">
	<label>Item Name</label>
	<input type="text" name="itemname" />
	<label>production cost</label>
	<input type="number" name="pcost" />
	<label>selling cost</label>
	<input type="number" name="scost" />
	<label>size XS available</label>
	<input type="number" name="sizexsavail" />
	<label>size XS sold</label>
	<input type="number" name="sizexssold" />
	<label>size S available</label>
	<input type="number" name="sizesavail" />
	<label>size S sold</label>
	<input type="number" name="sizessold" />
	<label>size M available</label>
	<input type="number" name="sizemavail" />
	<label>size M sold</label>
	<input type="number" name="sizemsold" />
	<label>size L available</label>
	<input type="number" name="sizelavail" />
	<label>size L sold</label>
	<input type="number" name="sizelsold" />
	<label>size XL available</label>
	<input type="number" name="sizexlavail" />
	<label>size XL sold</label>
	<input type="number" name="sizexlsold" />
	<label>size XXL available</label>
	<input type="number" name="sizexxlavail" />
	<label>size XXL sold</label>
	<input type="number" name="sizexxlsold" />
	</br></br>
	<input type="Submit" value="Add Item" />
</form>
</br>
<c:set var="cshowurl" value="/InventoryManagement/showcatalogueitemsservlet?cataloguename=${sessionScope.cataloguename}" />
<input type="button" onclick="location.href='${cshowurl}';" value="Back" />
</br></br>
<input type="button" onclick="location.href='/InventoryManagement/jsp/login/loginform.jsp';" value="LogOut" />
</div>	
</body>
</html>