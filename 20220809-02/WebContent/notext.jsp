<%
  
  int result = 1 + 1;
  request.setAttribute("result", result);
  request.getRequestDispatcher("/WEB-INF/viewPage.jsp")
  .forward(request, response);
  //forward는 합친다?
  //해당페이지만 보게 할려면 webINF에 viewpage를 넣으면 접근 불가

%>