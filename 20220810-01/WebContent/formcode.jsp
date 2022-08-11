<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.greenart.CountryDAO"%>
<%@page import="kr.co.greenart.Country"%>

<%
    
    CountryDAO dao = new CountryDAO();
    List<String> list = dao.getContinents();
    
    request.setAttribute("continent", list);
    request.getRequestDispatcher("form.jsp").forward(request, response);

%>