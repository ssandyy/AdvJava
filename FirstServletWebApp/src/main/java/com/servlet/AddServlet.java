package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{
	
	 public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int num1 = Integer.parseInt(req.getParameter("n1"));
		int num2 = Integer.parseInt(req.getParameter("n2"));
		
		int k = num1 + num2;
		//System.out.println(k);  // on console 12+55 :O/P  67 or ..
		
		PrintWriter out = res.getWriter();
		out.print("result of "+num1+" + "+num2+" : " +k);
	}
}
