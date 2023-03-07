<%@ page errorPage="Ex05Error.jsp"%>
<!-- errorPage : 해당하는 파일에 문제가 발생했을 때 띄워줄 페이지를 지정 -->
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- page 지시자 : JSP 페이지 내부의 전체적인 환결설정을 담당 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Ex04 Directive </title>
</head>
<body>

<%-- <%@ %> : 지시자 선언

	page 지시자
	taglib 지시자 : jstl 공부 필요??
	inclue 지시자
	 
--%>
	<%= 2/0 %>

	<%
	// JSP 에서 객체를 생성할때는 자동완성 사용하기.
	// -> 자동완성해야 import 구문이 자동으로 생성된다.
	
	ArrayList<String> listString = new ArrayList<>();
	
	%>

</body>
</html>