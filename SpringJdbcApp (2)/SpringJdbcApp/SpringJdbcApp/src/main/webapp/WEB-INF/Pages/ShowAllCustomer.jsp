<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %> 
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table{
margin-left: auto;
margin-right: auto;
}
</style>
</head>
<body>
<p style="width:100%;text-align:center">
<a href="/jdbcapp/add">Add New Customer</a> &nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/jdbcapp/showAll">Show All Customers</a> &nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/jdbcapp/login">Logout</a>
<h1 style="text-align:center">All Customers Info</h1>
<table width="100%" border="1">
<tr>
<th>customer id</th>
<th>Customer Name</th>
<th>Customer MiddleName</th>
<th>LastName</th>
<th>Email</th>
<th>Password</th>
<th>Operation</th>
</tr>
<c:forEach var="cust"  items="${allcustomers}">
<tr>
<td>${cust.id }</td>
<td>${cust.firstname }</td>
 <td>${cust.middlename}</td>
<td>${cust.lastname}</td>
<td>${cust.emailaddress}</td>
<td>${cust.password }</td>
<td><a href="delete/${cust.id}">Delete</a></td>
<td><a href="Modify/${cust.id}">Update</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>