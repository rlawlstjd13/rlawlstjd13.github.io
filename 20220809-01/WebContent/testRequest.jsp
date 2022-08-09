<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <p>자바 웹 어플리케이션은 각자의 고유한 context root 경로를 가집니다.</p>
   <p><%= request.getContextPath() %></p>
<!-- root는 변할수도 있으니 request.getContextPath()로 자신의 root를 알려줌 -->
<!-- root는 프로펄티 웹프로젝트세팅으로 변경가능. -->
<!-- /로 root주소 바꾸면 파일이 주소이름이됨. 주로 메인페이지 사용할떄 /사용 -->
<!-- 주소변경후 서버 닫고 clean 해주면됨/ -->
   <form action="<%= request.getContextPath()%>/testRequest.jsp">
      <input type="submit" />
   
   </form>
</body>
</html>