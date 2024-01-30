package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.StudentDaoImp;
import com.entities.Student;

public class StudentServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Get registration number from the request parameter
        String regNo = req.getParameter("registrationNo");
        
        // Instantiate your StudentDaoImp
        StudentDaoImp dImp = new StudentDaoImp();

        // Get details for a specific student using registration number
        Student std = dImp.getStudentDetailsById(regNo);

        // Do something with the student object, for example, pass it to JSP
        req.setAttribute("specificStudent", std);
	}
	

}
