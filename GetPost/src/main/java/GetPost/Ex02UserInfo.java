package GetPost;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserInfo")
public class Ex02UserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Ex02UserInfo Service 메소드 호출");

		// 0. post 방식 일때 요청받은 데이터 한글 인코딩 해주기
		request.setCharacterEncoding("UTF-8");
		
		String strJob = request.getParameter("job");
		String strGender = request.getParameter("gender");
		
		// 하나의 name 값에 요청받은 값이 여러개일때 꺼내오는 방법
		// --> request.getParameterValues("name값");
		// --> return type : String 배열
		String arrHobby[] = request.getParameterValues("hobby");
		System.out.printf("요청받은 데이터 >> %s, %s, %s \n", strJob, strGender, arrHobby);
		
//		for(int i=0; i<arrHobby.length; i++)
//			System.out.printf("hobby >> %s \n", arrHobby[i]);
		
		for(String s:arrHobby) {
			System.out.printf("hobby >> %s \n", s);
		}
		
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.print("<h3>");
		out.print("직업");
		out.print("</h3>");
		out.printf(" %s ", strJob);
		
		out.print("<h3>");
		out.print("성별");
		out.print("</h3>");
		out.printf(" %s ", strGender);
		
		out.print("<h3>");
		out.print("취미");
		out.print("</h3>");
//		for(int i=0; i<arrHobby.length; i++)
//			out.printf(" %s <br> ", arrHobby[i]);
		for(String s:arrHobby) {
			out.printf(" %s ", s);
		}
		
		out.close();

	}

}
