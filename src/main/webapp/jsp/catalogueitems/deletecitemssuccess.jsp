<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ogha Delete Catalogue Items</title>
<style><%@include file="/css/im2.css"%></style>
</head>
<body class="bg">
<header>Ogha Inventory Management System - Delete Catalogue Items</header>
<label class="success">Deleted Catalogue Items Successfully</label>
<div class="center">
<c:set var="cshowurl" value="/InventoryManagement/showcatalogueitemsservlet?cataloguename=${sessionScope.cataloguename}" />
<input type="button" onclick="location.href='${cshowurl}';" value="Back" />
</br></br>
<input type="button" onclick="location.href='/InventoryManagement/jsp/login/loginform.jsp';" value="LogOut" />
</div>
</body>
</html>