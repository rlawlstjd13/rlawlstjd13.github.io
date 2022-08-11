<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="person.PersonsDao"%>
<%@page import="person.Persons"%>


<% 
  String name = request.getParameter("name");
  String age = request.getParameter(String.valueOf("age"));
  PersonsDao dao = new PersonsDao();
  List<Persons> list = dao.addPersons(name, Integer.valueOf(age));
  
  request.setAttribute("list", list);
  request.getRequestDispatcher("viewadd.jsp").forward(request, response);



%>