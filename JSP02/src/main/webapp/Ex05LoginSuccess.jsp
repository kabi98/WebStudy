<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Ex05Login Success </title>
</head>
<body>

	<%
		request.setCharacterEncoding("UTF-8");

		String strId = request.getParameter("id");
		
	%>
	
	<%= strId %> 님 환영합니다. <br>
	

	<a href=""> 로그아웃 </a>
	

</body>
</html>