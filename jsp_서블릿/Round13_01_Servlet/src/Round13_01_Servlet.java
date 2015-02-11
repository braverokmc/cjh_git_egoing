
import java.io.*;
import java.util.Enumeration;

import javax.servlet.*;
import javax.servlet.http.*;


public class Round13_01_Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
	
		
		PrintWriter out=response.getWriter();
		
		Enumeration names =request.getParameterNames();
		
		while(names.hasMoreElements()){
			
			String name =(String)names.nextElement();
			String value =request.getParameter(name);
			
			out.println(name + "   :   " + value + "<br/>");
			
			
			
		}
		
		
		
		
		
	}
}

