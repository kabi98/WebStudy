package servlet01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Star")
public class H01Star extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		System.out.println("H01Star Service 메소드 호출");
		String strColor = request.getParameter("color");
		String strStarNum = request.getParameter("StarNum");
		System.out.printf("요청받은 데이터 >> %s, %s\n", strColor, strStarNum);
		
		
		int iStar = Integer.parseInt(strStarNum);
		
		System.out.printf("숫자로 변환 >> %d \n", iStar);
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.printf("<table border=1", strColor);
		for(int j=0; j<iStar+1; j++)
		{
			out.print("<tr>");
			for(int i=0; i<j; i++) {
				if(j%2 == 0)
					out.printf("<td border=1> * </td>");
				else
					out.printf("<td border=1 bgcolor=%s> * </td>", strColor);
					
			}
			out.print("</tr>");
		}
		
		out.print("</table>");
		out.close();
	
	
		
		
	}

}
