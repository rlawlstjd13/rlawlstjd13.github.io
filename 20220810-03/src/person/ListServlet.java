package person;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hello.HelloServlet;

public class ListServlet extends HelloServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PersonsDao dao = new PersonsDao();
		
		try {
			List<Persons> list = dao.allList();
			req.setAttribute("list", list);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		req.getRequestDispatcher("list.jsp")
		.forward(req, resp);
	}

}
