import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Round12_06_Servlet extends HttpServlet{

		public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
			response.setContentType("text/html;charset=euc-kr");
			PrintWriter out =response.getWriter();
			out.println("<html>");
			out.println("<body>");
			out.println("<center>");
			out.println("<h2>��û�� �����մϴ�. </h2>");
			out.println("</center>");
			out.println("</body>");
			out.println("</html>");
			response.flushBuffer();
			out.close();
		}
	
	
	
}
