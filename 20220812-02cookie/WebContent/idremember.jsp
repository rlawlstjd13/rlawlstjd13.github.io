<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Cookie[] cookies = request.getCookies();
	//id기억하기 페이지.
	
    if (cookies != null) {
	for (Cookie c : cookies) {
		if (c.getName().equals("rememberme")) {
			request.setAttribute("idvalue", URLDecoder.decode(c.getValue(), "utf-8"));
		}
	}
    }
	%>
	
	if{되면 테스트로그인}
	
	else{아니면 여기그대로}
	
	<form action="./login" method="post">

		<input type="text" name="id" value="${ idvalue } " />
		<input type="password" name="password" />
		<input type="checkbox" name="rememberme" />
		<input type="submit" />

	</form>

</body>
</html>