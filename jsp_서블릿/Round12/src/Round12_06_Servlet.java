import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Round12_06_Servlet extends HttpServlet {
	//public void init() {} //�ʿ��� ����
	//public void destroy() {} //�ʿ��� ����
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html;charset=euc-kr");
		//������ MIME ������ �����ϰ� ���ڼµ� �ѱ۷� ����
		//�ѱ� ������ Round13���� �ڼ��ϰ� �ٷ� ���̴�.
		
		PrintWriter out = response.getWriter();
		//text OutputStream ��ü�� ȹ��
		out.println("<html>");
		//MIME�� text/html�� ���� �߱� ������ html �������� ����
		out.println("<body>");
		out.println("<center>");
		out.println("<h2>��û�� �����մϴ�.</h2>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		
		response.flushBuffer();
		//���� ������ ������ ������ �����Ѵ�.
		//���⿡�� ���� �ʿ���� �۾��̴�.
		
		out.close();
		//��� Stream�� �����Ѵ�.
	}
}
