import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Round14_05_Servlet extends HttpServlet{
	
	public void service (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		String method =request.getMethod();
		
		if(method.equalsIgnoreCase("GET")){
			response.sendRedirect("Round14_05_Get_Servlet.html");
			return;
			
			
		}else if(method.equalsIgnoreCase("POST")){
			
			response.sendRedirect("Round14_05_Post_Servlet.html");
			return;
			
		}
		
		
		
		
	}
}
