package com.user.servlet;

import com.DAO.ResultsDaoImp;
import com.entities.Results;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/addstudentmarks")
public class ResultServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	try {
        String RegistrationNo = req.getParameter("registrationNo");
        int Hindi = Integer.parseInt(req.getParameter("hindi"));
        int English = Integer.parseInt(req.getParameter("english"));
        int Maths = Integer.parseInt(req.getParameter("maths"));
        int Science = Integer.parseInt(req.getParameter("science"));
        int SocialScience = Integer.parseInt(req.getParameter("socialscience"));
        
        String RegNo = req.getParameter("regno");

      System.out.println();
        Results results = new Results();
        results.setRegistrationNo(RegistrationNo);
        results.setHindi(Hindi);
        results.setEnglish(English);
        results.setMaths(Maths);
        results.setScience(Science);
        results.setSocialScience(SocialScience);
        
        
        HttpSession session = req.getSession();
        ResultsDaoImp rdi = new ResultsDaoImp();
        boolean f=rdi.AddResultMarks(results);
       
	        if(f) {
	            //System.out.println("Student Registered Success..!");
	            session.setAttribute("SucessMsg2", "Student Marks added sucessfully: "+RegistrationNo);
	            resp.sendRedirect("addMarks.jsp");
	            
	        }else {
	            session.setAttribute("FailedMsg2", "Something went wrong(!!Duplicate Entry!!), please try again after sometime..!");
	        }
       
    } catch (Exception e) {
		e.printStackTrace();
	}
    }
}
