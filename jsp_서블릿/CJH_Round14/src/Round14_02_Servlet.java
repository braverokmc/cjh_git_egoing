import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.util.*;


public class Round14_02_Servlet extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		
		request.setCharacterEncoding("euc-kr");
		String name =request.getParameter("name");
		String[] skills =request.getParameterValues("skil");
		
		Enumeration  enu =request.getHeaderNames();
		
		Vector  names =new Vector();
		Vector  values = new Vector();
		while(enu.hasMoreElements()){
			
			String header_name =(String)enu.nextElement();
			String header_value =request.getHeader(header_name);
			
			names.add(header_name);
			values.add(header_value);
		}
		
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter  out =response.getWriter();
		out.println("<html><body>");
		
		out.println("★ 전달받은 데이터들 ★ <br/>");
		out.println("name :" + name + "</br>");
		out.println("skil :");
		for(int i=0; i<skills.length; i++){
			
			out.println(skills[i] + " ");
			
		}
		out.println("<br/><br/><br/><br/>");
		
		
		out.println("★ 전달받은 헤더 정보들 ★ <br/>");
		for(int i=0; i<names.size(); ++i){
			
			String header_name=(String)names.elementAt(i);
			String header_value=(String)values.elementAt(i);
			out.println(header_name + "  :");
			out.println(header_value + " <br/> ");
			
		}
		
		out.println("</body></html>");
		out.close();
		
		
	
	}
	

}






