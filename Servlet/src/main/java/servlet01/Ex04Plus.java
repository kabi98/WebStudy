package servlet01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Plus")
public class Ex04Plus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Ex04Plus Service 메소드 호출");
		String strNum1 = request.getParameter("num1");
		String strNum2 = request.getParameter("num2");
		System.out.printf("요청받은 데이터 >> %s, %s\n", strNum1, strNum2 );
		
//		int iNum1 = Integer.valueOf(strNum1);
//		int iNum2 = Integer.valueOf(strNum2);

		int iNum1 = Integer.parseInt(strNum1);
		int iNum2 = Integer.parseInt(strNum2);
		
		System.out.printf("숫자로 변환 >> %d, %d\n", iNum1, iNum2 );
		response.setContentType("text/html;charset=UTF-8");
		
		
		PrintWriter out = response.getWriter();
		out.print("<h3>");
		out.printf(" %3d + %3d = %3d ", iNum1, iNum2, iNum1+iNum2);
		out.print("</h3>");
		
		out.close();
	
	
	
	
	}

}
