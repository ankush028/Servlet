
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ankush","root","password");
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery("select*from student");
	while(rs.next()){
		out.print(" Student name "+rs.getInt(1) +" Student name "+rs.getString(2)+"<br>");
	}	
%>

</body>
</html>