<%@page import="java.time.LocalTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>현재 시각!!!</h1>
<%// to페이지에서 set으로 저장한 값 겟으로 가져오는법
Object result = request.getAttribute("result"); %>
<p><%=result %></p>
  <strong>
  <%= //해당페이지에서 정보 저장
  LocalTime.now()
  %>
  </strong>

</body>
</html>