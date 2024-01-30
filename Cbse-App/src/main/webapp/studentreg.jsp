<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.DAO.ClassesDaoImp"%>
<%@ page import="com.entities.Classes"%>
<%@page import="java.util.List"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CBSE Servlet Project</title>
<%@ include file="all_component/all_link.jsp"%>

</head>
<body class="stdpagebody">
	<%@ include file="all_component/navbar.jsp"%>
	<div class="form_wrapper">
		<div class="form_container">
			<div class="title_container">
				<h2>Student Registration Form</h2>
				<!-- ssandyy Used 'Jstl' for success msg same as ajax  -->
				<c:if test="${not empty SucessMsg}">
					<p class="text-center text-success">${SucessMsg}</p>
					<c:remove var="SucessMsg" scope="session" />
				</c:if>
				<c:if test="${not empty FailedMsg}">
					<p class="text-center text-success">${FailedMsg}</p>
					<c:remove var="FailedMsg" scope="session" />
				</c:if>
			</div>
			<div class="row clearfix">
				<div class="">
					<form action="studentregistration" method="post">
						<div class="row clearfix">
							<div class="col_half">
								<div class="input_field">
									<span><i aria-hidden="true" class="fa fa-user"></i></span> <input
										type="text" name="fname" placeholder="First Name" />
								</div>
							</div>

							<div class="col_half">
								<div class="input_field">
									<span><i aria-hidden="true" class="fa fa-user"></i></span> <input
										type="text" name="lname" placeholder="Last Name" required />
								</div>
							</div>
						</div>
						<div class="row clearfix">
							<div class="col_half">
								<div class="input_field">
									DOB: <input type="date" name="Dob" placeholder="Dob" required />
								</div>
							</div>
							<!--  <div class="col_half"> -->
							<div class="col_half">
								<div class="input_field">
									<label for="gender">Gender:</label> <select name="gender"
										id="gender">
										<option value="male">Male</option>
										<option value="female">Female</option>
										<option value="other">Other</option>
									</select>
								</div>
							</div>
						</div>
						<div class="input_field">
							<span> <i class="fa fa-user" aria-hidden="true"></i></span> <input
								type="text" name="fathername" placeholder="FatherName " required />
						</div>
						<div class="input_field">
							<span><i aria-hidden="true" class="fa fa-phone"></i></span> <input
								type="tel" name="phone" placeholder="Phone" pattern="[0-9]{10}"
								required />
						</div>
						<div class="textarea_field">
							<input type="text" name="address" placeholder="Address" required />
						</div>




						<div class="row clearfix">
							<div class="col_half">
								<div class="input_field select_option">
									<select name="class">
										<option value="" disabled selected>Class</option>
										<%
											ClassesDaoImp cls = new ClassesDaoImp();
										List<Classes> list = cls.getAllClasses();
						
											for (Classes c : list) {
											%>
											<option value="<%=c.getClassId()%>">
												<%=c.getClassName()%>
											</option>
											<%
											}
											%>
										
										<!-- <option value="1">One</option>
										<option value="2">Two</option>
										<option value="3">Three</option>
										<option value="4">Four</option>
										<option value="5">Five</option>
										<option value="6">Six</option>
										<option value="7">Seven</option>
										<option value="8">Eight</option>
										<option value="9">Nine</option>
										<option value="10">Ten</option>
										<option value="11">Eleven</option>
										<option value="12">Twelve</option> -->
									</select>
									<div class="select_arrow"></div>
								</div>
							</div>
							<!-- <div class="col_OneThird">
								<div class="input_field select_option">
									<select name="section">
										<option value="" disabled selected>Section</option>
										<option>A</option>
										<option>B</option>
										<option>C</option>
										<option>D</option>
										<option>E</option>
										<option>F</option>
										<option>G</option>
									</select>
									<div class="select_arrow"></div>
								</div>
							</div> -->
							<div class="col_half">
								<input type="text" name="rollno" placeholder="Roll No." />
							</div>
						</div>

						<div class="input_field">
							<span><i aria-hidden="true" class="fa fa-lock"></i></span> <input
								type="password" name="password" placeholder="Password" required />
						</div>

						<!-- <div class="input_field"> <span><i aria-hidden="true" class="fa fa-lock"></i></span>
            <input type="password" name="password" placeholder="Re-type Password" required />
          </div> -->


						<!-- <div class="input_field select_option">
							<select>
								<option>Subject</option>
								<option>Hindi</option>
								<option>Maths</option>
								<option>Science</option>
								<option>Social Science</option>
								<option>EVS</option>
								<option>Games</option>
							</select>
							<div class="select_arrow"></div>
						</div>
						<div style="padding: 2rem;">
							<div class="dropdown open">
								<button class="btn btn-default dropdown-toggle" type="button">
									Dropdown Button</button>
								<div class="dropdown-menu dropdown-multi-select">
									<div class="dropdown-multi-select-item active">
										<div class="dropdown-multi-select-checkbox"></div>
										<div>Amazon Web Services‎</div>
									</div>
									<div class="dropdown-multi-select-item active">
										<div class="dropdown-multi-select-checkbox"></div>
										<div>Microsoft Azure</div>
									</div>
									<div class="dropdown-multi-select-item">
										<div class="dropdown-multi-select-checkbox"></div>
										<div>Google Cloud Platform 3845398-3487939</div>
									</div>
									<div class="dropdown-multi-select-item disabled">
										<div class="dropdown-multi-select-checkbox"></div>
										<div>Alibaba Cloud</div>
									</div>
								</div>
							</div>
						</div>



						<div class=" grid grid-cols-3 col-span-2">
							<div class="input_field checkbox_option">
								<input type="checkbox" id="cb1"> <label for="cb1">
									hindi</label>
							</div>
							<div class="input_field checkbox_option">
								<input type="checkbox" id="cb2"> <label for="cb2">
									english</label>
							</div>
						</div> -->

						<input class="button" type="submit" value="Register" />
					</form>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="all_component/footer.jsp"%>
</body>
</html>