<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ogha Add Catalogue Items</title>
</head>
<body>
<h1>Add Catalogue items</h1>
<form action="/InventoryManagement/addcitemsservlet" method="post">
			<table style="with: 50%">
				<tr>
					<td>Item Name</td>
					<td><input type="text" name="itemname" /></td>
				</tr>
				<tr>
					<td>production cost</td>
					<td><input type="number" name="pcost" /></td>
				</tr>
				<tr>
					<td>selling cost</td>
					<td><input type="text" name="scost" /></td>
				</tr>
				<tr>
					<td>size XS available</td>
					<td><input type="text" name="sizexsavail" /></td>
				</tr>
				<tr>
					<td>size XS sold</td>
					<td><input type="text" name="sizexssold" /></td>
				</tr>
				<tr>
					<td>size S available</td>
					<td><input type="text" name="sizesavail" /></td>
				</tr>
				<tr>
					<td>size S sold</td>
					<td><input type="text" name="sizessold" /></td>
				</tr>
				<tr>
					<td>size M available</td>
					<td><input type="text" name="sizemavail" /></td>
				</tr>
				<tr>
					<td>size M sold</td>
					<td><input type="text" name="sizemsold" /></td>
				</tr>
				<tr>
					<td>size L available</td>
					<td><input type="text" name="sizelavail" /></td>
				</tr>
				<tr>
					<td>size L sold</td>
					<td><input type="text" name="sizelsold" /></td>
				</tr>
				<tr>
					<td>size XL available</td>
					<td><input type="text" name="sizexlavail" /></td>
				</tr>
				<tr>
					<td>size XL sold</td>
					<td><input type="text" name="sizexlsold" /></td>
				</tr>
				<tr>
					<td>size XXL available</td>
					<td><input type="text" name="sizexxlavail" /></td>
				</tr>
				<tr>
					<td>size XXL sold</td>
					<td><input type="text" name="sizexxlsold" /></td>
				</tr>
			</table>
			<input type="Submit" value="Add" /></form>
			<a href="/InventoryManagement/showcatalogueitemservlet"><button>Back</button></a>
</body>
</html>