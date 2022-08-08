<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>인적정보</title>
</head>
<body>
<!-- 
 입력용, 필수!!
 사용자 이름
 사용자 나이
 
 -->
 <form action="./personresult.jsp" method="post">
 <Input type="text" name="name" required="required"/>
 <Input type="number" name="age" required="required"/>
 <Input type="submit" />
 
 
 
 </form>

</body>
</html>