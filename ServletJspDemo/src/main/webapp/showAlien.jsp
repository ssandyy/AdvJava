<%@page import="com.ssandyy.web.model.Alien"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>show Alien page</title>
</head>
<body bgcolor="cyan">
sess
	<%
	
		Alien a1 = (Alien)session.getAttribute("xyz");
		//Alien a1 = (Alien)request.getAttribute("alien");
		out.println(a1);
	%>
</body>
</html>