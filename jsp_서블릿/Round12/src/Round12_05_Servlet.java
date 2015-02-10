import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.security.*; //Principal Ŭ������ ����ϱ� ���� import

public class Round12_05_Servlet extends HttpServlet {
	public void init() {} 
	//�ʱ�ȭ �۾��� �ʿ� ���ٸ� �ۼ����� �ʾƵ� �ȴ�.
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String auth_type = request.getAuthType();
		//������ ������ �ʾұ� ������ null �� ��ȯ
		String context_path = request.getContextPath();
		//������Ʈ ��� ������ Round12 ���� ��ȯ
		String method = request.getMethod();
		//GET ��� ��û�̹Ƿ� get ���� ��ȯ 
		String path_info = request.getPathInfo();
		//URL�� �� ��λ� �ΰ� ������ ���� ������ null ���� ��ȯ
		String path_translated = request.getPathTranslated();
		//path_info �� null �̱� ������ ���� VM ��� �����ε� �ΰ������� ����.
		String query_string = request.getQueryString();
		//�ּ����� '?' ���� �������� data = GET+DATA%21%21%21 ���� ��ȯ
		//%21�� '!'�� encode ���̴�.
		String remote_user = request.getRemoteUser();
		//������ ������ �ʾ����Ƿ� null �� ��ȯ
		String requested_sessionid = request.getRequestedSessionId();
		//������ ������� �ʾ����Ƿ� null �� ��ȯ
		String request_uri = request.getRequestURI();
		//http://localhost:8080 ���Ŀ��� '?' ���������� ������ ��ȯ
		StringBuffer request_url = request.getRequestURL();
		//http ���� '?' ���������� ������ ��ȯ
		String servlet_path = request.getServletPath();
		//web.xml�� ����� ���� ������ �̸� ��ȯ
		Principal principal = request.getUserPrincipal();
		//������ ������ �ʾ����Ƿ� null ��ü ����
		
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
		//������ ������� �ʾ����Ƿ� false �� ��ȯ
		boolean is_requested_sessionid_from_url = request.isRequestedSessionIdFromURL();
		//������ ������� �ʾ����Ƿ� false �� ��ȯ
		boolean is_requested_sessionid_valid = request.isRequestedSessionIdValid();
		//������ ������� �ʾ����Ƿ� false �� ��ȯ
		boolean is_user_in_role = request.isUserInRole("");
		//������ ������� �ʱ� ������ false �� ��ȯ
		
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
	//������ ���� �۾� ���� �ʿ� ���ٸ� �ۼ����� �ʾƵ� �ȴ�.
}
