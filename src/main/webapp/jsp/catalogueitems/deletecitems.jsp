<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ogha Delete Catalogue items</title>
</head>
<body>
<h1>Delete Catalogue item </h1>
//<form action="deletecitemsservlet" method="post">
			<table style="with: 50%">
				
			</table>
			<input type="Submit" value="Delete" /></form>
			<c:set var="cshowurl" value="/InventoryManagement/showcatalogueitemsservlet?cataloguename=${sessionScope.cataloguename}" />
		<a href="${cshowurl}"><button>Back</button></a>
		<a href="/InventoryManagement/jsp/login/loginform.jsp"><button>LogOut</button></a>
</body>
</html>