<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Ogha Inventory Management System</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<h3>Welcome to Ogha inventory</h3>
PLease login/sign up if you want to proceed: <%= new java.util.Date()  %>
</head>
<body>

 <sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
     url="jdbc:mysql://localhost/OIM"
     user="admin"  password="admin1234"/>
 
<sql:query dataSource="${snapshot}" var="result">
SELECT * from useraccounts;
</sql:query>
 
<table>
<tr>
   <th>UserAccounts</th>
   <th>Name</th>

</tr>
<c:forEach var="row" items="${result.rows}">
<tr>
   <td><c:out value="${row.username}"/></td>

</tr>
</c:forEach>
</table>
 
</body>
</html>