<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="showerror.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러를 발생시킬 페이지</title>
</head>
<body>
<%
//에러가 발생하면 <%@ page errorPage="showerror.jsp" %> 활용해 에러페이지이동
   String name = null;
   System.out.println(name.toString());

%>

</body>
</html>