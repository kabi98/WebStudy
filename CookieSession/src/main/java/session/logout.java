package session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class logout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("logout - service - start");
		
		// 1. session 꺼내오기
		// 2. session 안에 있는 데이터 삭제하기.
		// 3. main.jsp 로 이동
		HttpSession session = request.getSession();
		
		
		// 2. session 안에 있는 데이터 삭제하기.
		session.removeAttribute("nickname");
		// 	>> removeAttribute("name값");
		//	>> 정확하게 지정한 name값에 있는 데이터만 삭제!
		session.invalidate();
		//	>> session안에 저장되어 있는 모든 데이터 무효화!

		// 3. main.jsp 로 이동
		response.sendRedirect("main.jsp");
	}

}
