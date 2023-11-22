package im.processing.catalogue;

import java.io.IOException;

import im.dbutils.DBUtils;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class deletecatalogueservlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String catalogueName = (String)request.getParameter("cataloguename");
		String userName = (String)request.getSession().getAttribute("username");
		System.out.println ("username:" + userName + "and cataloguename:" + catalogueName);
		if(userName.isEmpty() || catalogueName.isEmpty()){
			RequestDispatcher req = request.getRequestDispatcher("/jsp/catalogue/deletecataloguefail.jsp");
			req.include(request, response);
		}
		else
		{
			boolean result = DBUtils.deletecatalogue(userName,catalogueName);
			if(result) {
				RequestDispatcher req = request.getRequestDispatcher("/jsp/catalogue/deletecataloguesuccess.jsp");
				req.forward(request, response);
			}
			else {
				RequestDispatcher req = request.getRequestDispatcher("/jsp/catalogue/deletecataloguefail.jsp");
				req.forward(request, response);
			}
		}
	}
}
