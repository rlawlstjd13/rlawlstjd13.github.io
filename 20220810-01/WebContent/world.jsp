
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.greenart.CountryDAO"%>
<%@page import="kr.co.greenart.Country"%>
<% 
       String continent = request.getParameter("continent");
       CountryDAO dao = new CountryDAO();
       List<Country> list = dao.getCountryByContinent(continent);
       
       request.setAttribute("list", list);
       request.setAttribute("continent", continent);
       request.getRequestDispatcher("result.jsp").forward(request, response);
       
%>