package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	
	 public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int num1 = Integer.parseInt(req.getParameter("n1"));
		int num2 = Integer.parseInt(req.getParameter("n2"));
		
		int sum = num1 + num2;
		//System.out.println(k);  // on console 12+55 :O/P  67 or ..
		
		PrintWriter out = res.getWriter();
		out.print("result of "+num1+" + "+num2+" : " +sum);
		
		
		// SqrtServlet linkup  with Request Dispatcher     URL rewriting
		 /* req.setAttribute("sum", sum);
		 * RequestDispatcher rd = req.getRequestDispatcher("sq"); rd.forward(req, res);
		 */
		
		// Session Management
		/*
		 * HttpSession session = req.getSession(); session.setAttribute("sum", sum);
		 */
		
		//Cookie Management
		Cookie cookie = new Cookie("sum", sum + "");
		res.addCookie(cookie);
		
		res.sendRedirect("sq");
		
		//sendRedirect linkeup    URL rewriting
		//res.sendRedirect("sq?sum="+sum);
	}
}
