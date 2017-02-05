<%@page import="java.util.List"%>
<%@page import="com.jspservlet.vo.VOLogin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin List</title>

<script type="text/javascript">
function save(){
	var shape = document.getElementById("formaUsers");
	shape.action="adminUsers.servlet";
	var action =document.getElementById("action"); 
	action.value="save";
	shape.submit();
	
}

function update(){
	var shape = document.getElementById("formaUsers");
	shape.action="adminUsers.servlet";
	var action =document.getElementById("action"); 
	action.value="update";
	shape.submit();
}

function remove(){
	var shape = document.getElementById("formaUsers");
	shape.action="adminUsers.servlet";
	var action =document.getElementById("action"); 
	action.value="remove";
	shape.submit();
}

function carga(){
	 document.getElementById("login").focus();
	 
	}

</script>
</head>
<body onload="carga();">
<form action="" method="POST" id="formaUsers">
<center>


<input type="hidden" name="action" id="action">
<p style="font-weight: bold; font-size: 20px;color: green;">
Welcome to the JSPS and Servlets system: <%=   ((VOLogin)session.getAttribute("loginSigned")).getFirstName() %></p>

<table>

<tr>
<td style="font-weight: bold;size: 12px;color: blue;"align="right">Login:</td>
<td><input type="text" name="login" id="login"></td>
</tr>

<tr>
<td style="font-weight: bold;size: 12px;color: blue;"align="right">Password:</td>
<td><input type="password" name="password" id="password"></td>
</tr>

<tr>
<td style="font-weight: bold;size: 12px;color: blue;"align="right">First Name</td>
<td><input type="text" name="first_name" id="first_name"></td>
</tr>

<tr>
<td style="font-weight: bold;size: 12px;color: blue;"align="right">Age</td>
<td><input type="text" name="age" id="age"></td>
</tr>
<td colspan="2">
<input type="button" value="Save" style="font-size: 14px;color: blue;" onclick="save();">
<input type="button" value="Update" style="font-size: 14px;color: blue;"onclick="update();">
<input type="button" value="Remove" style="font-size: 14px;color: blue;"onclick="remove();">
</td>


</table>



<table>
<tr>
<th>Login</th><th>First Name</th><th>Age</th>
</tr>

<%
List<VOLogin> list = (List<VOLogin>)session.getAttribute("listUser");
for(VOLogin obj: list){
%>
<tr>
<td><%=obj.getLogin() %></td>
<td><%=obj.getFirstName() %></td>
<td><%=obj.getAge() %></td>
</tr>

<%	
}
%>

</table>
</form>



</center>
</body>
</html>