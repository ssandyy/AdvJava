package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqrtServlet extends HttpServlet{
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
				
			int sr = (int) req.getAttribute("sum");
			sr = sr*sr;
			
			
			PrintWriter out = res.getWriter();
			out.println("SquareRoot of sum of entered number: "+sr);
		}

}
