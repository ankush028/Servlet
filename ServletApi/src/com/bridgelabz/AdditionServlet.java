package com.bridgelabz;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class AdditionServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int k = i + j;
		HttpSession session = req.getSession();
		session.setAttribute("k",k);
		res.sendRedirect("sq");
		
		
	
		
		
		
		
		
		
		
	//	res.sendRedirect("sq?k="+k);//URL Rewritting
			
		/*Request dispatcher
		 * RequestDispatcher rd = req.getRequestDispatcher("sq");
		*rd.forward(req,res);
		 * 
		
		*/
	}
}
