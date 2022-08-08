<!-- 
 입력폼
 숫자1
 숫자2
 
 연산자 + - * / 선택
 전송
 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산기</title>
</head>
<body>
    <form action="./calcresult.jsp" method="post">
    <label>숫자입력<input type="number" name="one" /> <br /></label>
    <label>숫자입력<input type="number" name="two" /> <br /></label>
    <label>연산자<input type="text" name="three"/> <br/></label>
    <input type="submit" />
    
    </form>

</body>
</html>