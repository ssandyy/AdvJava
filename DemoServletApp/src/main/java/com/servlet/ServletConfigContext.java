package com.servlet;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigContext extends HttpServlet{
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
				
			PrintWriter out = res.getWriter();
				out.println("hi <br>");
				
				ServletContext ctx = getServletContext() ;
				String str = ctx.getInitParameter("name");
				String str2 = ctx.getInitParameter("phone");
				out.println(str2 + str);
				
		}
}