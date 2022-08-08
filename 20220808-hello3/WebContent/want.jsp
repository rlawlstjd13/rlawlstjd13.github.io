<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>뭘 보고 싶니???</title>
</head>
<body>
<%--라디오버튼은 네임에 똑같은 이름을 가져야함 --%>
<%-- 입력페이지 --%>
<%= request.getParameter("progress") %>
    <form action="/20220808-hello3/wantInfo.jsp" method="post">
     <input type="radio" name="choice" value="person" />사람
     <input type="radio" name="choice"value="fruit" />과일
     <input type="submit" />
    
    </form>

</body>
</html>