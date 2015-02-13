import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Round14_03_Servlet extends HttpServlet{
	private int cnt =0;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		response.setContentType("text/html;charset=euc-kr");
		response.setHeader("refresh", "3");
		PrintWriter  out = response.getWriter();
		out.println("<html><body>");
		out.println("cnt = " + cnt++);
		out.println("</body></html>");
		out.close();
	}
}
