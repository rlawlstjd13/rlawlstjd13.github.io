package person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonsDao {
	public List<Persons> addPersons(String name, int age) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		List<Persons> list = new ArrayList<Persons>();

		//try(안에서 초기화 시키면 close안해도 알아서 닫힘..)
		try {

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");
			pstmt = conn.prepareStatement(
					"INSERT INTO `my_db`.`persons` (name, age) " + "VALUES (? , ?)");
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.executeUpdate();
//			while (rs.next()) {
//				String personname = rs.getString("name");
//				int personage = rs.getInt("age");
//				list.add(new Persons(personname, personage));
//			}
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
		return list;
	}

	public List<Persons> allList() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String query = "SELECT * FROM my_db.persons";

		List<Persons> list = new ArrayList<Persons>();
		try {

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db", "root", "root");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				String personname = rs.getString("name");
				int personage = rs.getInt("age");
				list.add(new Persons(personname, personage));
			}

		} finally {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (conn != null) {
				conn.close();
			}

		}
		return list;

	}
}
