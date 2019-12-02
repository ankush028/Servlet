package com.bridgelabz.UserRegistration.Dao;

import java.sql.*;

public class LoginDao {
	
	String url = "jdbc:mysql://localhost:3306/User";
	String unamee = "root";
	String upass ="password";
	
	public boolean check(String user,String pass) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,unamee,upass);
		
			Statement pst = con.createStatement();
			ResultSet rs = pst.executeQuery("select * from UserInfo where uname ='"+user+"' AND password ='"+pass+"'");
			if(rs.next()) {
			return true;
		}
		return false;
	}
	
}
