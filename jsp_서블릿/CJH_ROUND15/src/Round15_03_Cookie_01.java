import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Round15_03_Cookie_01 extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
		String idd ="";
		
		Cookie[] cookies =request.getCookies();
		for(int i=0; cookies !=null && i<cookies.length; ++i){
			
			String key =cookies[i].getName();
			if(key.equals("id")){
				
				idd=cookies[i].getValue();
				idd=java.net.URLDecoder.decode(idd, "euc-kr");
			}
			
			
		}
		
		
		
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head><title>Log In!</title></head>");
		out.println("<body>");
		out.println("<center>");
		
		out.println("<form method='post' action='Servlet03_02'>");
		out.println("<table border='1'");
		out.println("<tr>");
		out.println("<td align='right' width='30%' > 아뒤 : </td>");
		
		
		out.println("<td align='center'><input type='text' name='id' value='" + idd + "' size='10' /></td>");
		
		
		
		
		out.println("<td align='center' rowspan='2' ><input type='submit' value='로그인'></td>" );
		
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td align='right' width='30%'> 비번 : </td>");
		out.println("<td align='center'><input type='password' name='pw' size='10' /></td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td align ='left' colspan='3'> <input type='checkbox' name='id_rem' value='chk' /> "
				+ "아이디 기억하기 </td>" );
		out.println("</tr>");
		
		out.println("</table>");
		out.println("</form>");
		
		out.println("</center></body></html>");
	
		
		
		
		
		
		
		
	}

}
