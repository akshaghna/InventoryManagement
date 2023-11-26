<%@page import="im.dao.UserCatalogueItem"%>
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
<h3>Ogha Catalogue Items</h3>
</head>
<body>

<table>
<% List<UserCatalogueItem> ucatitems = (List<UserCatalogueItem>)session.getAttribute("ucatitems");%>
<tr>
   <th>Item Name</th>
   <th>Production cost</th>
   <th>Selling price</th>
   <th>Size XS Available</th>
   <th>Size XS Sold</th>
   <th>Size S Available</th>
   <th>Size S Sold</th>
   <th>Size M Available</th>
   <th>Size M Sold</th>
   <th>Size L Available</th>
   <th>Size L Sold</th>
   <th>Size XL Available</th>
   <th>Size XL Sold</th>
   <th>Size XXL Available</th>
   <th>Size XXL Sold</th>
   <th></th>

</tr>
<c:forEach items="${ucatitems}" var="ucatitem" varStatus="loop">
<c:set var="diurl" value="/InventoryManagement/deletecitemsservlet?itemname=${ucatitem.itemname}" />
<tr>
   <td><c:out value="${ucatitem.itemname}"></c:out></td>
   <td><c:out value="${ucatitem.pcost}"></c:out></td>
   <td><c:out value="${ucatitem.scost}"></c:out></td>
   <td><c:out value="${ucatitem.sizexsavail}"></c:out></td>
   <td><c:out value="${ucatitem.sizexssold}"></c:out></td>
   <td><c:out value="${ucatitem.sizesavail}"/></td>
   <td><c:out value="${ucatitem.sizessold}"/></td>
   <td><c:out value="${ucatitem.sizemavail}"/></td>
   <td><c:out value="${ucatitem.sizemsold}"/></td>
   <td><c:out value="${ucatitem.sizelavail}"/></td>
   <td><c:out value="${ucatitem.sizelsold}"/></td>
   <td><c:out value="${ucatitem.sizexlavail}"/></td>
   <td><c:out value="${ucatitem.sizexlsold}"/></td>
   <td><c:out value="${ucatitem.sizexxlavail}"/></td>
   <td><c:out value="${ucatitem.sizexxlsold}"/></td>
   <td><a href="${diurl}"><button>Delete</button></a></td>

   
</tr>
</c:forEach>
</table>
<a href="/InventoryManagement/jsp/catalogueitems/addcitems.jsp"><button>Add Item</button></a>
<a href="/InventoryManagement/jsp/login/loginform.jsp"><button>LogOut</button></a>
<a href="/InventoryManagement/jsp/catalogue/userhome.jsp"><button>Back</button></a>

</body>
</html>