<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 처리</title>
</head>
<body>
    <p>로그인 처리 요청이 전달됨?</p>
    <%
      String id = request.getParameter("userid");
    
      // 입력값이 있으면 xx님 반갑습니다.
      // 파라미터에 이름이 업으면 null
      
      if(id.length() > 0){
    	  out.println(id + "님 방가");
      } else {
    	  out.println("입력이 없습니다");
    	  response.sendRedirect("./login.jsp");
    	  //클라이언트는 쿠키가 저장 서버에는 세션저장됨.(ss,cc)
    	  //서버는 클라이언트가 한번 왔다 간 애라는 것을 기억하기 위해 클라이언트에게 고유한 번호를 주고
          //클라이언트도 본인의 번호를 기억하고 있다.
    	  //그 다음부터 클라이언트가 서버에게 요청을 보낼 때 고유 번호를 담아서 요청을 보내면 
    	  //한번 왔다 간 애라는 것을 알 수 있다.서버가 기억하고 있는 것을 '세션', 고유번호를 '세션id'클라이언트
    	  //브라우저가 기억하는 것을 '쿠키'

      }
    %>
</body>
</html>