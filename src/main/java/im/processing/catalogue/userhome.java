package im.processing.catalogue;

import java.io.IOException;
import java.util.List;

import im.dao.UserCatalogue;
import im.dao.UserCatalogueItem;
import im.dbutils.DBUtils;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class userhome extends HttpServlet {
	public userhome() {
	    super();
	    // TODO Auto-generated constructor stub
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{   
		System.out.println("posting userhome page details");
		String username = (String)request.getSession().getAttribute("username");
		List<UserCatalogue> ucats = DBUtils.getCatalogues(username);
		request.getSession().setAttribute("ucats", ucats);
		RequestDispatcher req = request.getRequestDispatcher("/jsp/catalogue/userhome.jsp");
		req.include(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Getting userhome page details");
		String username = (String)request.getSession().getAttribute("username");
		List<UserCatalogue> ucats = DBUtils.getCatalogues(username);
		request.getSession().setAttribute("ucats", ucats);
		RequestDispatcher req = request.getRequestDispatcher("/jsp/catalogue/userhome.jsp");
		req.include(request, response);
	}
}

