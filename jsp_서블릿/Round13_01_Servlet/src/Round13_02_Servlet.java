import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


public class Round13_02_Servlet extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		
		PrintWriter out =response.getWriter();
		
		Enumeration  names =request.getParameterNames();
		
		while(names.hasMoreElements()){
			
			String name=(String)names.nextElement();
			String value=request.getParameter(name);
			
			out.println(name + "   :   " +  value  + " <br/>");
			
			
		}
		
		
		
		
		
	}
	
	
}
