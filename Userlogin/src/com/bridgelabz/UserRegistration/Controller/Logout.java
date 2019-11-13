package com.bridgelabz.UserRegistration.Controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Logout")
public class Logout extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) {
		
		HttpSession session = req.getSession();
		session.removeAttribute("User");
		session.invalidate();

		
	}
}
