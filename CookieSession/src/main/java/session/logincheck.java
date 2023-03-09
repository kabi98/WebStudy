package session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logincheck")
public class logincheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("logincheck - service - start");
		String strID = request.getParameter("id");
		String strPW = request.getParameter("pw");
		System.out.printf("id : %s, pw : %s %n", strID, strPW);
		
		if(strID.equals("test") && strPW.equals("12345")) {
			HttpSession session = request.getSession();
			session.setAttribute("nickname", "쿠키몬스터");
			response.sendRedirect("main.jsp");
		}
		else {
			response.sendRedirect("loginform.jsp");
		}
	}

}
