
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.http.*;
import javax.servlet.*;


public class Round13_04_Servelet extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
			
			
			request.setCharacterEncoding("euc-kr");
		
			String name =request.getParameter("name");
			String id =request.getParameter("id");
			String pw =request.getParameter("pw");
			String addr =request.getParameter("addr");
		
			
/*			System.out.println("name =" + name);
			System.out.println("id = "+ id);
			System.out.println("pw = " + pw);
			System.out.println("addr =" + addr);
*/			
			
		//	response.setCharacterEncoding("euc-kr");
			response.setContentType("text/html;charset=euc-kr");
			
			PrintWriter out =response.getWriter();
			
			out.println("<html>");
			out.println("<body>");
			out.println("name = " + name + " <br/>");
			out.println("id = " + id + "<br/>");
			out.println("pw = " + pw + "<br/>");
			out.println("addr =" + addr);
			out.println("</body>");
			out.println("</html>");
			
			
			
			out.close();
			
		
	}

}





