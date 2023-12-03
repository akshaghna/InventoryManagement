<%@page import="im.dao.UserCatalogueItem"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*"%>
<%@ page import="jakarta.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ogha Edit Catalogue Item</title>
<style><%@include file="/css/im2.css"%></style>
</head>
<body class="bg">
<c:set var="message1" value="${sessionScope.citemAction}"/>
<c:if test = "${message1 == 'NONE'}">
<header>Ogha Inventory Management System - Edit Catalogue Item</header>
</c:if>
<c:if test = "${message1 == 'FAIL'}">
<header>Ogha Inventory Management System - Edit Catalogue Item failed</header>
</c:if>
<c:if test = "${message1 == 'SUCCESS'}">
<header>Ogha Inventory Management System - Edit Catalogue Item successful</header>
</c:if>

<div class="center">
<% List<UserCatalogueItem> ucatitems = (List<UserCatalogueItem>)session.getAttribute("ucatitems");
   String itemName= request.getParameter("itemname");
   if(itemName == null)request.getSession().getAttribute("itemname");
   session.setAttribute("itemname", itemName);
   System.out.println("ucatitems is null" + (ucatitems==null));
   System.out.println("itemname is " + itemName);
   UserCatalogueItem ucitem = null;
   Iterator<UserCatalogueItem> itr = ucatitems.iterator();
   while(itr.hasNext()){
	   UserCatalogueItem nextitem = (UserCatalogueItem)itr.next();
	   if(((UserCatalogueItem)nextitem).getItemname().equalsIgnoreCase(itemName)){
		   ucitem = nextitem;
		   break;
	   }
   }
   if(ucitem != null) {%>
<form action="/InventoryManagement/editcitemsservlet" method="post">	
    <label>Item Name</label>
	<input type="text" name="itemname" value="<%=ucitem.getItemname()%>" readonly style="background-color: grey;"/>
	<label>production cost</label>
	<input type="number" name="pcost" value ="<%=ucitem.getPcost()%>"/>
	<label>selling cost</label>
	<input type="number" name="scost" value="<%=ucitem.getScost()%>"/>
	<label>size XS available</label>
	<input type="number" name="sizexsavail" value="<%=ucitem.getsizexsavail()%>"/>
	<label>size XS sold</label>
	<input type="number" name="sizexssold" value="<%=ucitem.getsizexssold()%>"/>
	<label>size S available</label>
	<input type="number" name="sizesavail" value="<%=ucitem.getsizesavail()%>"/>
	<label>size S sold</label>
	<input type="number" name="sizessold" value="<%=ucitem.getsizessold()%>"/>
	<label>size M available</label>
	<input type="number" name="sizemavail" value="<%=ucitem.getsizemavail()%>"/>
	<label>size M sold</label>
	<input type="number" name="sizemsold" value="<%=ucitem.getsizemsold()%>"/>
	<label>size L available</label>
	<input type="number" name="sizelavail" value="<%=ucitem.getsizelavail()%>"/>
	<label>size L sold</label>
	<input type="number" name="sizelsold" value="<%=ucitem.getsizelsold()%>"/>
	<label>size XL available</label>
	<input type="number" name="sizexlavail" value="<%=ucitem.getsizexlavail()%>"/>
	<label>size XL sold</label>
	<input type="number" name="sizexlsold" value="<%=ucitem.getsizexlsold()%>"/>
	<label>size XXL available</label>
	<input type="number" name="sizexxlavail" value="<%=ucitem.getsizexxlavail()%>"/>
	<label>size XXL sold</label>
	<input type="number" name="sizexxlsold" value="<%=ucitem.getsizexxlsold()%>"/>
	</br></br>
	<input type="Submit" value="Edit Item" />
</form>
</br>
<c:set var="cshowurl" value="/InventoryManagement/showcatalogueitemsservlet?cataloguename=${sessionScope.cataloguename}" />
<input type="button" onclick="location.href='${cshowurl}';" value="Back" />
</br></br>
<input type="button" onclick="location.href='/InventoryManagement/jsp/login/loginform.jsp';" value="LogOut" />
<%}%>
</div>
</body>
</html>