<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display jsp Page</title>
</head>
<body>
	<!-- jsp java code -->
	<%
	String name = request.getAttribute("lable").toString();
	out.println(name);
	%>
	
	
	<!-- new  style code added in jsp later-on      introduced in jsp 1.2 called as expression language -->
	${lable}
	
	<!--  JSTL format -->
	<c:out  value="Hello world"/>
	
	
</body>
</html>