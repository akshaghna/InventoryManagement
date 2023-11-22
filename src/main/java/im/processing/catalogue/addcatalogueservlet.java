package im.processing.catalogue;

import java.io.IOException;

import im.dbutils.DBUtils;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class addcatalogueservlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String usernmae = (String)request.getSession().getAttribute("username");
		String cataloguename = request.getParameter("catalogueName");
		int year = Integer.parseInt(request.getParameter("year"));
		String season = request.getParameter("season");
		
		if(usernmae.isEmpty() || cataloguename.isEmpty() || season.isEmpty() || 
				year<=0)
		{
			RequestDispatcher req = request.getRequestDispatcher("/jsp/catalogue/addcataloguefail.jsp");
			req.include(request, response);
		}
		else
		{
			boolean result = DBUtils.createcatalogue(usernmae,cataloguename, year, season);
			if(result) {
				RequestDispatcher req = request.getRequestDispatcher("/jsp/catalogue/addcataloguesuccess.jsp");
				req.forward(request, response);
			}
			else {
				RequestDispatcher req = request.getRequestDispatcher("/jsp/catalogue/addcataloguefail.jsp");
				req.forward(request, response);
			}
			}
	}

}

