<%@page import="im.dao.UserCatalogue"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*"%>
<%@ page import="jakarta.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Ogha User Catalogues</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style><%@include file="/css/im1.css"%></style>
</head>
<body class="bg">
<header>Ogha Inventory Management System - User Catalogues</header>
<% List<UserCatalogue> ucats = (List<UserCatalogue>)session.getAttribute("ucats");%>
 <table class="center">
<tr>
   <th>Catalogue Name</th>
   <th>Year</th>
   <th>Season</th>
   <th>Action</th>
   </th>

</tr>
<c:forEach items="${ucats}" var="ucat" varStatus="loop">
<tr>

    <c:set var="durl" value="/InventoryManagement/deletecatalogue?cataloguename=${ucat.catalogueName}" />
    <c:set var="curl" value="/InventoryManagement/showcatalogueitemsservlet?cataloguename=${ucat.catalogueName}" />
   <td><c:out value="${ucat.catalogueName}"/></td>
   <td><c:out value="${ucat.year}"/></td>
   <td><c:out value="${ucat.season}"/></td>
   <td>
 		<input type="button" onclick="location.href='${curl}';" value="Show" />
		<input type="button" onclick="location.href='${durl}';" value="Delete" />
   	</td>

</tr>
</c:forEach>
</table>
<div class="center">
<input type="button" onclick="location.href='/InventoryManagement/jsp/catalogue/addcatalogue.jsp';" value="Add Catalogue" />
</br></br>
<input type="button" onclick="location.href='/InventoryManagement/jsp/login/loginform.jsp';" value="Logout" />
</div>
</body>
</html>