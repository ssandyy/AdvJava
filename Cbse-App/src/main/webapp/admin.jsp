<%@ page import="java.sql.Connection"%>
<%@ page import="com.DB.DbConnect"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CBSE Servlet Project</title>
<%@ include file="all_component/all_link.jsp"%>
</head>

<body class="loginbody">
	<%@ include file="all_component/navbar.jsp"%>
	<div class="logincustom">
		<!-- partial:index.partial.html -->
		<div id="logo">
			<h1>
				<i>Welcome To Ssandyy Projects</i>
			</h1>

		</div>

		<section class="stark-login">
			<c:if test="${not empty FailedMsg}">
				<p class="text-center text-danger">${FailedMsg}</p>
				<c:remove var="FailedMsg" scope="session" />
			</c:if>
			<form action="index" method="post">
				<div id="fade-box">
					<input type="text" name="rollno" id="username"
						placeholder="Username" required> 
						<input type="password"
						name="password" placeholder="Password" required>
					<button>Log In</button>
				</div>

			</form>

			<%-- <% Connection conn = DbConnect.getConn();
				out.println("hello "+conn);
			%>  --%>
			<div class="hexagons">
				<span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<br> <span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<br> <span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<span>&#x2B22;</span> <br> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<span>&#x2B22;</span> <br> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span> <span>&#x2B22;</span>
				<span>&#x2B22;</span> <span>&#x2B22;</span>
			</div>
		</section>

		<div id="circle1">
			<div id="inner-cirlce1">
				<h2></h2>
			</div>
		</div>
	</div>
	
	<!-- partial -->
	<%@ include file="all_component/footer.jsp"%>
</body>
</html>