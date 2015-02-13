import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Round14_01_Servlet  extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException , ServletException{
	
		ServletConfig  config = this.getServletConfig();
		String start =config.getInitParameter("start");
		String end =config.getInitParameter("end");
		
		int start_su =Integer.parseInt(start);
		int end_su =Integer.parseInt(end);
		
		
		int hap=0;
		
		for(int i=start_su; i<=end_su;  ++i){
			hap +=i;
			
		}
		
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		
		out.println("<html><body><center>");
		out.println(start_su + "~" + end_su + "사이의 합은");
		out.println(hap + "입니다.");
		
		out.println("</center></body></html>");
		
		out.close();
		
	
	}
}




