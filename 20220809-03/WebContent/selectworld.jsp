<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<% 
 //db 연결
 //select
 
 Class.forName("com.mysql.cj.jdbc.Driver");

 Connection conn = null;
 Statement stmt = null;
 ResultSet rs = null;
 List<String> list = new ArrayList<>();
 
 try {
	 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
	 stmt = conn.createStatement();
	 rs = stmt.executeQuery("SELECT name FROM country");
	 
	 while(rs.next()) {
		 String name = rs.getString("name");
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
 request.setAttribute("countries", list);
 // 다음페이지 forward 시키기
 request.getRequestDispatcher("viewcountry.jsp").forward(request, response);
 
 
 
 
 
 
 
 
 
 
 
%>