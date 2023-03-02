package servlet01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MakeTable")
public class Ex06MakeTable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		System.out.println("Ex06MakeTable Service 메소드 호출");
		String strTableNum = request.getParameter("TableNum");
		System.out.printf("요청받은 데이터 >> %s\n", strTableNum);
		
		int iTableNum = Integer.parseInt(strTableNum);
		
		System.out.printf("숫자로 변환 >> %d \n", iTableNum);
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.print("<table border=2>");
		out.print("<tr border=2>");
		for(int i=1; i<iTableNum+1; i++) {
			out.print("<td> "+ i +" </td>");
		}
		out.print("</tr>");
		out.print("</table>");
		
		out.close();

	}

}
