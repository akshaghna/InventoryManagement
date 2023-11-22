package im.processing.login;
import java.io.IOException;

import im.dbutils.DBUtils;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class guru_register
 */
public class registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		String contact = request.getParameter("contact");
		String emailid = request.getParameter("emailid");
		
		if(first_name.isEmpty() || last_name.isEmpty() || username.isEmpty() || 
				password.isEmpty() || address.isEmpty() || contact.isEmpty() || emailid.isEmpty())
		{
			RequestDispatcher req = request.getRequestDispatcher("/jsp/login/registrationfail.jsp");
			req.include(request, response);
		}
		else
		{
			boolean result = DBUtils.accountcreation(first_name, last_name, username, emailid, address, contact, password);
			if(result) {
				RequestDispatcher req = request.getRequestDispatcher("/jsp/login/registrationsuccess.jsp");
				req.forward(request, response);
			}
			else {
				RequestDispatcher req = request.getRequestDispatcher("/jsp/login/registrationfail.jsp");
				req.forward(request, response);
			}
			}
	}

}