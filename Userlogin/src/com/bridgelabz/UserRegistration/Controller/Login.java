package com.bridgelabz.UserRegistration.Controller;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.bridgelabz.UserRegistration.Dao.LoginDao;

@WebServlet("/Login")
public class Login extends HttpServlet {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		String uname = request.getParameter("user");
		String upass = request.getParameter("password");
		
		LoginDao dao = new LoginDao();
		try {
			if(dao.check(uname,upass)) {
				response.sendRedirect("Welcome.jsp");
			}
			response.sendRedirect("Login.jsp");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		
	}
}
