package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.ClassesDaoImp;

public class ClassesServlet extends HttpServlet {
	
 @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 ClassesDaoImp clsImp = new ClassesDaoImp();
	 
	}
		
		
	
}
