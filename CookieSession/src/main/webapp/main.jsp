<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> main </title>
</head>
<body>

	main
	<%
		String nickname = (String)session.getAttribute("nickname");	
	%>
	
	<h3> <%=nickname %> 님 환영 합니다. </h3>
	<a href="" >로그아웃</a>
	


</body>
</html>