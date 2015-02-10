import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.sun.net.httpserver.HttpsExchange;

import java.security.*;

public class Round12_05_Servlet extends HttpServlet{
		
		public void init() {}
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
			String auth_type =request.getAuthType();
			String context_path =request.getContextPath();
			String  method =request.getMethod();
			String path_info =request.getPathInfo();
			String path_translated =request.getPathTranslated();
			String query_string =request.getQueryString();
			String remote_user =request.getRemoteUser();
			String requested_sessionid =request.getRequestedSessionId();
			String request_uri =request.getRequestURI();
			StringBuffer  request_url = request.getRequestURL();
			String servlet_path =request.getServletPath();
			Principal principal =request.getUserPrincipal();
			
			System.out.println();
			System.out.println("auth_type = " + auth_type);
			System.out.println("context_path =" + context_path);
			System.out.println(" method = " + method);
			System.out.println("path_info =" + path_info);
			System.out.println("path_translated =" + path_translated);
			System.out.println("query_string = " + query_string);
			System.out.println("remote_user =" + remote_user);
			System.out.println("requested_sessionid =" + requested_sessionid);
			System.out.println("request_uri =" + request_uri);
			System.out.println("request_uri.toString = " + request_url.toString());
			System.out.println("servlet_path =" + servlet_path);
			System.out.println("pricipal =" + principal );
			System.out.println();
			
			boolean is_requested_sessionid_from_cookie = request.isRequestedSessionIdFromCookie();
			boolean is_requested_sessionid_from_url =request.isRequestedSessionIdFromURL();
			boolean is_requested_sessionid_valid =request.isRequestedSessionIdValid();
			boolean is_user_in_role =request.isUserInRole("");
			
			
			System.out.println(" is_requested_sessionid_from_cookie =" + is_requested_sessionid_from_cookie);
			System.out.println("is_requested_sessionid_from_url =" + is_requested_sessionid_from_url);
			System.out.println(" is_requested_sessionid_valid =" + is_requested_sessionid_valid);
			System.out.println("is_user_in_role =" + is_user_in_role);
				
		}

		public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
			String auth_type =request.getAuthType();
			String context_path =request.getContextPath();
			String  method =request.getMethod();
			String path_info =request.getPathInfo();
			String path_translated =request.getPathTranslated();
			String query_string =request.getQueryString();
			String remote_user =request.getRemoteUser();
			String requested_sessionid =request.getRequestedSessionId();
			String request_uri =request.getRequestURI();
			StringBuffer  request_url = request.getRequestURL();
			String servlet_path =request.getServletPath();
			Principal principal =request.getUserPrincipal();
			
			System.out.println();
			System.out.println("auth_type = " + auth_type);
			System.out.println("context_path =" + context_path);
			System.out.println(" method = " + method);
			System.out.println("path_info =" + path_info);
			System.out.println("path_translated =" + path_translated);
			System.out.println("query_string = " + query_string);
			System.out.println("remote_user =" + remote_user);
			System.out.println("requested_sessionid =" + requested_sessionid);
			System.out.println("request_uri =" + request_uri);
			System.out.println("request_uri.toString = " + request_url.toString());
			System.out.println("servlet_path =" + servlet_path);
			System.out.println("pricipal =" + principal );
			System.out.println();
			
			boolean is_requested_sessionid_from_cookie = request.isRequestedSessionIdFromCookie();
			boolean is_requested_sessionid_from_url =request.isRequestedSessionIdFromURL();
			boolean is_requested_sessionid_valid =request.isRequestedSessionIdValid();
			boolean is_user_in_role =request.isUserInRole("");
			
			
			System.out.println(" is_requested_sessionid_from_cookie =" + is_requested_sessionid_from_cookie);
			System.out.println("is_requested_sessionid_from_url =" + is_requested_sessionid_from_url);
			System.out.println(" is_requested_sessionid_valid =" + is_requested_sessionid_valid);
			System.out.println("is_user_in_role =" + is_user_in_role);
		}

		public void destroy(){}

}





