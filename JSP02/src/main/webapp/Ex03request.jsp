<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Ex03 request </title>
</head>
<body>

	<%
		request.setCharacterEncoding("UTF-8");

		String strName = request.getParameter("name");
		String strJava = request.getParameter("java");
		String strWeb = request.getParameter("web");
		String strIOT = request.getParameter("IOT");
		String strAndroid = request.getParameter("ANDROID");

		int iJava = Integer.parseInt(strJava);
		int iWeb = Integer.parseInt(strWeb);
		int iIOT = Integer.parseInt(strIOT);
		int iAndroid = Integer.parseInt(strAndroid);
		
		int iAvg = (iJava + iWeb + iIOT + iAndroid) / 4;
		
		String strGrade = "";
		
		if((95 <= iAvg) && (iAvg <= 100)) {
			strGrade = "A+";
		}else if((90 <= iAvg) && (iAvg < 95)) {
			strGrade = "A";
		}else if((85 <= iAvg) && (iAvg < 90)) {
			strGrade = "B+";
		}else if((80 <= iAvg) && (iAvg < 85)) {
			strGrade = "B";
		}else {
			strGrade = "F";
		}
		
	%>
	
	<h3> 이름 <%= strName %>	</h3>
	<h3> java <%= strJava %>	</h3>
	<h3> web <%= strWeb %>	</h3>
	<h3> IOT <%= strIOT %>	</h3>
	<h3> Android <%= strAndroid %>	</h3>
	<h3> 평균 <%= iAvg %>	</h3>
	<h3> 학점 <%= strGrade %>	</h3>

</body>
</html>