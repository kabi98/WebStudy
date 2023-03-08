package cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MakeCookie")
public class Ex01MakeCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/**********************************************
		쿠키와 세션은 왜 필요할까?
		HTTP의 특성 :
			1) connectionless - 비연결성 : 응답후에 연결을 끊는다.
				- 클라이언트가 요청을 한 후 응답을 받으면 그 연결을 끊어 버리는 특징
			2) stateless - 무상태 : 요청 상태를 저장하지 않는다.
				- 통신이 끝나면 상태를 유지하지 않는 특징
				
		쿠키와 세션을 이용하여 상태를 유지한다.
		포츈 쿠키를 떠올리면 도움이 될것.
		
		Cookie
		: 클라이언트(브라우저)에 저장되는 키와값이 들어있는 작은 데이터파일.
		1. 클라이언트가 페이지 요청(request) client 
		2. 상태를 유지하고 싶은 값을 쿠키로 생성. server
		3. http 헤더에 쿠키를 포함시켜 응답 server->client
		4. 브라우저가 종료되어도 쿠키 만료 기간이 있다면 클라이언트에서 보관
		5. 같은 요청을 할 경수 http 헤더에 쿠키를 함께 보냄
		6. 서버에서 쿠키를 읽어 이전 상태정보를 변경할 필요가 있을때 
			쿠키를 업데이트하여 변경된 쿠키를 http 헤더에 포함시켜 응답
		
				
		************************************************/
		
		System.out.println("Ex01MakeCookie - service - start");
		
		// Server(쿠키를 생성하는 곳)
		// 1. 쿠키 생성하기.
		Cookie cookie = new Cookie("data", "cookieData");
		
		// 쿠키의 만료기한
		// 	>> 별도로 설정하지 않는다면 만료기한은 Session 으로 표기됨.
		// 	>> 브라우저가 종료되기 전까지만 보관하겠다 라는 의미
		
		// 쿠키의 만료기한 설정하는 방법
		// setMaxAge(초단위 숫자값)
		cookie.setMaxAge(365*86400);

		// 쿠키 지우는 방법
		// 만료기한을 0으로 설정하면 브라우저가 인식하고 삭제함.
		// cookie.setMaxAge(0);
		
		// 2. 쿠키를 http 헤더에 포함을 시켜서 응답에 담아주기
		// 		>> 응답에 담아주기 전에 쿠키에 대한 모든 설정을 끝내야 한다.
		response.addCookie(cookie);
		
		// 3. Ex02Cookie.jsp 이동
		response.sendRedirect("Ex01Cookie.jsp");
		
	}

}
