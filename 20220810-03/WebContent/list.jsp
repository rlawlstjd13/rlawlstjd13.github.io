<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>목록보여주기</title>
</head>
<body>
   <c:if test="${ not empty list }">
   <ul>
        <c:forEach var="persons" items="${ list }">
        <li>${ persons.name } ${ persons.age} </li>
        </c:forEach>   
   </ul>
   </c:if>
   <!-- 바는 변수선언 , 아이템즈는 전 페이지에서 어트리뷰트값에 list로 저장한걸 찾아주는역활 -->

</body>
</html>