package im.processing;

import java.io.IOException;

import im.dbutils.DBUtils;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class addcitemsservlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cataloguename = (String)request.getSession().getAttribute("cataloguename");
	    int pcost = Integer.parseInt(request.getParameter("priductioncost"));
		int scost = Integer.parseInt(request.getParameter("sellingcost"));
		int sizexsavail = Integer.parseInt(request.getParameter("size_xs_available"));
		int sizexssold = Integer.parseInt(request.getParameter("size_xs_sold"));
		int sizesavail = Integer.parseInt(request.getParameter("size_s_available"));
		int sizessold = Integer.parseInt(request.getParameter("size_s_sold"));
		int sizemavail = Integer.parseInt(request.getParameter("sellingcost"));
		int scost = Integer.parseInt(request.getParameter("sellingcost"));
		int scost = Integer.parseInt(request.getParameter("sellingcost"));
		int scost = Integer.parseInt(request.getParameter("sellingcost"));
		int scost = Integer.parseInt(request.getParameter("sellingcost"));
		int scost = Integer.parseInt(request.getParameter("sellingcost"));
		int scost = Integer.parseInt(request.getParameter("sellingcost"));
		int scost = Integer.parseInt(request.getParameter("sellingcost"));
		
		
		
		
		
		if(cataloguename.isEmpty() || cataloguename.isEmpty() || season.isEmpty() || 
				year<=0)
		{
			RequestDispatcher req = request.getRequestDispatcher("addcataloguefail.jsp");
			req.include(request, response);
		}
		else
		{
			boolean result = DBUtils.createcatalogue(usernmae,cataloguename, year, season);
			if(result) {
				RequestDispatcher req = request.getRequestDispatcher("addcataloguesuccess.jsp");
				req.forward(request, response);
			}
			else {
				RequestDispatcher req = request.getRequestDispatcher("addcataloguefail.jsp");
				req.forward(request, response);
			}
			}
	}


}
