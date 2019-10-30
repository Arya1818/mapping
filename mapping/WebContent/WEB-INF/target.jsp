<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//request.setAttribute("msg","하이");
String msg = (String)request.getAttribute("msg");
%>
index에서 온 메세지 : <%=msg %>
</body>
</html>