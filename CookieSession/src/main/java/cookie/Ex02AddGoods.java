package cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddGoods")
public class Ex02AddGoods extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Ex02AddGoods - service - start");
		
		// 1. 요청받은 데이터 꺼내오기
		// 2. 요청받은 데이터들의 갯수 만큰 쿠키를 생성
		// 3. 생성된 쿠키를 응답 객체에 담아주기
		// 4. Shop.jsp로 이동
		
		String [] listProduct = request.getParameterValues("product");
		
		for(int i = 0; i<listProduct.length; i++)
		{
			String strName = "product-" + i;
			Cookie cookie = new Cookie(strName, listProduct[i]);
			cookie.setMaxAge(5);
			response.addCookie(cookie);
		}
		response.sendRedirect("Shop.jsp");
	}

}
