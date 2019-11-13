package com.bridgelabz.UserRegistration.Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import com.mysql.jdbc.PreparedStatement;

public class ResetPasswordDao {
	String url = "jdbc:mysql://localhost:3306/User";
	String unamee = "root";
	String upass ="password";
	
	public int check(String email,String newPass) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,unamee,upass);
PreparedStatement pst = (PreparedStatement) con.prepareStatement("update UserInfo set password='"+newPass+"' where email='"+email+"'");
			int count = pst.executeUpdate();
			con.close();
	return count;
	
	}

}