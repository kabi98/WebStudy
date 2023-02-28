package servlet01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Print")
public class Ex01Print extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Service 메소드 호출");
		
		// service 메소드 매개변수
		// --> client로 부터 요청이 들어오는 순간 서버에서 자동으로 매개변수를 받아온다.
		// 1. request
		// : 클라이언트의 요청 정보를 가지고 있는 객체
		// 2. response
		// : 서블릿이 클라이언트 응답을 보낼때 사용하는 객체
		// : 응답 정보를 가지고 있는 객체
		
		// 웹 페이지 출력 --> 응답을 되돌려준다.
		// 0. 응답 형식 지정(문서 html파일, 한글 인코딩)
		response.setContentType("text/html;charset=UTF-8");
		
		// 웹페이지에 출력 --> 응답을 되돌려준다.
		// 1. 출력할 수 있는 도구를 가져온다.
		PrintWriter out = response.getWriter();

		for(int i = 0; i< 3; i++) {
			out.print("<h3>");
			out.print("규남쌤반 화이팅 !!!");
			out.print("</h3>");
		}
		
		out.close();
		
		
		
		
	}

}
