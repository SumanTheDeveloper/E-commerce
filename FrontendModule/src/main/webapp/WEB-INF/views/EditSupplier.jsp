<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Supplier Form</title>
</head>
<body>
<div class="container">
<c:url var="url" value="/all/Edit"></c:url>
<form:form method="post" action="${url }" modelAttribute="suplier">
Supplier Id:<form:input path="supplierId" readonly="true"/><br>
<br>
Enter Supplier Name:<form:input path="supplierName"/><br>
<br>
Enter Supplier Description:
<form:textarea path="supplierDesc"/><br>
<br>
<input type="submit" value="Edit Supplier"/>
</form:form>
</div>
</body>
</html>