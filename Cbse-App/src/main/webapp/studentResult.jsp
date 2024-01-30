<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ page import="com.DAO.ResultsDaoImp" %>
<%@ page import="com.entities.Results" %>
<%@ page import="java.util.*" %>
<%@ page import="java.sql.*" %>
<%@ page import="com.DB.DbConnect" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CBSE Servlet Project</title>
<%@ include file="all_component/all_link.jsp"%>
<style>
table {
	width: 100%;
	table-layout: fixed;
}

th {
	padding: 20px 15px;
	text-align: left;
	font-weight: 500;
	font-size: 12px;
	color: #fff;
	text-transform: uppercase;
	border: 2px solid rgba(255, 255, 255, 0.3);
}

/* demo styles */
@import
	url(https://fonts.googleapis.com/css?family=Roboto:400,500,300,700);

body {
	background: -webkit-linear-gradient(left, #25c481, #25b7c4);
	background: linear-gradient(to right, #25c481, #25b7c4);
	font-family: 'Roboto', sans-serif;
}
</style>
</head>


<body>
	<%@ include file="all_component/navbar.jsp"%>


<!--for demo wrap-->
<div class="tbl-header">
	<%-- <%
	ResultsDaoImp rdl = new ResultsDaoImp();
	Results rtl = rdl.getStudentResult(regno);
	

	for (Results d : rtl) {
	%> --%>
	<%
	
	try{
		String regno = request.getParameter("regno");
		Connection conn = DbConnect.getConn();
		String sql = "select * from student inner join results where student.registrationNo=results.registrationNo and student.registrationNo='"+regno+"'";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
		
	%>
	
	<table cellpadding="0" cellspacing="0" border="0">
		<thead>
			<tr>
				<th>Name: <%=rs.getString(2)%></th>
				<th>Father Name: <%=rs.getString(6)%></th>
				<th>Gender: <%=rs.getString(5)%></th>
				<th>Dob: <%=rs.getString(4)%></th>
				<th><a titlt="print screen" alt="print screen" onclick="window.print();" target="_blank" style="cursor:pointer; text-align:center;">&nbsp;&nbsp; CLICK TO PRINT &nbsp;&nbsp;<i class="fa fa-print" aria-hidden="true"></i></a></th>
			</tr>
		</thead>
		<thead>
			<tr>
				<th>institution Name: CodeSquadz</th>
				<th>Course Name: Full Stack</th>
				<th>Branch Name: Computer Science</th>
				<th><center>Class: <%=rs.getString(9) %></center></th>
				<th><center>RegNo: <%=rs.getString(11) %></center></th>
			</tr>
		</thead>
		
	</table>
	<%-- <%} %> --%>
</div>
<style>


td {
	border: 2px solid #726E6D;
	padding: 15px;
	color: black;
	text-align: center;
}

thead {
	font-weight: bold;
	text-align: center;
	background: #625D5D;
	color: white;
}

table {
	border-collapse: collapse;
}

tbody>tr:nth-child(odd) {
	background: #D1D0CE;
}
</style>
<head>
<hr class="new1">
</head>
<body>
	<table>
		<thead>
			<tr>
				<td colspan="3">Course</td>
				<td rowspan="2">Type</td>
				<td rowspan="2">Full Marks</td>
				<td rowspan="2">Passing Marks</td>
				<td rowspan="2">Obtained Marks</td>

			</tr>
			<tr>
				<td>Code</td>
				<td colspan="2">Name</td>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>HI101</td>
				<td colspan="2">Hindi</td>
				<td>Theory</td>
				<td>100</td>
				<td>40</td>
				<td><%=rs.getInt(17)%></td>
			</tr>
			<tr>
				<td>ENG102</td>
				<td colspan="2">English</td>
				<td>Theory</td>
				<td>100</td>
				<td>40</td>
				<td><%=rs.getInt(18)%></td>
			</tr>
			<tr>
				<td>MTS103</td>
				<td colspan="2">Mathematics</td>
				<td>Theory</td>
				<td>100</td>
				<td>40</td>
				<td><%=rs.getInt(19)%></td>
			</tr>
			<tr>
				<td>SC101</td>
				<td colspan="2">Science</td>
				<td>Theory</td>
				<td>100</td>
				<td>40</td>
				<td><%=rs.getInt(20)%></td>
			</tr>
			<tr>
				<td>SST101</td>
				<td colspan="2">Social Science</td>
				<td>Theory</td>
				<td>100</td>
				<td>40</td>
				<td><%=rs.getInt(21)%></td>
			</tr>
			
		</tbody>
		<tfoot>
			<tr>
				<td colspan="4" class="footer"><b>Total Marks</b></td>
				<td>500</td>
				<td>200</td>
				<td><% int sum= rs.getInt(17)+rs.getInt(18)+rs.getInt(19)+rs.getInt(20)+rs.getInt(21); out.print(sum); %></td>
			</tr>
			<tr>
				<td colspan="4" class="footer"><b>Percentage</b></td>
				<td colspan="3"><% out.print((sum*100)/500); %>%</td>
			</tr>
	</table>
	<a id="gvlist_lnkbtnOnline_0" title="search anothor result" class="btn-grad" href="SearchResult.jsp"><b>Back</b></a>
	<%
	} 
	}catch (Exception e) {
		e.printStackTrace();
	}
	%>
	<%@ include file="all_component/footer.jsp"%>
</body>