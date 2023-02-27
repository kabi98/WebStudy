package servlet01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 1. url mapping 값 지정하는 방법
// -  url mapping 이란 ?
// : Web browser 에서 Servlet 을 동작 시켰을 때, 
//		실제 클래스 이름 대신 지정한 문자열을 url mapping(연결) 하는 기법
//	----> 사용하는 이유
//			1) 경로가 길어진다 : 불편함
//			2) 경로가 그대로 드러남 : 보안상 문제 발생

@WebServlet("/Create")
public class Ex00CreateServlet extends HttpServlet {
//	모든 Servlet은 HttpServlet 을 상속받는다.!	
//		--> HttpServlet이 가지고 있는 메소드, 필드를 재사횽 혹은 재정의하는 것이 가능하다.	
//		--> HttpServlet은 apache tomcat servelet container 에서 제공해 준다.
	
	// 2. 객체 직렬화 ID
	// 	--> 해당하는 파일이 Servlet임을 알려주주는 고유의 ID값
//	private static final long serialVersionUID = 1L;
	private static final long serialVersionUID = 4248413911093871491L;

	// 3. 생성자 : 객체 생성하는 순간에 호출되는 메소드	
    public Ex00CreateServlet() {
        super();
        System.out.println("생성자 호출 ! - Ex00CreateServlet()");
    }

    // 4. init(initialize)
    // : Servlet class 에게 너는 이제부터 Servlet 이야 !!! 라고 이야기 메소드
    // : 초기화
    // --> servletness
    // --> 초기값을 설정하는 역할
    // 객체를 생성하고, 초기값을 설정하는 기능은 메모리(자원, 비용)를 많이 사용한다.
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet 초기화 메소드 호출 !!");
	}

	// 5. destroy
	// : Servlet을 삭제하는 기능!(Server 를 종료하면 호출되는 메소드)
	public void destroy() {
		System.out.println("destroy 메소드 호출~~");
	}

	// 6. service
	// : main method 같은 역할
	// : Client 요청을 처리해 주는 메소드
	// --> html 코드 출력, 조건문, 반복문~ 로직을 작성하는 구간
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Service 메소드 호출");
	}

	// 7. doGet, doPost
	// --> Client 로 부터 요청을 받는 방식은 여러개 !
	// 요청 방식(get, post) 에 따라서 다른 기능을 수행하고 싶을때 사용하는 메소드
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
