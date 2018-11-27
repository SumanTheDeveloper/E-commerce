<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Product Form</title>
</head>
<body>
<div class="container">
<c:url var="url" value="/all/edit"></c:url>
<form:form method="post" action="${url }" modelAttribute="prod" enctype="multipart/form-data">
Product Id:<form:input path="id" readonly="true"/><br>
<br>
Enter Product Name:<form:input path="productname"/><br>
<br>
Enter Product Description:
<form:textarea path="productdesc"/><br>
<br>
Enter Product Quantity:<form:input path="quantity"/><br>
<br>
Enter Product Price:<form:input path="price"/><br>
<br>
Upload new Image:<form:input type="file" path="pimage"/><br>
<br>
<input type="submit" value="Edit Product"/>
</form:form>
</div>
</body>
</html>