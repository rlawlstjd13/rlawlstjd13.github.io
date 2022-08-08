<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>out 기본객체</title>
</head>
<body>
     <h1>정적 테스트</h1>
     <%= 1 + 2 + 3 %> <br />
     
     <%
       out.println(1 + 2 + 3);
       out.println("<br />");
     %>
     <p>jsp의 모든 텍스트는 아웃 객체가 됩니다.</p>
     <%
       boolean someBool = true;
       
       if(someBool) {
    	   //out객체는 Sysout이랑 비슷한 개념임.......
    	   out.println("<p>참일 때 출력해야하는 값</p>");
    	   
       } else {
    	   out.println("<p>거짓일 때 출력해야하는 값</p>");
       }
     %>
</body>
</html>