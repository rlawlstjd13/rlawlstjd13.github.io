<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!--taglib로 불러서 쓰고 preifx는 c라고 쓸려고 적음 -->


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <c:forEach var="i" begin="1" end="10">
   <c:if test="${ i % 2 ==0 }">
   <p>${ i } </p>
   </c:if>
   </c:forEach>
   
   <hr />
   
   <c:choose> <!-- 조건이 참일때 그문장만 나오고 밑에거는 안나옴 -->
   <c:when test="true">
   <p>첫번쨰 조건이 참일떄</p>
   </c:when>
   <c:when test="false">
   <p>두번째 조건이 참일때</p>
   </c:when>
   <c:otherwise> <!--앞 조건이 전부 거지일때 아더와이즈 내용이 나옴.  -->
   <p> 모든 조건이 참이 아닐떄</p>
   </c:otherwise>
   </c:choose>

</body>
</html>