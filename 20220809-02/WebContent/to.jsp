<%@page import="java.util.Random"%>
<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.lang.ProcessBuilder.Redirect"%>
<% 
  request.setCharacterEncoding("UTF-8");
  String alphabet = request.getParameter("alphabet");
  

  if(alphabet.equals("a")) {
	  request.setAttribute("result", LocalTime.now());
	  request.getRequestDispatcher("A.jsp")
	  .forward(request, response);
  } else if (alphabet.equals("b")) {
	  request.setAttribute("result", LocalDate.now());
	  request.getRequestDispatcher("B.jsp")
	  .forward(request, response);
  } else if (alphabet.equals("c")) {
	  Random random = new Random();
	  request.setAttribute("result", random.nextInt());
	  request.getRequestDispatcher("C.jsp")
	  .forward(request, response);
  }



%>