import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Round14_06_Seoul_Servlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
	
	
		request.setCharacterEncoding("euc-kr");
		
		
		String name =request.getParameter("name");
		String id =request.getParameter("id");
		String pw =request.getParameter("pw");
		String area =request.getParameter("area");
		
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out =response.getWriter();
		out.println("<html><body>");
		out.println("����� �̸��� " +  name + "<br/>") ;
		out.println (" ����  ����� " + id + "<br/>");
		out.println ("������ :" + area);
		out.println("��� ���ΰ�?");
		out.println("</body></html>");
		
		
	
	}
}
