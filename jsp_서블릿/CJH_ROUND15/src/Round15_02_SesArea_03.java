import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.util.*;
import java.text.*;


public class Round15_02_SesArea_03 extends HttpServlet{

	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException{
		
		String data1 =(String)request.getAttribute("data1");
		HttpSession session =request.getSession();
		String data2 =(String)session.getAttribute("data2");
		Calendar data3 =(Calendar)session.getAttribute("data3");
		SimpleDateFormat format =new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		
		String data4 =format.format(data3.getTime());
		
		response.setContentType("text/html;charset=euc-kr");
		
		
		PrintWriter out =response.getWriter();
		
		
		out.println("<html><body>");
		
		out.println("data1 = " +data1 + "<br/>");
		out.println("data2 = " + data2 + "<br/>");
		out.println("data3 =" + data4 + "<br/><br/>");
		
		out.println("</body></html>");
		
		
	}
	
}
