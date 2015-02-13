import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Round14_06_Servlet  extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException , ServletException{
		
		/*request.setCharacterEncoding("euc-kr");
		String area =request.getParameter("area");
		
		ServletContext context =this.getServletContext();
		RequestDispatcher  dispatcher =null;
		if(area==null){	
			response.sendError(512, "���� ��ư üũ ����");
			return;
		
		}
		else if(area.equals("����")){
			dispatcher =context.getRequestDispatcher("/Servlet06_Seoul");
		}
		
		else if(area.equals("�뱸")){
			
			dispatcher=context.getRequestDispatcher("/Servlet06_Taegu");
		}
		
		dispatcher.forward(request, response);*/
		
		
		request.setCharacterEncoding("euc-kr");
		
		ServletContext  context =this.getServletContext();
		RequestDispatcher dispatcher =null;
		
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out= response.getWriter();
		out.println("<html><body>");
		out.println("�� ���� ���� ���� ���� �� <br/>");
		dispatcher =context.getRequestDispatcher("/Servlet06_Seoul");
		dispatcher.include(request, response);
		
		out.println("<br/><br/>");
		out.println("�� �뱸 ���� ���� ���� �� <br/>");
		dispatcher=context.getRequestDispatcher("/Servlet06_Taegu");
		dispatcher.include(request, response);
		
		out.println("</body></html>");
		out.close();
		
		
		
		
		
	}
}
