<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>application 기본객체</p>
<p>자바 웹 어플리케이션의 설정 등을 설정하거나 접근할 수 있는 객체입니다.</p>
<%= application.getMajorVersion()%>
<!-- xml설정후 서버 다시 켜줘야함. ex)jdbc같은걸 저장해서 읽어오기??-->
<p><%= application.getInitParameter("myParamName") %></p>
<p><%= application.getInitParameter("mySetting") %></p>
</body>
</html>