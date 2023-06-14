<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table{
margin-left: auto;
margin-right: auto;
}
</style>
</head>
<body style="text-align:center">
<p style="width:100%">
<a href="/jdbcapp/add">Add New Customer</a> &nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/jdbcapp/showAll">Show All Customers</a> &nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/jdbcapp/login">Logout</a>
</p>
		<form method="POST" action="/jdbcapp/changePass">
		<table width="50%" border="2" style="text-align:center">
<tr>
<td>Enter Email</td>
<td><input type="text" name="email" placeholder="Enter Email"></td>
</tr>
<tr>
<td>Enter old one</td>
<td><input type="text" name="old" placeholder="Enter old Password"></td>
</tr>
<tr><td>Enter New Paasword</td>
<td><input type="text" name="newp" placeholder="Enter new one"></td>
<tr><td>Confirm Paasword</td>
<td><input type="text" name="conf" placeholder="Confirm"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Chage Password"></td>
</tr>
<tr>
<td colspan="2">
<p style="color:red">${info }</p>
</td>
</tr>
</table>
</form>
</body>
</html>