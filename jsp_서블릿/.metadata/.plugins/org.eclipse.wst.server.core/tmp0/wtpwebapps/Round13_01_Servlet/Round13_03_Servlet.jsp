<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>

<script type="text/javascript">

	function send_data(){
		
		var name =data_form.name.value;
		var addr =data_form.addr.value;
		location.href="http://localhost:9090/Round13_01_Servlet/Servlet03?name =" + name+ "&addr="+ addr;
	}

</script>



</head>


<body>

	<form name="data_form" method="get" action="Servlet03" >
	
		이름  : <input type="text" name="name" /> <br/>
		주소  : <input type="text" name="addr" size="30"/> <br/>
		
		<input type="button" value="전송1" onClick="send_data()" />
		<input type="submit" value="전송2"  />
	
	</form>
	



</body>
</html>