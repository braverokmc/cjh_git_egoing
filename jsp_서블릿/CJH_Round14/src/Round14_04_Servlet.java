import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Round14_04_Servlet  extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	
		
		String su1_str =request.getParameter("su1");
		String su2_str =request.getParameter("su2");
		int su1=0, su2=0;
		try{
		
			su1 =Integer.parseInt(su1_str);
			 su2 =Integer.parseInt(su2_str);
			
		}catch(NumberFormatException e){
			response.sendError(510, "정수를 입력하지 않은 오류!");
			return;
		}
		
		
		int result =0;
		
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out =response.getWriter();
		
		try{
		
			result =su1/su2;
		}catch(ArithmeticException e){
			response.sendError(511, "부적합 연산 관련 오류!");
			return;
		}
		
		out.println("<html><body><center>");
		out.println(su1 + " /" + su2 + " = " + result);
		out.println("</center></body></html>");
		out.close();
		
		

	}
}
