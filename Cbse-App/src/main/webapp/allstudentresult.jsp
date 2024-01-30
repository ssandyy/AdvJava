<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.DAO.ResultsDaoImp" %>
<%@ page import="com.entities.Results" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CBSE Servlet Project</title>
<%@ include file="all_component/all_link.jsp"%>
</head>


<body>
	<%@ include file="all_component/navbar.jsp"%>
<body>
	<div class="tbl-header" style="text-align:center; margin-top:''">
    <table>
    <a titlt="print screen" alt="print screen" onclick="window.print();" target="_blank" style="cursor:pointer;"><i class="fa fa-print" aria-hidden="true"></i></a>
      <%
		ResultsDaoImp rdi = new ResultsDaoImp();
		List<Results> list = rdi.getAllStudentResults();

		for (Results d : list) {
		%>
        <tr>	
          <th>Name:<%=d.getRegistrationNo()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
          <th>Hindi: <%=d.getHindi() %>&nbsp;&nbsp;&nbsp;&nbsp;</th>
          <th>English: <%=d.getEnglish() %>&nbsp;&nbsp;&nbsp;&nbsp;</th>
          <th>Math: <%=d.getMaths() %>&nbsp;&nbsp;&nbsp;&nbsp;</th>
          <th>Science: <%=d.getScience() %>&nbsp;&nbsp;&nbsp;&nbsp;</th>
          <th>Social Science: <%=d.getSocialScience() %>&nbsp;&nbsp;&nbsp;&nbsp;</th>
        </tr>
        <%
		}
		%>
    </table>
	</div>
	<%@ include file="all_component/footer.jsp"%>
</body>
</html>