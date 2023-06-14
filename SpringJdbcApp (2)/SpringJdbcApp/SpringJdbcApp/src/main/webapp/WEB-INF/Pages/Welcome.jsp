<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %> 
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center">Welcome to : ${cust.firstname}</h1>
<h2 style="text-align:center"><a href="Change/${cust.id }">Change Password</a>
&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
<a href="login">Logout</a></h2>
<hr />
<table width="100%" border="1">
<tr>
<th>Customer id</th>
<th>Customer Name</th>
<th>Customer MiddleName</th>
<th>LastName</th>
<th>Email</th>
<th>Password</th>
</tr>
<tr>
<td>${cust.id }</td>
<td>${cust.firstname }</td>
 <td>${cust.middlename}</td>
<td>${cust.lastname }</td>
<td>${cust.emailaddress }</td>
<td>${cust.password }</td>
</tr>
</table>
</body>
</html>