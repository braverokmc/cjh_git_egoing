import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Round15_04_ServletContext_02 extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		ServletContext context =this.getServletContext();
		String intro =(String)context.getAttribute("intro");
		
		
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter  out =response.getWriter();
		
		out.println("<html><body>");
		out.println("서버의 인사말 =" + intro);
		
		
		
		out.println("</body></html>");
		
		
	}
}
