package kr.co.greenart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

//외부라이브러리로 커넥션 객체를 만든다?
//라이브러리가 두개필요하다?ㅈㅈ
public class MyContextListener implements ServletContextListener {
	private static DataSource dataSource;

	@Override
	public void contextInitialized(ServletContextEvent sce) {

		// <context-param>
		// <param-name>driver</param-name>
		// <param-value>com.mysql.cj.jdbc.Driver</param-value>
		// </context-param>
		// xml에서 설정하여 웹 어플이 시작하는것을 표현??
		System.out.println("웹 어플리케이션 시작시 이벤트가 발생합니다.");

		// 웹 어플리케이션 첫 구동시 필요한 설정을 할 수 있음.
		// xml에 listener로 패키지만 적어주면됨?
		ServletContext context = sce.getServletContext();

		// web.xml해줘야함
		// <context-param>
		// <param-name>driver</param-name>
		// <param-value>com.mysql.cj.jdbc.Driver</param-value>
		// </context-param>
		String driver = context.getInitParameter("driver");
		System.out.println("설정값 확인:" + driver);

		String dburl = context.getInitParameter("dburl");
		String dbid = context.getInitParameter("dbid");
		String dbpw = context.getInitParameter("dbpassword");

		// 외부라이브ㄹ를 이용한객체 커넥션 하기위해
		// 데이터베이스를 다쓰면 반환을해서 이걸쓴다? (메모리절약)
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName(driver);
		ds.setUsername(dburl);
		ds.setUsername(dbid);
		ds.setPassword(dbpw);
		// set을 통해 ds에 하나하나씩 다넣기

		dataSource = ds; // 스태틱 변수에 데이터 넣기..

	}

	public static Connection getConnection() throws SQLException {
		return dataSource.getConnection();
	}

}
