package im.processing.citems;

import java.io.IOException;
import java.util.List;

import im.dao.UserCatalogueItem;
import im.dbutils.DBUtils;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class showcatalogueitemsservlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String catalogueName = (String)request.getParameter("cataloguename");
		String userName = (String)request.getSession().getAttribute("username");
		System.out.println ("username:" + userName + "and cataloguename:" + catalogueName);
		if(userName.isEmpty() || catalogueName.isEmpty()){
			RequestDispatcher req = request.getRequestDispatcher("/jsp/catalogueitems/showcatalogueitemsfail.jsp");
			req.include(request, response);
		}
		else
		{
			List<UserCatalogueItem> ucatItems= DBUtils.getCatalogueItem(catalogueName, userName);
			RequestDispatcher req = request.getRequestDispatcher("/jsp/catalogueitems/showcatalogueitems.jsp");
			request.getSession().setAttribute("cataloguename", catalogueName);
			System.out.println("items returned:" + ucatItems);
			request.getSession().setAttribute("ucatitems", ucatItems);
			req.forward(request, response);
			
		}
	}
}

