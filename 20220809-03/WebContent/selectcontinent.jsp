<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>



<%
	Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = null;
PreparedStatement pstmt = null;
ResultSet rs = null;
List<String> list = new ArrayList<>();
List<Integer> liststr = new ArrayList<>();

try {
	String query = "SELECT name, population From country where Continent = ? order by Population desc";
	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
	pstmt = conn.prepareStatement(query);
	pstmt.setString(1, request.getParameter("continent"));
	rs = pstmt.executeQuery();

	while (rs.next()) {
		String name = rs.getString("name");
		list.add(name);
		int popul = rs.getInt("population");
		liststr.add(popul);
	}
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
//request 객체에 list로 attribute로 설정하기
request.setAttribute("name", list);
request.setAttribute("population", liststr);
// 다음페이지 forward 시키기
request.getRequestDispatcher("viewcontinent.jsp").forward(request, response);
%>