<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

<%  
	String title ="VIEW 영역입니다.";
	out.println("<title>" + title + "</title>");
%>

</head>
<body>


<center>
		      
		      
		      <%
		      String[] subject=new String[] { "이름", "나이", "전화"};
				String[] names = new String[] {"NAME", "AGE", "TEL"};
		
				 %>
				
		<table width="40%" border="1">
			<%
				
				
				for(int i=0; i<subject.length;  ++i){
				
					out.println("<tr>");
					out.println("<th width='30%'> ");
					out.println(subject[i] + " </tr>");
					out.println("<td width='70%' align='CENTER'>" );
					out.println("<input type='TEXT'");
					out.println(" name=" + "'"+ names[i]+"'" + " size='27%' />" );
					out.println("</td>");
					out.println("</tr>");
				
				
				}
					
			%>
		</table>
	</center>



</body>
</html>