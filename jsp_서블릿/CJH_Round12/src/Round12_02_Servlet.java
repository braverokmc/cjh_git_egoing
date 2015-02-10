import java.io.*;

import javax.servlet.*;

public class Round12_02_Servlet extends GenericServlet{
	
	public void init() {}
	
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		String name="choi - jun - ho";
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Hello SERVLET!<br>");
		out.println("My Name id " + name + "!");
		out.println("</body)");
		out.println("</html>");
		out.close();
	}

	public void destroy(){
		log("서블릿 관련 데이터 소멸!");
	}
	
	
	
}
