import java.io.*;
import javax.servlet.*;

public class Round12_02_Servlet extends GenericServlet {
	public void init() {}
	public void service(ServletRequest request, ServletResponse response) throws IOException, ServletException {
		
		String name = "Seung-Hyeon KIM";
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("HELLO SERVLET!<br>");
		out.println("My Name is " + name + "!");
		out.println("</body>");
		out.println("</html>");
	}
	public void destroy() {
		log("서블릿 관련 데이터 소멸!");
	}
}
