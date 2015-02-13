import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class Round15_01_ReqArea_02 extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		String data1 =(String)request.getAttribute("data1");
		Vector data2 =(Vector)request.getAttribute("data2");
		String data3=request.getParameter("data3");
		String data4=request.getParameter("data4");
		
		
		response.setContentType("text/html;charset=euc-kr");
		
		
		PrintWriter out =response.getWriter();
		out.println("<html>");
		out.println("<body>");
		
		out.println("data1=" + data1 + "<br/>");
		
		out.println("data2 =");
		for(int i=0; i<data2.size(); ++i){
			out.println(data2.get(i) + " ");
		}
		
		out.println("<br/>");
		out.println("data3 =" + data3 + "<br/>");
		out.println("data4 =" + data4 + "<br/>");
		
		
		out.println("</body>");
		out.println("</html>");
		
		
	}
}
