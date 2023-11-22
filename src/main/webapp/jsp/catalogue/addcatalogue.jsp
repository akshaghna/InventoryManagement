<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ogha Add Catalogue</title>
</head>
<body>
<h1>Add Catalogue</h1>
<form action="/InventoryManagement/addcatalogueservlet" method="post">
			<table style="with: 50%">
				<tr>
					<td>Catalogue Name</td>
					<td><input type="text" name="catalogueName" /></td>
				</tr>
				<tr>
					<td>Year</td>
					<td><input type="number" name="year" /></td>
				</tr>
				<tr>
					<td>Season</td>
					<td><input type="text" name="season" /></td>
				</tr>
			</table>
			<input type="Submit" value="Add" /></form>
			<a href="/InventoryManagement/userhomeservlet"><button>Back</button></a>
</body>
</html>