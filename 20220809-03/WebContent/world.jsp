<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>국가목록</title>
<!-- lib에 jar파일넣기 -->
</head>
<body>
<%
  Class.forName("com.mysql.cj.jdbc.Driver"); // 패키지명과 클래스명 넣기
  Connection conn = null;
  Statement stmt = null;
  ResultSet rs = null;
  try {
	  conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
	  stmt = conn.createStatement();
	  rs = stmt.executeQuery("SELECT name FROM country");
	  
	  List<String> list = new ArrayList<>();
	  
	  out.println("<ul>");
	  while(rs.next()) {
		 String name = rs.getString("name");
		 out.println("<li>" + name + "</li>");
	  }
	  out.println("</ul>");
  } finally {
	  if(rs != null) {
		  rs.close();
	  }
	  if(stmt != null) {
		  stmt.close();
	  }
	  if(conn != null) {
		  conn.close();
		  
	  } 
  }
%>

</body>
</html>