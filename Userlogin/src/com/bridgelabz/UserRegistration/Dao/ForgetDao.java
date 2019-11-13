package com.bridgelabz.UserRegistration.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ForgetDao {
	
	String url = "jdbc:mysql://localhost:3306/User";
	String unamee = "root";
	String upass ="password";
	
	public boolean check(String user,String email) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,unamee,upass);
		
			Statement pst = con.createStatement();
			ResultSet rs = pst.executeQuery("select* from UserInfo where uname='"+user+"'AND email='"+email+"'");
			if(rs.next()) {

			return true;
		}
		return false;
	}
}
