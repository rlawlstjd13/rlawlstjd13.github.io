<%@page import="com.sun.prism.Image"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사진 찾기</title>
</head>
<body>
<%
String[] result = request.getParameterValues("num");

for (int i = 0; i < result.length; i++) {
	if (result[i].equals("1")) {
		out.println("<img src=\"./image/아이유.jpg\" />");
	} else if (result[i].equals("2")) {
		out.println("<img src=\"./image/다운로드.jpg\" />");
	} else if (result[i].equals("3")) {
		out.println("<img src=\"./image/yura.jpg\" />");
	}
}


   
%>

</body>
</html>