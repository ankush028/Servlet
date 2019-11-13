package com.bridgelabz.UserRegistration.Dao;

import java.sql.*;

import com.bridgelabz.UserRegistration.Model.User;

public class UserDao {
	
	String url = "jdbc:mysql://localhost:3306/User";
	String uname = "root";
	String upass ="password";
	
		public void addUser(User u) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,uname,upass);
			PreparedStatement pst = con.prepareStatement("insert into UserInfo values(?,?,?,?,?,?,?,?)");
			pst.setString(1,u.getName());
			pst.setString(2,u.getFatherName());
			pst.setString(3,u.getAddress());
			pst.setString(4,u.getCourse());
			pst.setString(5,u.getEmail());
			pst.setString(6,u.getMobile());
			pst.setString(7,u.getPassword());
			pst.setString(8,u.getConfirmPassword());

			int count = pst.executeUpdate();
			System.out.println(" rows affectes "+count );
			
			
			
		}

}
