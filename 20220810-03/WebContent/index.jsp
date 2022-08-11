<!-- 
     페이지 이동을 제공하는 index.html 작성
     
     a.사람등록 페이지(입력 양식 제공)
     ->action = mapping된 servlet
     ->service 메소드 {
       db행을 추가
       redirect 응답(사람목록 페이지)
     }
     b. 사람목록
     ->mapping된 servlet
     ->service 메소드 {
       db 목록 읽기
       forward 사람목록을 보여주는(view) jsp로
     }
 
 -->



<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>페이지 이동</title>
</head>
<body>
   <a href="./viewadd.jsp">사람 등록</a>
   <a href="./list">사람 목록</a>

</body>
</html>