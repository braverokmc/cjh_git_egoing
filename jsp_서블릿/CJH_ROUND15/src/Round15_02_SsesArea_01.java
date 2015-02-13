import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.util.*;


public class Round15_02_SsesArea_01 extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		request.setAttribute("data1", "최준호");
		HttpSession session =request.getSession(true);
		session.setAttribute("data2", "자바");
		Calendar data3 =Calendar.getInstance();
		session.setAttribute("data3", data3);
		
		ServletContext context =this.getServletContext();
		RequestDispatcher dispatcher =context.getRequestDispatcher("/Servlet02_02");
		dispatcher.forward(request, response);
		
	}

}
