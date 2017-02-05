<%@page import="com.jspservlet.vo.VOLogin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome JSP</title>
</head>
<body>
<p style="font-weight: bold; font-size: 20px;color: red;">
Welcome to the JSPS and Servlets system: <%=((VOLogin)session.getAttribute("loginSigned")).getFirstName() %></p>
<a href="users/users.jsp">User administration</a>
</body>
</html>