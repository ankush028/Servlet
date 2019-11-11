import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jstl")
public class ServletJstl extends HttpServlet{


	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		List<Student> studs =Arrays.asList(new Student("Ankush",1),new Student("Sachin",2),new Student("Prem",3));
		
		req.setAttribute("student",studs);
		
		RequestDispatcher rd = req.getRequestDispatcher("Profile.jsp");
		rd.forward(req,res);
	}
}
