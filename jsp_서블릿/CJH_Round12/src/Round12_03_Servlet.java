import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Round12_03_Servlet extends HttpServlet{
	public void inti() {}
	public void doHead(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		PrintWriter out = response.getWriter();
		out.println("Head Request");
		out.close();
		
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		PrintWriter out = response.getWriter();
		out.println("Get Request");
		out.close();
		
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException , ServletException{
		PrintWriter out =response.getWriter();
		out.println("Post Request");
		out.close();
	}
	
	public void doPut(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		PrintWriter out =response.getWriter();
		out.println("Put Request");
		out.close();
		
	}
	
	public void doDelete(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		PrintWriter out = response.getWriter();
		out.println("Delete Request");
		out.close();
		
	}
	public void destroy(){}
	
}






