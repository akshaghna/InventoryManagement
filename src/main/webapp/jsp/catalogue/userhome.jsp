<%@page import="im.dao.UserCatalogue"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*"%>
<%@ page import="jakarta.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Ogha Inventory Management System</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<h3>Welcome to Ogha inventory</h3>
</head>
<body>
<% List<UserCatalogue> ucats = (List<UserCatalogue>)session.getAttribute("ucats");%>
 <table>
<tr>
   <th>Catalogue Name</th>
   <th>Year</th>
   <th>Season</th>
   <th>  </th>
   </th>

</tr>
<c:forEach items="${ucats}" var="ucat" varStatus="loop">
<tr>

    <c:set var="durl" value="/InventoryManagement/deletecatalogue?cataloguename=${ucat.catalogueName}" />
    <c:set var="curl" value="/InventoryManagement/showcatalogueitemsservlet?cataloguename=${ucat.catalogueName}" />
   <td><c:out value="${ucat.catalogueName}"/></td>
   <td><c:out value="${ucat.year}"/></td>
  <td><c:out value="${ucat.season}"/></td>
   <td><a href="${curl}"><button>Show</button></a><td>
   <td><a href="${durl}"><button>Delete</button></a></td>

</tr>
</c:forEach>
</table>
<a href="/InventoryManagement/jsp/catalogue/addcatalogue.jsp"><button>Add Catalogue</button></a>
<a href="/InventoryManagement/jsp/login/loginform.jsp"><button>LogOut</button></a>

</body>
</html>