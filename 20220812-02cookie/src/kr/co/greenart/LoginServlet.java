package kr.co.greenart;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.sendRedirect(req.getContentType() + "/idremember.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//인코딩
		req.setCharacterEncoding("utf-8");
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		String rememberme = req.getParameter("rememberme");

		if (password.equals("1234")) {
			// 로그인 성공
			// 쿠키(아이디)를 담은 성공 메세지 응답

			// 쿠키생성(체크되면 쿠키가 저장됨)
			// 체크박스가 체크되야 담김.
			if (rememberme != null && rememberme.equals("on")) {
				Cookie c = new Cookie("rememberme", URLEncoder.encode(id, "utf-8"));
				c.setMaxAge(60 * 60 * 24); // 하루
				
				
				// 쿠키는 resp에담는다
				resp.addCookie(c);
			}
			// 로그인이 되었을때 확인할수있는 값 을 하나 생성.(cookie)로 그다음 추가.
			Cookie c2 = new Cookie("loginok", "ok");
			resp.addCookie(c2);
			
			
			// 메세지를 보여주기위해 로그인성공jsp보여주기
			req.getRequestDispatcher("ok.jsp").forward(req, resp);
		} else {
			// 실패
		}
		

	}

}
