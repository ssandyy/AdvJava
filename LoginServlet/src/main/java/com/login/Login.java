package com.login;
//NOTE : -->   for every secure page create Session for logged in user only then else return back to login page
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.LoginDao;

@WebServlet("/Login")
public class Login extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		/* if(uname.equals("admin") && pass.equals("admin")) { */
		
		LoginDao   log = new LoginDao();
		if(log.check(uname, pass)) {
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			response.sendRedirect("welcome.jsp");
		}else {
			response.sendRedirect("login.jsp");
		}
	}
}
