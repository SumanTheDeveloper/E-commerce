<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>E-Commerce Site</title>
<style>


li {
    float: left;
}

li a {
    display: block;
    color: #666;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover:not(.active) {
    background-color: #ddd;
}

li a.active {
    color: white;
    background-color: #4CAF50;
}
.carousel-inner img {
      width: 100%;
      height: 100%;
  }
body  {
      
      background-color: #cccccc;
}
</style>
</head>
<body>
<div class="container">
<img src="<c:url value='/resources/images/e-commerce.png'></c:url>" height="200px" width="1135px">
<nav class="navbar navbar-inverse">
<div class="collapse navbar-collapse" id="navbardemo">
<ul class="nav navbar-nav">
<li><a><img src="<c:url value='/resources/images/sbuy.png'></c:url>" height="30px" width="70px"></a></li>
<li><a href="<c:url value="/home"></c:url>"><span class="glyphicon glyphicon-home"></span>Home</a></li>
</ul>
<ul class="nav navbar-nav navbar-right">
<li><a href="AboutPage">AboutUs</a></li>
<li><a href="<c:url value='/all/getregistrationform'></c:url>">Sign Up</a></li>	
<li><a href="<c:url value="/login"></c:url>"><span class="glyphicon glyphicon-log-in"></span>Sign In</a></li>	


</ul>
</div>
</nav>
</div>
</body>

</html>