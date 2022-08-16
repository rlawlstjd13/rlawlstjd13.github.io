package kr.co.greenart;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginservice")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		
		if(password != null && password.equals("qwer")) {
			//로그인성공하면 세션 객체에 담기
			 HttpSession session = request.getSession();
			 //로그인 됏다는것만 확인해주면됨 만드어서
			 session.setAttribute("loginid", id);
		}
		
		//로그인 결과 jsp로 보내기
		request.getRequestDispatcher("./loginresult.jsp").forward(request, response);
	}

}
