<!-- View -->
<%@page import="kr.co.greenart.Country"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.greenart.CountryDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form>
<!-- empty는 비어있으면 true not이있으니 리스트가 있으면ul에 추가-->
     <c:if test="${ not empty list }">
     <ul>
        <c:forEach var="country" items="${list}"><!-- 아이템즈는 배열,list,set,map에서만 사용가능 -->
          <li>${ country.name } ${ country.population }</li><!-- get생략  자바문 은 다없어졌으며 필요한건 클래스로만듬.-->
        </c:forEach>
     
     </ul>
     </c:if>
</form>
</body>
</html>