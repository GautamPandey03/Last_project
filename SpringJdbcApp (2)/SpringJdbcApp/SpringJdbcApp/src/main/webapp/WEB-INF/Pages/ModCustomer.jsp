
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %> 
    <%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
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
<body style="text-align:center">
<p style="width:100%">
<a href="/jdbcapp/add">Add New Customer</a> &nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/jdbcapp/showAll">Show All Customers</a> &nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/jdbcapp/login">Logout</a>
</p>
<hr />
<h1>Customer Registration</h1>
<f:form  name="frmadd" method="POST" action="/jdbcapp/updateCustomer" modelAttribute="cust">
<table width="40%" border="1">
<tr>
<td>Customer Id</td>
<td><f:input path="id" type="text"  readonly/></td>
</tr>
<tr>
<td>Customer Name</td>
<td><f:input path="firstname" type="text" /></td>
</tr>
<tr>
<td>Middle Name </td>
<td>
	<f:input path="middlename" type="text"/>
	
</td>
</tr>
<tr>
<td>Last Name </td>
<td>
	<f:input path="lastname" type="text"/>
	
</td>
</tr>
<tr>
<td>Email Id </td>
<td>
	<f:input path="emailaddress" type="text"/>
</td>
</tr>

<tr>
<td>Password </td>
<td><f:input path="password" type="text" /></td>
</tr>

<tr>
<td><input type="submit"  value="Update Customer" /></td>
<td><input type="reset"  value="Clear All" /></td>
</tr>
<tr>
<td colspan="2">
	<p style="color:green">${info }</p>
</td>
</tr>
</table>

</f:form>

</body>
</html>