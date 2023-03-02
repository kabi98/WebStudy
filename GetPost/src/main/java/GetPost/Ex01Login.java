package GetPost;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Ex01Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Ex01OLogin Service 메소드 호출");

		// 0. post 방식 일때 요청받은 데이터 한글 인코딩 해주기
		request.setCharacterEncoding("UTF-8");
		
		String strId = request.getParameter("Id");
		String strPw = request.getParameter("Pw");
		String strResult = "";
		System.out.printf("요청받은 데이터 >> %s, %s \n", strId, strPw);
		
		if(strId.equals("smart") && strPw.equals("123")){
			strResult = "smart 님 환영합니다.";
		}
		else {
			strResult = "ID/PW 를 다시 확인해 주세요 ";
			
		}
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.print("<h3>");
		out.printf(" %s ", strResult);
		out.printf(" %s ", strId);
		out.print("</h3>");
		
		out.close();
		
		
	}

}
