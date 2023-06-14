<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Admin</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</head>
<body class="bg-info mt-5" onload="noBack();" onpageshow="if (event.persisted) noBack();" onunload="" >
<div class="container" >
<form name="form" method="post" action="Check" onsubmit="return validate()">
<div class="card">
  <div class="card-header">
  <span style="color: blue; font-style: italic;">Login</span> 
  </div>
  <div class="card-body">
  <div class="row p-2 ">
  <div class="col-md-2">
   <button type="button" class="btn btn-secondary">User id</button>
  </div>
  <div class="col-md-5">
  <input type="text" id="t1" name="name" class="form-control">
  </div>
  </div>
  <div class="row p-2 ">
  <div class="col-md-2">
  <button type="button" class="btn btn-secondary">Password</button>
  </div>
  <div class="col-md-5">
  <input type="password" id="t2" name="pass" class="form-control">
  </div>
  </div>
 
  </div>
  <div class="alert-secondary text-center">
  <button type="submit" class="btn btn-primary">Login>></button>
   <button class="btn btn-warning"><a href="#" style="margin-right: 20px">Forgotten password?</a></button>
  </div>
</div>
 
</form>
<!-- Footer -->
<footer class="page-footer font-small blue">

  <!-- Copyright -->
  <div class="footer-copyright text-center py-3">© 2022 Copyright:
    <a href="https://www.nagarro.com">Nagarro.com</a>
  </div>
  <!-- Copyright -->

</footer>
<!-- Footer -->
</div>

<script type="text/javascript">
    window.history.forward();
    function noBack() {
        window.history.forward();
    }
</script>
</body>
</html>