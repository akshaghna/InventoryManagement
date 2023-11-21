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
		String itemname = (String)request.getSession().getAttribute("itemname");
	    int pcost = Integer.parseInt(request.getParameter("priductioncost"));
		int scost = Integer.parseInt(request.getParameter("sellingcost"));
		int sizexsavail = Integer.parseInt(request.getParameter("size_xs_available"));
		int sizexssold = Integer.parseInt(request.getParameter("size_xs_sold"));
		int sizesavail = Integer.parseInt(request.getParameter("size_s_available"));
		int sizessold = Integer.parseInt(request.getParameter("size_s_sold"));
		int sizemavail = Integer.parseInt(request.getParameter("size_m_available"));
		int sizemsold = Integer.parseInt(request.getParameter("size_m_sold"));
		int sizelavail = Integer.parseInt(request.getParameter("size_l_avail"));
		int sizelsold = Integer.parseInt(request.getParameter("size_l_sold"));
		int sizexlavail = Integer.parseInt(request.getParameter("size_xl_available"));
		int sizexlsold = Integer.parseInt(request.getParameter("size_xl_sold"));
		int sizexxlavail = Integer.parseInt(request.getParameter("size_xxl_avail"));
		int sizexxlsold = Integer.parseInt(request.getParameter("size_xxl_sold"));
		
		
		
		
		
		if(cataloguename.isEmpty() || itemname.isEmpty() || pcost.isEmpty() || scost.isEmpty() || sizexxlsold.isEmpty()
				)
		{
			RequestDispatcher req = request.getRequestDispatcher("additemfail.jsp");
			req.include(request, response);
		}
		else
		{
			boolean result = DBUtils.getCatalogueItem(cataloguename,itemname,pcost,scost,sizexsavail,sizexssold,sizesavail,sizessold,sizemavail,
					sizemsold,sizelavail,sizelsold,sizexlavail,sizexlsold,sizexxlavail,sizexxlsold);
			if(result) {
				RequestDispatcher req = request.getRequestDispatcher("addcitemsuccess.jsp");
				req.forward(request, response);
			}
			else {
				RequestDispatcher req = request.getRequestDispatcher("addcitemfail.jsp");
				req.forward(request, response);
			}
			}
	}


}
