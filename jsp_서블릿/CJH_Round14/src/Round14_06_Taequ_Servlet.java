import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Round14_06_Taequ_Servlet extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		
		request.setCharacterEncoding("euc-kr");
		
		String name =request.getParameter("name");
		String id =request.getParameter("id");
		String pw = request.getParameter("pw");
		String area =request.getParameter("area");
		
		
		response.setContentType("text/html;charset=euc-kr" );
		PrintWriter out =response.getWriter();
		out.println("<html><body> ");
		out.println("******  여기는 대구 지역  <br/>");
		out.println("이름은  : " + name + "<br/>"); 
		out.println("지역은  : "+ area + " <br/>");
		out.println("</body></html>");
		
		
		
	}

}
