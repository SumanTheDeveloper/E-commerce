<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ include file="Header.jsp" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin page</title>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
    </div>
    <ul class="nav navbar-nav">
        <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Product
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="<c:url value='/admin/AddProduct'></c:url>">Add</a></li>
          <li><a href="<c:url value='/all/getallproducts'></c:url>">View</a></li>
        </ul>
      </li>
        <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Category
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="<c:url value='/all/AddCategory'></c:url>">Add</a></li>
          <li><a href="<c:url value='/all/ViewCategory'></c:url>">View</a></li>
        </ul>
      </li>
       <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Supplier
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="<c:url value='/all/AddSupplier'></c:url>">Add</a></li>
          <li><a href="<c:url value='/all/ViewSupplier'></c:url>">View</a></li>
        </ul>
      </li>
    </ul>
  </div>
</nav>
</body>
<jsp:include page="Footer.jsp"/>
</html>