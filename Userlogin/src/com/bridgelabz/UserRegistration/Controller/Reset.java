package com.bridgelabz.UserRegistration.Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.UserRegistration.Dao.ResetPasswordDao;

@WebServlet("/Reset")
public class Reset extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			ResetPasswordDao rpd = new ResetPasswordDao();
			
			HttpSession session = request.getSession();
			String email = (String) session.getAttribute("email");
			
			String newPass = request.getParameter("password");		
			try {
				if(rpd.check(email,newPass)>0) {
					
				response.sendRedirect("Sucessful.jsp");	
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}


}
