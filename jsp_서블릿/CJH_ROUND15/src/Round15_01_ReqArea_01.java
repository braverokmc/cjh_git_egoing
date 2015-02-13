import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import java.rmi.ServerException;
import java.util.*;

public class Round15_01_ReqArea_01  extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		
	
			String data1=new String("java!");
			Vector<String> data2=new Vector<String>();
			data2.add("c");
			data2.add("c++");
			
			request.setAttribute("data1", data1);
			request.setAttribute("data2",  data2);
		
			ServletContext context =this.getServletContext();
			RequestDispatcher  dispatcher =context.getRequestDispatcher("/Servlet01_02?data3=string&data4=ok");
		
			dispatcher.forward(request, response);
		
	}	
}
