<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<style type="text/css">
.b1 {
	float: right;
}

.header {
	padding: 20px;
	text-align: center;
	color: black;
	font-size: 30px;
}

.container {
	border: 4px solid black;
	width: 700px;
	height: 400px;
}

.c1 {
	padding: 5x;
	margin-right: 20px;
}
.row
{
	margin-top: 5px;
}
</style>
</head>
<body>
	<div class="header bg-light text-dark"">
		<span>Welcome ${name}</span> <a class="btn btn-outline-primary b1"
			href="http://localhost:8081/Application1/login">Logout</a>
	</div>
	<div class="container">
		<div class="text-center">
			<h2 style="text-align: center;">Add Book Details</h2>
		</div>
		<!-- <table style="margin-top: 20px"> -->
		<f:form action="savebook" method="POST" modelAttribute="obj">
			<div class="row">
				<div class="col-md-3">
					<h6>Book ID</h6>
				</div>
				<div class="col-md-5 mx-10">
					<f:input path="id" name="booid" cssClass="form-contol" />

				</div>
			</div>
			<div class="row">
				<div class="col-md-3">
					<h6>Book Name</h6>
				</div>
				<div class="col-md-5  mx-10">
					<f:input path="bookName" name="bookname" cssClass="form-contol" />

				</div>
			</div>
			<div class="row">
				<div class="col-md-3">
					<h6>Author</h6>
				</div>
				<div class="col-md-5  mx-10">
					<f:select path="author">
						<f:option value="Andy hunt">Andy Hunt</f:option>
						<f:option value="Gautam Pandey">Gautam Pandey</f:option>
						<f:option value="Ojas sir">Ojas sir</f:option>
					</f:select>

				</div>
			</div>
			<div class="row">
				<div class="col-md-3">
					<h6>Added on</h6>
				</div>
				<div class="col-md-3  mx-10">
					<f:input  path="date" type="date" cssClass="form-contol" />

				</div>
			</div>
			<div class="row my-5" >
				<div class="col-md-3">
					<input type="submit" class="btn btn-primary"  value="Submit">
				</div>
				<div class="col-md-3 mx-2">
					<a href="getbook" class="btn btn-danger">Cancel</a>
				</div>
			</div>

		</f:form>
	</div>
</body>
</html>