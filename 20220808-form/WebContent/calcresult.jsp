<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산</title>
</head>
<body>
	<%
		int one = Integer.valueOf(request.getParameter("one"));
	    int two = Integer.valueOf(request.getParameter("two"));

	    String three = request.getParameter("three");

	if (three.equals("+")) {
		out.println(one + two);
	} else if (three.equals("-")) {
		out.println(one - two);
	} else if (three.equals("*")) {
		out.println(one * two);
	} else if (three.equals("/")) {
		out.println(one / two);
	} else {
		out.println("잘못 햇씸더");
	}
	%>

</body>
</html>