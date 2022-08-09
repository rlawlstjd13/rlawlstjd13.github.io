<%@page import="java.util.Scanner"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>랜덤 숫자</h1>

<Strong>
<% // to페이지에서 set으로 저장한 값 겟으로 가져오는법
Object result = request.getAttribute("result"); %>
<p><%=result %></p>
<%
  //해당페이지에서 정보 저장
  Random random = new Random();
  out.println(random.nextInt());
%>

</Strong>
</body>
</html>