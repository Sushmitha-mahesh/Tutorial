<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>shipping address</title>
</head>
<body>
<form action="<c:url value="/BillingAddress" />"  method="post">
<h3>Shipping Address</h3>
  
  <input type="text" name="ShippingAddress" value="">
  <br>

  <button type="submit" value="Submit">Submit</button>
   </form> 
 <button type="cancel" value=""><a href="<c:url value="/Cancel" />" ></a>Cancel</button>



</body>
</html>