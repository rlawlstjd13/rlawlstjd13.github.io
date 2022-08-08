<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>정보</title>
</head>
<body>
<%
   request.setCharacterEncoding("UTF-8");
   String name = request.getParameter("name");
   String age = request.getParameter("age");
   
   out.print(name + "(" + age + ") 님 반갑습니다.");
%>

</body>
</html>