package person;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hello.HelloServlet;

public class PersonServlet extends HelloServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");// 한글꺠짐 ㅠ 수정완료
		// 입력값 유효한지?
		// 모든 값은 필수
		// 이름, 성 10자
		// 나이정수
		// 이메일 고유50자
		// 사람을 다루는 로직은 딴데다가? 여기선 입력만 받고?
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		// 그러면 잘못됬을떈 사용자에게 안내 뭐라함?

		// error 객체 소환
		// 가장 큰맵에 에러 맵을 담는다.........
		PersonValidator validator = new PersonValidator();
		Map<String, String> errors = new HashMap<String, String>();

		errors.putAll(validator.isValidName(name));
		errors.putAll(validator.isValidAge(age));
		// 사이즈가 1개이상이면 에러가 났다.
		// 리퀘스트에 담는다.
		if (errors.size() > 0) {
			req.setAttribute("errors", errors);
			req.getRequestDispatcher("viewadd.jsp").forward(req, resp);
		} else {
			// 나머지 에러가안나면 원래 흐름되로 가도록 else로감쌈.

			PersonsDao dao = new PersonsDao();
			try {
				List<Persons> list = dao.addPersons(name, Integer.valueOf(age));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 나중에 목록페이지로 보낼거임 /list하면됨.
			resp.sendRedirect(req.getContextPath() + "/list");
		}

	}
}
