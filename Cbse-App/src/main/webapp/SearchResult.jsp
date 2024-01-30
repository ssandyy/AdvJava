<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<style>
.login-box {
	height: 400px;
}
</style>
<title>CBSE Servlet Project</title>
<%@ include file="all_component/all_link.jsp"%>
</head>


<body>
	<%@ include file="all_component/navbar.jsp"%>
	<form method="post" action="studentResult.jsp">
		<div class="login-box">
			<center>
				<img src="all_component/images/result.png" width="200" height="150">
			</center>

			<input type="text" name="regno" placeholder="Enter Registration No: "
				required="required"> <input type="submit" name="submit"
				value="Search">
	</form>
	<center>
		<h1>
			<a href="SearchResult.jsp">Back</a>
		</h1>
	</center>
	</div>
	<%@ include file="all_component/footer.jsp"%>
</body>
</html>