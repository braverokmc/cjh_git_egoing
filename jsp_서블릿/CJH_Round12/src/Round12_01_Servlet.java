import java.io.*;

import javax.servlet.*;



public class Round12_01_Servlet extends GenericServlet{

	public void init(){
		System.out.println("���� ���� �ʱ�ȭ �κ�!");
	}

	public void service(ServletRequest request, ServletResponse response)	throws ServletException, IOException {
		
		System.out.println("���� ���� �κ�");
	}

	public void destroy(){
		System.out.println("���� ���� ������ �Ҹ� �κ�!");
	}
	
	
}
