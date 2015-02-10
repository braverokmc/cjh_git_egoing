import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Round12_06_Servlet extends HttpServlet {
	//public void init() {} //필요없어서 생략
	//public void destroy() {} //필요없어서 생략
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setContentType("text/html;charset=euc-kr");
		//적절한 MIME 형식을 지정하고 문자셋도 한글로 설정
		//한글 설정은 Round13에서 자세하게 다룰 것이다.
		
		PrintWriter out = response.getWriter();
		//text OutputStream 객체를 획득
		out.println("<html>");
		//MIME을 text/html로 설정 했기 때문에 html 형식으로 응답
		out.println("<body>");
		out.println("<center>");
		out.println("<h2>요청에 응답합니다.</h2>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
		
		response.flushBuffer();
		//응답 버퍼의 내용을 강제로 전송한다.
		//여기에서 굳이 필요없는 작업이다.
		
		out.close();
		//출력 Stream을 종료한다.
	}
}
