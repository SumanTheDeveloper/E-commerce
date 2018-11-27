<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Header.jsp" %>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
* {
  margin: 0;
  padding: 0;
}

body {
  font-family: "Open Sans";
  font-size: 14px;
}


form {
  padding: 20px;
  background: #408080;
  color: #fff;
  -moz-border-radius: 4px;
  -webkit-border-radius: 4px;
  border-radius: 4px;
}
form label,
form input,
form button {
  border: 0;
  margin-bottom: 3px;
  display: block;
  width: 100%;
}
form input {
  height: 25px;
  line-height: 25px;
  background: #fff;
  color: #000;
  padding: 0 6px;
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
}

form button {
  height: 30px;
  line-height: 30px;
  background: #e67e22;
  color: #fff;
  margin-top: 10px;
  cursor: pointer;
}
form .error {
  color: #ff0000;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript"
	src="https://cdn.jsdelivr.net/jquery.validation/1.15.1/jquery.validate.min.js"></script>
	<script type="text/javascript">
	
	$(document).ready(function(){
		$('#form').validate({
			rules:{
				"apartmentnumber":{required:true},
				"streetname":{required:true},
				"state":{required:true},
				"city":{required:true},
				"country":{required:true},
				"zipcode":{required:true,number:true}
			}
		})
	})
</script>

</head>
<body>
<div class="container">
<c:url var="url" value="/cart/createorder"></c:url>
<form:form modelAttribute="shippingaddress" action="${url }" id="form">

<p align="center"><b>Shipping Address</b></p>	
<form:hidden path="shippingId"/>

<form:label path="apartmentnumber">Enter Apartmentnumber</form:label>
<form:input path="apartmentnumber" id="apartmentnumber"/>


<form:label path="streetname">Enter Streetname</form:label>
<form:input path="streetname" id="streetname"/>


<form:label path="city">Enter city</form:label>
<form:input path="city" id="city"/>


<form:label path="state">Enter State</form:label>
<form:input path="state" id="state"/>


<form:label path="country">Enter country</form:label>
<form:input path="country" id="country"/>


<form:label path="zipcode">Enter zipcode</form:label>
<form:input path="zipcode" id="zipcode"/>


<button type="submit" >Next</button>
</form:form>
</div>
</body>
</html>