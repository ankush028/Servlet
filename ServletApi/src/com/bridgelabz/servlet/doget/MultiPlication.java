package com.bridgelabz.servlet.doget;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MultiPlication extends HttpServlet{

	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
			int n = Integer.parseInt(req.getParameter("num1"));
			int m = Integer.parseInt(req.getParameter("num2"));
			
			int multi = n*m;
			
			PrintWriter out = res.getWriter();
			out.println("Result is " +multi);
			
		
	}
}
