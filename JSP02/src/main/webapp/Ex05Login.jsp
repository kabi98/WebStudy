<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Ex05 Login </title>
</head>
<body>

	<%
		request.setCharacterEncoding("UTF-8");

		String strId = request.getParameter("id");
		String strPw = request.getParameter("pw");
		
		if(strId.equals("smart") && strPw.equals("123")){
			response.sendRedirect("Ex05LoginSuccess.jsp?id="+strId);
		} else if(strId.equals("test") && strPw.equals("123")){
				response.sendRedirect("Ex05LoginSuccess.jsp?id="+strId);
		} else {
			response.sendRedirect("Ex05LoginFail.jsp");
		}
		
	%>
	
		id <%= strId %> <br>
		pw <%= strPw %> <br>

</body>
</html>