<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 1- Login Form </title>
</head>
<body>

	<fieldset>
	<legend>로그인 프로그램</legend>
	<form action="logincheck" method="post">
	
		<input type="text" name = "id" placeholder = "ID를 입력하세요">
		<br>
		<input type="password" name = "pw" placeholder = "PW를 입력하세요">
		<br>
		<input type="submit" value = "로그인">
		<br>

	</form> 
	</fieldset>

</body>
</html>