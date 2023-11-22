package im.processing.login;

import jakarta.servlet.ServletException;
import im.dao.UserCatalogue;
import im.dbutils.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;

public class login extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("Recevied login request for " + username);
		if(username.isEmpty() || password.isEmpty() )
		{
			RequestDispatcher req = request.getRequestDispatcher("/jsp/login/loginerror.jsp");
			req.include(request, response);
		}
		else
		{  
			boolean result = DBUtils.verifylogin(username,password);
		    if (result) {
		    	HttpSession session = request.getSession();
		    	session.setAttribute("username",username);
		    	RequestDispatcher req = request.getRequestDispatcher("/userhomeservlet");
		    	req.forward(request, response);
		    }
		    else {
			RequestDispatcher req = request.getRequestDispatcher("/jsp/login/loginerror.jsp");
			req.include(request, response);
		    }
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		RequestDispatcher req = request.getRequestDispatcher("/jsp/login/loginform.jsp");
		req.include(request, response);
	}
}

	
