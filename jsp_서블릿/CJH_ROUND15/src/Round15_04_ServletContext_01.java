import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Round15_04_ServletContext_01  extends HttpServlet{
		
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException{
		
		String intro ="안녕하세요! 우리 서버에 오신것을 환영합니다.";
		
		ServletContext context =this.getServletContext();
		context.setAttribute("intro", intro);
		
		
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out =response.getWriter();
		out.println("<html><body>");
		out.println("ServletContext 데이터 생성 완료!");
		
		out.println("<a href='./Servlet04_02' >이동하기 </a> ");
		out.println("</body></html>");
		
		
	}
}
