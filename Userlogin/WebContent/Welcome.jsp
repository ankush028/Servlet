<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><%
	response.setHeader("Cache-Control","no-cache,no-store, must-revalidate");//http latest
		if(session.getAttribute("user")==null){
			response.sendRedirect("Logout");
		}
	%>
			<h1> WELCOME</h1>

	user has sucessful logged in 
<a href ="Logout"> Logout</a>
</body>
</html>