<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Ex04 Move Url </title>
</head>
<body>

	<%
		// 1. 요청받은 데이터 꺼내오기
		// 2. 요청받은 데이터가 구글, 네이버, 다음 중 어느것인지 조건 비교
		// 3. 조건에 따라서 다른 페이지로 이동
		//
		// response.sendRedirect("https://www.google.com/");
		// 
		
		
		// 1. 요청받은 데이터 꺼내오기
		String strUrl = request.getParameter("url");
		
		// 2. 요청받은 데이터가 구글, 네이버, 다음 중 어느것인지 조건 비교
		if(strUrl.equals("네이버")){
			// https://www.naver.com/
			response.sendRedirect("https://www.naver.com/");
		}else if(strUrl.equals("구글")){
			// https://www.google.com/
			response.sendRedirect("https://www.google.com/");
		}else if(strUrl.equals("다음")){
			// https://www.daum.net/
			response.sendRedirect("https://www.daum.net/");
		}else{
			
		}
			
		// 3. 조건에 따라서 다른 페이지로 이동
		// response.sendRedirect("url경로");
		// 	>> 요청 2번, 응답 2번
		// 	>> Client 의 요청이 들어왔을 때, 
		//		Client 에게 또다른 서버로 요청을 보내라고 알려주는 것.  
		// 	>> 페이지 이동.
	%>

</body>
</html>