import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServeTest extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		process(request, response);
		
	}
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		process(request, response);
	}
	
	
	public void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
			String uri =request.getRequestURI();
			
		
		
	}
	
	
	
	
	
}



