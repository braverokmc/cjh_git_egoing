import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Round15_04_ServletContext_01  extends HttpServlet{
		
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException{
		
		String intro ="�ȳ��ϼ���! �츮 ������ ���Ű��� ȯ���մϴ�.";
		
		ServletContext context =this.getServletContext();
		context.setAttribute("intro", intro);
		
		
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out =response.getWriter();
		out.println("<html><body>");
		out.println("ServletContext ������ ���� �Ϸ�!");
		
		out.println("<a href='./Servlet04_02' >�̵��ϱ� </a> ");
		out.println("</body></html>");
		
		
	}
}
