<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>
<% 

response.setHeader("Expires", "0"); // Proxies
response.setHeader("Pragma", "no-cache"); //HTTP 1.0
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); //HTTP 1.1

if(session.getAttribute("username")==null){
	response.sendRedirect("login.jsp");
}
%>
	Welcome ${username}
	<a href="videos.jsp"> videos</a>
	
	<form action="Logout"><input type="submit" value="Logout" /></form>
</body>
</html>