package com.bridgelabz.UserRegistration.Controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.UserRegistration.Dao.ForgetDao;

@WebServlet("/Forget")
public class Forget extends HttpServlet{
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
			
			String user = req.getParameter("user");
			String email = req.getParameter("email");
			
			ForgetDao fd = new ForgetDao();
			try {
				if(fd.check(user, email)){
					HttpSession session = req.getSession();
					
					session.setAttribute("user",user);
					session.setAttribute("email",email);
					
					res.sendRedirect("reset.jsp");
					
				}else {
					res.sendRedirect("Login");
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
			
			
		}
}
