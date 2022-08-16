<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>값 확인</title>
</head>
<body>
<p>요청객체확인 : <%= request.getAttribute("reqTest") %></p>
<p>세션객체확인 : <%= session.getAttribute("sessionTest") %></p>

</body>
</html>