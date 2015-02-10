import java.io.*;

import javax.servlet.*;



public class Round12_01_Servlet extends GenericServlet{

	public void init(){
		System.out.println("서블릿 파일 초기화 부분!");
	}

	public void service(ServletRequest request, ServletResponse response)	throws ServletException, IOException {
		
		System.out.println("서블릿 내용 부분");
	}

	public void destroy(){
		System.out.println("서블릿 파일 데이터 소멸 부분!");
	}
	
	
}
