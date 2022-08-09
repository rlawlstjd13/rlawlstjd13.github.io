<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>context가 뭔가요?</p>
	<%
	ServletRequest req = pageContext.getRequest(); // pageContext는 객체로 jsp의 기능이 다잇따??
	out.println(req == request); // request랑 같음
	out.println("<br />");
	ServletResponse resp = pageContext.getResponse(); 
	out.println(resp == response);
	%>
</body>
</html>