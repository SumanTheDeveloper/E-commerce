<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<nav class="navbar navbar-default" id="navbar-bg">
<div class="navbar-header">
				
				<button type="button" class="navbar-toggle collapsed" 
   data-toggle="collapse" data-target="#navbardemo" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
</div>
<div class="collapse navbar-collapse" id="navbardemo">
<ul class="nav navbar-nav">
<li><a><img src="<c:url value='/resources/images/sbuy.png'></c:url>" height="30px" width="70px"></a></li>
<li><a href="<c:url value="/home"></c:url>"><span class="glyphicon glyphicon-home"></span>Home</a></li>
<li><a href="<c:url value="/all/Product"></c:url>">Products</a></li>	
<li><a href="<c:url value="/all/AboutPage"></c:url>">AboutUs</a></li>
<security:authorize access="hasRole('ROLE_ADMIN')">	
<li><a href="<c:url value="/all/AdminPage"></c:url>">Admin </a></li>
</security:authorize>

<li><a href="<c:url value="/login"></c:url>"><span class="glyphicon glyphicon-log-in"></span>Sign In</a></li>

<li><a href="<c:url value="/logout"></c:url>"><span class="glyphicon glyphicon-log-out"></span>Sign Out</a></li>

<li><a href="<c:url value="/cart/getcart"></c:url>"><span class="glyphicon glyphicon-shopping-cart"></span></a></li>
</ul>
</div>
</nav>
</div>
<div id=top>
<h5 align="right"> Welcome ${pageContext.request.userPrincipal.name } </h5>
</div>
</body>

</html>