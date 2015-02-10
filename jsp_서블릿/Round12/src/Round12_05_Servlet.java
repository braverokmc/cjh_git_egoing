import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.security.*; //Principal 클래스를 사용하기 위해 import

public class Round12_05_Servlet extends HttpServlet {
	public void init() {} 
	//초기화 작업이 필요 없다면 작성하지 않아도 된다.
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String auth_type = request.getAuthType();
		//인증이 사용되지 않았기 때문에 null 값 반환
		String context_path = request.getContextPath();
		//프로젝트 명과 동일한 Round12 값을 반환
		String method = request.getMethod();
		//GET 방식 요청이므로 get 값을 반환 
		String path_info = request.getPathInfo();
		//URL의 웹 경로상 부가 정보가 없기 때문에 null 값을 반환
		String path_translated = request.getPathTranslated();
		//path_info 가 null 이기 때문에 실제 VM 경로 상으로도 부가정보가 없음.
		String query_string = request.getQueryString();
		//주소줄의 '?' 이후 데이터인 data = GET+DATA%21%21%21 값이 반환
		//%21은 '!'의 encode 값이다.
		String remote_user = request.getRemoteUser();
		//인증이 사용되지 않았으므로 null 값 반환
		String requested_sessionid = request.getRequestedSessionId();
		//세션을 사용하지 않았으므로 null 값 반환
		String request_uri = request.getRequestURI();
		//http://localhost:8080 이후에서 '?' 이전까지의 데이터 반환
		StringBuffer request_url = request.getRequestURL();
		//http 부터 '?' 이전까지의 데이터 반환
		String servlet_path = request.getServletPath();
		//web.xml에 등록한 실제 서블릿의 이름 반환
		Principal principal = request.getUserPrincipal();
		//인증이 사용되지 않았으므로 null 객체 생성
		
		System.out.println();
		System.out.println("auth_type = " + auth_type);
		System.out.println("context_path = " + context_path);
		System.out.println("method = " + method);
		System.out.println("path_info = " + path_info);
		System.out.println("path_translated = " + path_translated);
		System.out.println("query_string = " + query_string);
		System.out.println("remote_user = " + remote_user);
		System.out.println("requested_sessionid = " + requested_sessionid);
		System.out.println("request_uri = " + request_uri);
		System.out.println("request_url = " + request_url.toString());
		System.out.println("servlet_path = " + servlet_path);
		System.out.println("principal = " + principal);
		System.out.println();
		
		boolean is_requested_sessionid_from_cookie = request.isRequestedSessionIdFromCookie();
		//세션을 사용하지 않았으므로 false 값 반환
		boolean is_requested_sessionid_from_url = request.isRequestedSessionIdFromURL();
		//세션을 사용하지 않았으므로 false 값 반환
		boolean is_requested_sessionid_valid = request.isRequestedSessionIdValid();
		//세션을 사용하지 않았으므로 false 값 반환
		boolean is_user_in_role = request.isUserInRole("");
		//인증을 사용하지 않기 때문에 false 값 반환
		
		System.out.println("is_requested_sessionid_from_cookie = " + is_requested_sessionid_from_cookie);
		System.out.println("is_requested_sessionid_from_url = " + is_requested_sessionid_from_url);
		System.out.println("is_requested_sessionid_valid = " + is_requested_sessionid_valid);
		System.out.println("is_user_in_role = " + is_user_in_role);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String auth_type = request.getAuthType();
		String context_path = request.getContextPath();
		String method = request.getMethod();
		String path_info = request.getPathInfo();
		String path_translated = request.getPathTranslated();
		String query_string = request.getQueryString();
		String remote_user = request.getRemoteUser();
		String requested_sessionid = request.getRequestedSessionId();
		String request_uri = request.getRequestURI();
		StringBuffer request_url = request.getRequestURL();
		String servlet_path = request.getServletPath();
		Principal principal = request.getUserPrincipal();
		
		System.out.println();
		System.out.println("auth_type = " + auth_type);
		System.out.println("context_path = " + context_path);
		System.out.println("method = " + method);
		System.out.println("path_info = " + path_info);
		System.out.println("path_translated = " + path_translated);
		System.out.println("query_string = " + query_string);
		System.out.println("remote_user = " + remote_user);
		System.out.println("requested_sessionid = " + requested_sessionid);
		System.out.println("request_uri = " + request_uri);
		System.out.println("request_url = " + request_url.toString());
		System.out.println("servlet_path = " + servlet_path);
		System.out.println("principal = " + principal);
		System.out.println();
		
		boolean is_requested_sessionid_from_cookie = request.isRequestedSessionIdFromCookie();
		boolean is_requested_sessionid_from_url = request.isRequestedSessionIdFromURL();
		boolean is_requested_sessionid_valid = request.isRequestedSessionIdValid();
		boolean is_user_in_role = request.isUserInRole("");
		
		System.out.println("is_requested_sessionid_from_cookie = " + is_requested_sessionid_from_cookie);
		System.out.println("is_requested_sessionid_from_url = " + is_requested_sessionid_from_url);
		System.out.println("is_requested_sessionid_valid = " + is_requested_sessionid_valid);
		System.out.println("is_user_in_role = " + is_user_in_role);
		System.out.println();
	}
	
	public void destroy() {}
	//데이터 정리 작업 역시 필요 없다면 작성하지 않아도 된다.
}
