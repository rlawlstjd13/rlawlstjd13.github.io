package kr.co.greenart;

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import kr.co.greenart.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountryServlet extends HttpServlet{
//위에server가 편함.두개중에
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String continent = req.getParameter("continent");
	       CountryDAO dao = new CountryDAO();
	       List<Country> list = null;
		try {
			list = dao.getCountryByContinent("Asia");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       
	       req.setAttribute("list", list);
	       req.setAttribute("continent", continent);
	       req.getRequestDispatcher("result.jsp").forward(req, resp);
	} 
   
} 
//논리적인 사용자의 요청흐름을 서블릿이란곳에 위치시킬수 있는걸 배움..
//wqb.xml에 등록해야함 /test를 주소를 요청하면 나옴. 
//<servlet>
//<servlet-name>FirstServlet</servlet-name>
//<servlet-class>kr.co.greenart.CountryServlet</servlet-class>
//</servlet>
//<servlet-mapping>
//<servlet-name>FirstServlet</servlet-name>
//<url-pattern>/test</url-pattern>
//</servlet-mapping>
