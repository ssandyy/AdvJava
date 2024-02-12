package com.ssandyy.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ssandyy.web.dao.AlienDao;
import com.ssandyy.web.model.Alien;

/**
 * Servlet implementation class GetAlienController
 */
public class GetAlienController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		int aidtest = Integer.parseInt(request.getParameter("aidtest"));
		AlienDao dao = new AlienDao();
		Alien a1 = dao.getAlien(aidtest);
		
		request.setAttribute("alien", a1);

		HttpSession session = request.getSession();
		session.setAttribute("xyz", a1);
		response.sendRedirect("showAlien.jsp");

		// OR
		/*
		 * RequestDispatcher rd = request.getRequestDispatcher("showAlien.jsp");
		 * rd.forward(request, response);
		 */

	}
}
