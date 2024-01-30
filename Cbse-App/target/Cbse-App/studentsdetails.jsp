<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.DAO.StudentDaoImp"%>
    <%@ page import="com.entities.Student"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CBSE Servlet Projects</title>
<%@ include file="all_component/all_link.jsp" %>
</head>
<body>
<%@ include file="all_component/navbar.jsp"%>

<%
	StudentDaoImp dImp = new StudentDaoImp(); 
    List<Student> list = dImp.getAllStudentsDetails();
     for(Student st :list){
%>
<div class="flip-card">
  <div class="flip-card-inner">
    <div class="flip-card-front">
      <img src="all_component/images/profile-icon-images-25.jpg" alt="Avatar" style="width:320px;">
    </div>
    <div class="flip-card-back">
		   	  <div style="border: 1px solid #ccc; padding: 10px; margin: 10px; width: 300px;">
		         <h1><%= st.getFirstName() +" "+ st.getLastName() %></h1>
		         <p>Registration no. <%= st.getRegistrationNo() %></p>
		         <p>Father Name: <%= st.getFatherName() %></p>
		     </div>
    </div>
  </div>
</div>
<% } %> 
<%@ include file="all_component/footer.jsp"%>
</body>
</html>