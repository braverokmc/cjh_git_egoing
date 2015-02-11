
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Round13_03_Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
	
		String name =request.getParameter("name");
//		name =new String(name.getBytes("ISO8859_1"),"euc-kr");
		
		
		String addr =request.getParameter("addr");
	//	addr =new String(addr.getBytes("ISO8859_1"),"euc-kr");
		
		
		System.out.println();
		System.out.println("name =" + name);
		System.out.println("addr =" + addr);
		System.out.println();
		
	}
}
