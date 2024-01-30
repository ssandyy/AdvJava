package com.user.servlet;

import java.io.IOException;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;

//import org.mindrot.jbcrypt.BCrypt;

import com.DAO.StudentDaoImp;
import com.DB.DbConnect;
import com.entities.Student;


@WebServlet("/studentregistration")
public class RegisterServlet extends HttpServlet{

	/**
	 * 
	 */
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			//serei
			String StudentId = req.getParameter("studentId");
			String fname = req.getParameter("fname");
			String lname = req.getParameter("lname");
			String password = req.getParameter("password");
			String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
			
//			int dob =Integer.parseInt(req.getParameter("Dob"));
			String dob =req.getParameter("Dob");
			String gender = req.getParameter("gender");
//			int ClassId = Integer.parseInt(req.getParameter("class"));
			String phone = req.getParameter("phone");
			int ClassId = Integer.parseInt(req.getParameter("class"));
			String address = req.getParameter("address");
			String fatherName = req.getParameter("fathername");
			String registrationNo = req.getParameter("registrationNo");
			String rollno = req.getParameter("rollno");
			
			
			
			 
//			System.out.println(fname+" "+lname+" "+password+" "+phone+" "+address+" "+fatherName+" "+rollno+ " "+age+ " "+ClassId);
			
			 Student std = new Student(); 
			 std.setFirstName(fname); 
			 std.setLastName(lname);
			 std.setAddress(address); 
			 std.setDob(dob); 
			 std.setGender(gender);
			 std.setFatherName(fatherName);
				/* std.setPassword(hashedPassword); */
			 std.setPassword(password);
			 std.setClassId(ClassId);
			 std.setPhone(phone);
			 std.setRollNo(rollno);
			 std.setRegistrationNo(registrationNo);
			 
			 //ser end
			 
			 HttpSession session = req.getSession();
			 
			
			 
			 
			StudentDaoImp dImp = new StudentDaoImp();
			boolean f=dImp.studentRegister(std);
			
			
			if(f) {
				//System.out.println("Student Registered Success..!");
				session.setAttribute("SucessMsg", "Student registration sucessfully:"+fname+" "+lname);
				resp.sendRedirect("studentreg.jsp");
			}else {
//				System.out.println("something went wrong on server ..!");
				session.setAttribute("FailedMsg", "Something went wrong, please try again after sometime..!");
			}
			
			

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		

}
