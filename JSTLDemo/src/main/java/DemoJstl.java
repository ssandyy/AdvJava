

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JSTLDemo")
public class DemoJstl  extends HttpServlet{
	protected void doGet(HttpServletRequest request,  HttpServletResponse response) throws ServletException, IOException {
		String name ="Sandeep";
		
		request.setAttribute("lable", name);
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);
	}
}
