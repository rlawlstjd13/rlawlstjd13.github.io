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
Statement stmt = null;
ResultSet rs = null;
List<String> list = new ArrayList<>();

try {
	String query = "SELECT DIstinct continent From country";
	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
	stmt = conn.createStatement();
	rs = stmt.executeQuery(query);
	
	while(rs.next()) {
		String name = rs.getString("continent");
		list.add(name);
	}
} finally {
	if(rs != null) {
		 rs.close();
	 } if(stmt != null) {
		 stmt.close();
	 } if(conn != null) {
		 conn.close();
	 }
}
//request 객체에 list로 attribute로 설정하기
request.setAttribute("continent", list);
// 다음페이지 forward 시키기
request.getRequestDispatcher("searchform.jsp").forward(request, response);



%>