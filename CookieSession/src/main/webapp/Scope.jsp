<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Scope </title>
</head>
<body>

	<%
		// JSP 에서 Scope는 전부내장객체다.
		// 요청 데이터 꺼내오기
		String r = (String) request.getAttribute("data");
		// 세션 데이터 꺼내오기
		String s = (String) session.getAttribute("data2");
		// application 데이터 꺼내오기
		String a = (String) application.getAttribute("data3");
	
	%>
	
	r <%=r %> <br>
	s <%=s %> <br>
	a <%=a %> <br>

</body>
</html>