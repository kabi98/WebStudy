package servlet01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MakeGugu")
public class Ex07MakeGugu extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Ex06MakeTable Service 메소드 호출");
		String strColor = request.getParameter("color");
		String strStartNum = request.getParameter("StartNum");
		String strEndNum = request.getParameter("EndNum");
		System.out.printf("요청받은 데이터 >> %s, %s, %s\n", strColor, strStartNum, strEndNum);
		
		
		int iStart = Integer.parseInt(strStartNum);
		int iEnd = Integer.parseInt(strEndNum);
		
		System.out.printf("숫자로 변환 >> %d, %d \n", iStart, iEnd);
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.printf("<table border=2 bgcolor=%s >", strColor);
		for(int j=iStart; j<=iEnd; j++)
		{
			out.print("<tr border=2>");
			for(int i=1; i<9+1; i++) {
				out.printf("<td> %2d*%2d=%2d </td>", j, i, j*i);
			}
			out.print("</tr>");
		}
		
		out.print("</table>");
		out.close();
	
	
	
	}

}
