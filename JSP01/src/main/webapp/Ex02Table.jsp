<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Ex02 Table </title>
</head>
<body>

	<table border=2>
		<tr border=2>
		
		<%
		for (int i=1; i<11; i++){ %>
			
			<td> <%= i %> </td>
		<%		
		}
		%>
		</tr>
	</table>

</body>
</html>