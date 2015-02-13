import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Round15_03_Cookie_02 extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
	
		
		request.setCharacterEncoding("euc-kr");
		
		String id =request.getParameter("id");
		String pw =request.getParameter("pw");
		String id_rem =request.getParameter("id_rem");
		
		
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out =response.getWriter();
		out.println("<html><body><center><h2>");
		out.println(id + "(" + pw + " )님 로그인 성공!!!");
		out.println("</h2><br/>");
		
		
		if(id_rem!=null && id_rem.equals("chk")){
			Cookie  id_cookie =new Cookie("id", java.net.URLEncoder.encode(id, "euc-kr"));
			
			id_cookie.setComment("아이디 저장");
			id_cookie.setPath("/");
			id_cookie.setMaxAge(60*60*24*365);
			response.addCookie(id_cookie);
			
			out.println("쿠키 저장 성공");
			out.println("</center></body></html>");
		}
		
		
		
		
	}
}
