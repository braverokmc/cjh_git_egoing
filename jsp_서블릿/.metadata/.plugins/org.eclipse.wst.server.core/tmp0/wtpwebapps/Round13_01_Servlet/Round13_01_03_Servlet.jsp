<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>



<script language="javascript">

	function send_data () {
		window.open ("http://localhost:9090/Round13_01_Servlet/Servlet01?su1=100&su2=200",
													"popup", "location=yes, width=800, height=100");
	}
</script>


</head>



<body>

	<center>
	
		<a href="#" onClick="send_data()">��ũ</a>
		&nbsp;&nbsp; or &nbsp;&nbsp; <input type="button" onClick="send_data()" value="��ư" />
	
	
	
	
	</center>





</body>
</html>