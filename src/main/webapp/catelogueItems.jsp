<%@page import="im.dao.UserCatalogueItem"%>
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
<h3>Catelogue Items</h3>
</head>
<body>

<table>
<% List<UserCatalogueItem> ucats = (List<UserCatalogueItem>)session.getAttribute("items");%>
<tr>
   <th>Item Name</th>
   <th>Production cost</th>
   <th>Selling price</th>

</tr>
<% for(UserCatalogueItem cat: ucats){
%>
<tr>
   <td><%cat.getItemname();%></td>
   <td><%cat.getPcost();%></td>
   <td><%cat.getScost();%></td>

</tr>
<%}%>
</table>
<a href="additem.jsp"><button>Add Item</button></a>
<a href="deleteItem.jsp"><button>Delete Item</button></a>
<a href="showSizes.jsp"><button>Show Sizes</button></a>
<a href="loginform.jsp"><button>LogOut</button></a>
<a href="userhome.jsp"><button>Back</button></a>

</body>
</html>