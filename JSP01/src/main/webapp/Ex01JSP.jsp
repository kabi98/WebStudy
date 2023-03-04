<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex01JSP</title>
</head>
<body>

<!--
	JSP = Java Server Page
	HTML 내에 Java 코드를 작성하고 
	웹 서버에서 웹페이지를 생성하여 
	웹 브라우저에 돌려주는 자바를 기반으로 한 스크립트 언어
 
	JSP 파일 실행시 확장자 변환 순서 
	.jsp -> .java -> .class -> .html
	
	java 내용이 없는 경우
	.jsp -> .html 
	
	Servlet : 복잡한 로직 구현
	JSP : 화면작성, 수정 용이, HTML 중심의 코드
	
 -->

	<h1>HELLO!!</h1>
	
	<%-- 스크립트릿 주석
	 
	JSP 구성요소
	1) 지시자(Directive) : <%@ %>
	2) 선언문(Declaration) : <%! %>
	3) 스크립트릿(Scriptlet) : <%  %>
		>> jsp 내부에 java 코드를 삽입하고 싶을때 사용 !!!
	4) 표현식(Expression) : <%= %>
		>> java 코드에서 작성한 변수, 객체, 메소드 결과를 
			웹페이지에 출력하고 싶을때 사용!!
		>> .java 변환될 때 out.print()라는 메소드가 실행!!
		>> 표현식을 적을때는 안쪽에 ;(세미콜론) 사용 금지!!
	
	--%>
	
	<%
	// 스크립트릿 내부에서는 자바로 동작함. 자바 주석 사용
	for (int i=1; i<11; i++){ %>
		
		<h1> <%= i %> </h1>
	<%		
	}
	%>


</body>
</html>