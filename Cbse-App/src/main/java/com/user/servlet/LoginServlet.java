package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAO.StudentDaoImp;
import com.DB.DbConnect;
import com.entities.Student;

@WebServlet("/index")
public class LoginServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			/* StudnetDaoImp dao = new StudnetDaoImp(DbConnect.getConn()); */
			StudentDaoImp dao = new StudentDaoImp();
			HttpSession session = req.getSession();
			
			String rollno = req.getParameter("rollno");
			String password = req.getParameter("password");
			
//			System.out.println(roll+" "+password);
			String s1 = "select * from student where rollno='"+rollno+"' and password='"+password+"'";
			
			
					Student std = dao.login(rollno, password);
					if(std!=null) {
						session.setAttribute("studentObj", std);
						resp.sendRedirect("home.jsp");
					}else {
						session.setAttribute("FailedMsg", "Rollnumber or password Invalid");
						resp.sendRedirect("index.jsp");
					}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
