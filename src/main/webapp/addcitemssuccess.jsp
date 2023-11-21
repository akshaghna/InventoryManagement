<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ogha Add Catalogue Items </title>
</head>
<body>
<h1>Add Catalogue items successful</h1>
<form action="addcitemsservlet" method="post">
			<table style="with: 50%">
				<tr>
					<td>Item Name</td>
					<td><input type="text" name="ItemName" /></td>
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
					<td>size xs available</td>
					<td><input type="text" name="sizexsavail" /></td>
				</tr>
				<tr>
					<td>sizexssold</td>
					<td><input type="text" name="sizexssold" /></td>
				</tr>
				<tr>
					<td>size s avail</td>
					<td><input type="text" name="sizesavail" /></td>
				</tr>
				<tr>
					<td>size s sold</td>
					<td><input type="text" name="sizessold" /></td>
				</tr>
				<tr>
					<td>sizemavail</td>
					<td><input type="text" name="sizemavail" /></td>
				</tr>
				<tr>
					<td>sizemsold</td>
					<td><input type="text" name="sizemsold" /></td>
				</tr>
				<tr>
					<td>sizelavail</td>
					<td><input type="text" name="sizelavail" /></td>
				</tr>
				<tr>
					<td>sizelsold</td>
					<td><input type="text" name="sizelsold" /></td>
				</tr>
				<tr>
					<td>sizexlavail</td>
					<td><input type="text" name="sizexlavail" /></td>
				</tr>
				<tr>
					<td>selling sizexlsold</td>
					<td><input type="text" name="sizexlsold" /></td>
				</tr>
				<tr>
					<td>selling sizexxlsold</td>
					<td><input type="text" name="sizexxlsold" /></td>
				</tr>
				<tr>
					<td>selling sizexxlsold</td>
					<td><input type="text" name="sizexxlsold" /></td>
				</tr>
			</table>
			<input type="Submit" value="Add" /></form>
			<a href="/InventoryManagement/userhomeservlet"><button>Back</button></a>
</body>
</html>