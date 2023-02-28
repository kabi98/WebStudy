package servlet01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Table")
public class Ex02Table extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Service 메소드 호출");
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();

//		out.print("<table border=2>");
//		out.print("<tr border=2>");
//		out.print("<td> 1 </td>");
//		out.print("<td> 2 </td>");
//		out.print("<td> 3 </td>");
//		out.print("<td> 4 </td>");
//		out.print("<td> 5 </td>");
//		out.print("<td> 6 </td>");
//		out.print("</tr>");
//		out.print("</table>");
		
		out.print("<table border=2>");
		out.print("<tr border=2>");
		for(int i=1; i<10; i++) {
			out.print("<td> "+ i +" </td>");
		}
		out.print("</tr>");
		out.print("</table>");
		
		out.close();
		
		
	}

}
