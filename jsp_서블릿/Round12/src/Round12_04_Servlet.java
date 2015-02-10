import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.util.*;

public class Round12_04_Servlet extends HttpServlet {
	public void init() {}
	public void doPost(HttpServletRequest request, HttpServletResponse response)	throws IOException, ServletException {
		String local_addr = request.getLocalAddr();
		String local_name = request.getLocalName();
		int local_port = request.getLocalPort();
		
		System.out.println();
		System.out.println("local_addr = " + local_addr);
		System.out.println("local_name = " + local_name);
		System.out.println("local_port = " + local_port);
		System.out.println();
		
		String remote_addr = request.getRemoteAddr();
		String remote_host = request.getRemoteHost();
		int remote_port = request.getRemotePort();
		
		System.out.println("remote_addr = " + remote_addr);
		System.out.println("remote_host = " + remote_host);
		System.out.println("remote_port = " + remote_port);
		System.out.println();
		
		int content_length = request.getContentLength();
		String content_type = request.getContentType();
		
		System.out.println("content_length = " + content_length + "bytes");
		System.out.println("content_type = " + content_type);
		System.out.println();
		
		Locale locale = request.getLocale();
		Enumeration locales = request.getLocales();
		
		System.out.println("locale = " + locale);
		while(locales.hasMoreElements()) {
			System.out.println("locales = " + (Locale)locales.nextElement());
		}
		System.out.println();
		
		String protocol = request.getProtocol();
		String scheme = request.getScheme();
		String server_name = request.getServerName();
		int server_port = request.getServerPort();
		boolean secure = request.isSecure();
		
		System.out.println("protocol = " + protocol);
		System.out.println("scheme = " + scheme);
		System.out.println("server_name = " + server_name);
		System.out.println("server_port = " + server_port);
		System.out.println("is_secure = " + secure);
		System.out.println();
	}
	public void destroy() {}
}
