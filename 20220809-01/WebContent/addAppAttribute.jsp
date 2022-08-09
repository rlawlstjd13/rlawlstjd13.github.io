<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>어플리케이션 기본 객체 이름-값을 설정하는 페이지</p>
<%
//최초 설정을하면 서버 끄기 전 까지 get으로 언제든지 값을 가져올수있음.
  application.setAttribute("mystr", "string-obj");
  application.setAttribute("myInt", Integer.valueOf(10));
%>

</body>
</html>