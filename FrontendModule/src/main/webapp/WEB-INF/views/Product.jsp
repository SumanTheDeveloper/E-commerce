<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ include file="Header.jsp" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>List Of Products</title>

<style>
.card button {
  border: none;
  outline: 0;
  padding: 12px;
  color: white;
  background-color: #000;
  text-align: center;
  cursor: pointer;
  width: 100%;
  font-size: 18px;
}
.grid-container {
  display: grid;
  grid-template-columns: auto auto auto;
}
.grid-container>div {
  background-color: rgba(255, 255, 255, 0.8);
  text-align: center;
  padding:10px 0;
  font-size: 30px;
}
</style>
</head>
<body>              
   <div class="grid-container">
                                        
   <c:forEach items="${productlist}" var="p">
   
   <div class="grid-item">
  
            <div class="thumbnail">
       <img src="<c:url value='/resources/images/${p.id }.png'></c:url>" height="300px" width="300px">
       <div class="caption">
                    <h4 class="group inner list-group-item-heading" align="center"> ${p.productname} </h4>
                    </div>
          <div class="card"> 
         <a href="<c:url value='/all/Info?id=${p.id}'></c:url>"><button> View </button><br></a>
          </div>
          </div>
          </div>
          
      </c:forEach>
     </div>
  
</body>
</html>