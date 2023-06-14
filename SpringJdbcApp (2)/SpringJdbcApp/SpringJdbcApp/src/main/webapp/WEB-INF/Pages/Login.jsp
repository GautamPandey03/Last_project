<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ page isELIgnored="false" %> 
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
<h1>Login Here</h1>
<form name="frmLogin"  method="POST"  action="LogProcess">
<table width="40%" border="1">
<tr>
<td>UserName</td>
<td><input type="text"  name="txtUser" required/></td>
</tr>

<tr>
<td>Password</td>
<td><input type="password"  name="txtPass" required/></td>
</tr>

<tr>
<td><input type="submit"  value="Login here" /></td>
<td><input type="reset"  value="Clear All" /></td>
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