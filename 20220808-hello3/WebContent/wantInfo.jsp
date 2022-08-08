<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>출력화면</title>
</head>
<body>
<%
   //논리페이지
   String choice = request.getParameter("choice");
   
   if(choice == null || choice.length() == 0) {
	   response.sendRedirect("./want.jsp?progress=failed");
	   
   } else if (choice.equals("fruit")) {
	   response.sendRedirect("./person.jsp");
   } else if (choice.equals("person")) {
	   response.sendRedirect("./fruit.jsp");
   }
   
%>

</body>
</html>