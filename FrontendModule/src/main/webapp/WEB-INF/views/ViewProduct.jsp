<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ include file="Header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>List Of Products</title>
</head>
<body>
<div class="container">
  <h2>Product Table</h2>                                                          
  <table class="table table-striped" border="1">
    <thead>
      <tr>
        <th>S.No.</th>
        <th>Product Name</th>
        <th>Product Description</th>
        <th>Quantity</th>
        <th>Price</th>
        <th>Image</th>
        <th>  </th>
        <th>  </th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${productlist}" var="p">
      <tr>
        <td>${p.id}</td>
        <td>${p.productname}</td>
        <td>${p.productdesc}</td>
        <td>${p.quantity}</td>
        <td>${p.price}</td>
        <td><img src="<c:url value='/resources/images/${p.id }.png'></c:url>" height="30px" width="40px"></td>
        <td><a href="<c:url value='/all/edit?id=${p.id}'></c:url>"><span class="glyphicon glyphicon-pencil"></span>Edit</a></td>
        <td><a href="<c:url value='/all/Delete?id=${p.id}'></c:url>"><span class="glyphicon glyphicon-trash"></span>Delete</a></td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
  </div>

</body>
</html>