package im.processing;

import java.io.IOException;
import java.util.List;

import im.dao.UserCatalogueItem;
import im.dbutils.DBUtils;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class cItems extends HttpServlet {
	public cItems() {
	    super();
	    // TODO Auto-generated constructor stub
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{   String username = (String)request.getSession().getAttribute("username");
		String cataloguename = (String)request.getSession().getAttribute("cataloguename");
		List<UserCatalogueItem> items =DBUtils.getCatalogueitems(username, cataloguename);
		request.getSession().setAttribute("items",items);
		RequestDispatcher req = request.getRequestDispatcher("catelogueItems.jsp");
		req.include(request, response);
	}

}

