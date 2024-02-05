package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddGetServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int num1 = Integer.parseInt(req.getParameter("n1"));
		int num2 = Integer.parseInt(req.getParameter("n2"));
		
		int sum = num1 +num2;
		
		PrintWriter pw = res.getWriter();
		pw.print(sum);
	}
}
