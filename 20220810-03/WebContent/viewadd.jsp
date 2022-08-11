<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="person.PersonsDao"%>
<%@page import="person.Persons"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>목록추가</title>
</head>
<body>
	<form action="./addpersons.do" method="post">
		<input type="text" name="name" /> <input type="number" name="age" />
		<input type="submit" /> <br />
		<c:if test="${ not empty errors }">
			<div>
				<c:forEach var="message" items="${ errors }">
					<p>${ message.value }</p>
				</c:forEach>
			</div>
		</c:if>
	</form>
</body>
</html>