<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ page isELIgnored="false"%>
          <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<style type="text/css">
.s1
{
	font-size: 25px;
	font-style:oblique; ;
	text-align: center;
	margin-left: 200px
}
.b1
{
	float: right;
}
.c1
	{
		margin-top: 10px;
		width: 100px;
		
	}
	.header
	{
	  padding: 20px;
  text-align: center;
  color: black;
  font-size: 30px;
	}
</style>
</head>
<body  onload="noBack();" onpageshow="if (event.persisted) noBack();" onunload="">

<div class="header bg-light text-dark"">
<span>Welcome ${name}</span>
<a class="btn btn-outline-primary b1" href="http://localhost:8081/Application1/login">Logout</a>
</div>
<div class="container-fluid">
<div class="row my-3">
<div class="col-9 text-center">
<span class="s1" style="align-items: center;">Book Listing</span>
</div>
<div class="col-3">
<a href="addBook" class="btn btn-primary b1">Add Book</a>
</div>
</div>
<div class="row my-3" >
<table class="table table-bordered border-primary text-center">
<tr>
<th>Book id</th>
<th>Book Name</th>
<th>Author</th>
<th>Date Added</th>
<th>Action</th>
</tr>
<c:forEach var="str" items="${all}">
<tr>
<td>${str.id }</td>
<td>${str.bookName }</td>
<td>${str.author }</td>
<td>${str.date }</td>
<td><a href="/editbook/${str.id}" class="btn btn-outline-secondary">Edit</a>
<a href="delete/${str.id }" class="btn btn-outline-danger mx-3">Delete</a>
</td>

</tr>

</c:forEach>

</table>

</div>

</div>
<script type="text/javascript">
    window.history.forward();
    function noBack() {
        window.history.forward();
    }
</script>
</body>
</html>