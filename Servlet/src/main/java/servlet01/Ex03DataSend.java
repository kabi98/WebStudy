package servlet01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DataSend")
public class Ex03DataSend extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 요청을 받는 공간 !! (데이터 가져오는 공간)
		System.out.println("Service 메소드 호출");
		
		// 1. 요청받은 데이터 꺼내오기 
		String strData = request.getParameter("data");
		System.out.printf("요청받은 데이터 >> %s\n", strData );
		
		// ex) 요청받은 데이터 --> 김운비
		// 김운비님 환영합니다! 웹페이지에 출력하기
		// ex) 요청받은 데이터 --> 강규남
		// 강규남님 환영합니다! 웹페이지에 출력하기
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<h3>");
		out.printf("%s 님 환영합니다 !!!", strData);
		out.print("</h3>");
		
		out.close();
		
	}

}
