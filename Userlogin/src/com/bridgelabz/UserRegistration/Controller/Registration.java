package com.bridgelabz.UserRegistration.Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.UserRegistration.Dao.UserDao;
import com.bridgelabz.UserRegistration.Model.User;

@WebServlet("/Registration")
public class Registration extends HttpServlet {
	
       
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		User u = new User();
		UserDao dao = new UserDao();
		u.setName(request.getParameter("name"));
		u.setFatherName(request.getParameter("fatherName"));
		u.setAddress(request.getParameter("address"));
		u.setCourse(request.getParameter("course"));
		u.setEmail(request.getParameter("email"));
		u.setMobile(request.getParameter("phone"));
		u.setPassword(request.getParameter("pass"));
		u.setConfirmPassword(request.getParameter("confirmPassword"));
		try {
			dao.addUser(u);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpSession session =request.getSession();
		session.setAttribute("user",u);
		
		
		response.sendRedirect("Welcome.jsp");
		
		
		
	}
}