package im.processing.citems;

import java.io.IOException;

import im.dbutils.DBUtils;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class deletecitemsservlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cataloguename = (String)request.getSession().getAttribute("cataloguename");
		String itemname = (String)request.getParameter("itemname");
		System.out.println ("itemname:" + itemname + "and cataloguename:" + cataloguename);
		if(itemname == null ||itemname.isEmpty() || cataloguename.isEmpty()){
			RequestDispatcher req = request.getRequestDispatcher("/jsp/catalogueitems/deletecitemsfail.jsp");
			req.include(request, response);
		}
		else
		{
			boolean result = DBUtils.deletecitems(itemname,cataloguename);
			if(result) {
				RequestDispatcher req = request.getRequestDispatcher("/jsp/catalogueitems/deletecitemssuccess.jsp");
				req.forward(request, response);
			}
			else {
				RequestDispatcher req = request.getRequestDispatcher("/jsp/catalogueitems/deletecitemsfail.jsp");
				req.forward(request, response);
			}
		}
	}
}

