package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqrtServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int k=0;
		
		// sendRedirect URL
		 int sr1 = Integer.parseInt(req.getParameter("sum")); sr1 = sr1*sr1;
		 PrintWriter out1 = res.getWriter();
		 out1.println("SquareRoot of sum of entered numbers: "+sr1);
		 
		 
		 //RequestDispatcher 
		/*
		 * int sr = (int) req.getAttribute("sum"); sr = sr * sr; PrintWriter out =
		 * res.getWriter(); out.println("SquareRoot of sum of entered number: " + sr);
		 */
		  
		
		  
		  // Session Management
			/*
			 * HttpSession session = req.getSession(); int k = (int)
			 * session.getAttribute("sum"); k = k*k; PrintWriter out2 = res.getWriter();
			 * out2.println("SquareRoot of sum of entered number: "+k);
			 */
		  
		
		
		  //Cookies
			/*
			 * Cookie cookie[] = req.getCookies(); for(Cookie c : cookie) { if
			 * (c.getName().equals("sum")) { k=Integer.parseInt(c.getValue()); } } k = k *
			 * k; PrintWriter out = res.getWriter();
			 * out.println("SquareRoot of sum of entered number with Cookie: " + k);
			 */
		  

	}

}
