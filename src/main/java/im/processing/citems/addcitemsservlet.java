package im.processing.citems;

import java.io.IOException;

import im.dbutils.DBUtils;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class addcitemsservlet extends HttpServlet {

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("adding catalogue item");
		String cataloguename = (String)request.getSession().getAttribute("cataloguename");
		String username = (String)request.getSession().getAttribute("username");
		String itemname = request.getParameter("itemname");
		
		String pcosts = (String)request.getParameter("pcost");
	    int pcost = (pcosts != null && !pcosts.isEmpty())?Integer.parseInt(pcosts):0;
	    System.out.println("pcost "+ pcost);
	    
	    String scosts = (String)request.getParameter("scost");
		int scost = (scosts != null && !scosts.isEmpty())?Integer.parseInt(scosts):0;
		System.out.println("scost "+ scost);
		
		String ssizexsavail = (String)request.getParameter("sizexsavail");
		int sizexsavail = (ssizexsavail != null && !ssizexsavail.isEmpty())?Integer.parseInt(ssizexsavail):0;
		System.out.println("sizexsavail "+ sizexsavail);
		
		String ssizexssold = (String)request.getParameter("sizexssold");
		int sizexssold = (ssizexssold != null && !ssizexssold.isEmpty())?Integer.parseInt(ssizexssold):0;
		System.out.println("sizexssold "+ sizexssold);
		
		String ssizesavail = (String)request.getParameter("sizesavail");
		int sizesavail = (ssizesavail != null && !ssizesavail.isEmpty())?Integer.parseInt(ssizesavail):0;
		System.out.println("sizesavail "+ sizesavail);
		
		String ssizessold = (String)request.getParameter("sizessold");
		int sizessold = (ssizessold != null && !ssizessold.isEmpty())?Integer.parseInt(ssizessold):0;
		System.out.println("sizessold "+ sizessold);
		
		String ssizemavail = (String)request.getParameter("sizemavail");
		int sizemavail = (ssizemavail != null && !ssizemavail.isEmpty())?Integer.parseInt(ssizemavail):0;
		System.out.println("sizemavail "+ sizemavail);
		
		String ssizemsold = (String)request.getParameter("sizemsold");
		int sizemsold = (ssizemsold != null && !ssizemsold.isEmpty())?Integer.parseInt(ssizemsold):0;
		System.out.println("sizemsold "+ sizemsold);
		
		String ssizelavail = (String)request.getParameter("sizelavail");
		int sizelavail = (ssizelavail != null && !ssizelavail.isEmpty())?Integer.parseInt(ssizelavail):0;
		System.out.println("sizelavail "+ sizelavail);
		
		String ssizelsold = (String)request.getParameter("sizelsold");
		int sizelsold = (ssizelsold != null && !ssizelsold.isEmpty())?Integer.parseInt(ssizelsold):0;
		System.out.println("sizelsold "+ sizelsold);
		
		String ssizexlavail = (String)request.getParameter("sizexlavail");
		int sizexlavail = (ssizexlavail != null && !ssizexlavail.isEmpty())?Integer.parseInt(ssizexlavail):0;
		System.out.println("sizexlavail "+ sizexlavail);
		
		String ssizexlsold = (String)request.getParameter("sizexlsold");
		int sizexlsold = (ssizexlsold != null && !ssizexlsold.isEmpty())?Integer.parseInt(ssizexlsold):0;
		System.out.println("sizexlsold "+ sizexlsold);
		
		String ssizexxlavail = (String)request.getParameter("sizexxlavail");
		int sizexxlavail = (ssizexxlavail != null && !ssizexxlavail.isEmpty())?Integer.parseInt(ssizexxlavail):0;
		System.out.println("sizexxlavail "+ sizexxlavail);
		
		String ssizexxlsold = (String)request.getParameter("sizexxlsold");
		int sizexxlsold = (ssizexxlsold != null && !ssizexxlsold.isEmpty())?Integer.parseInt(ssizexxlsold):0;
		System.out.println("sizexxlsold "+ sizexxlsold);
		
		if(cataloguename==null || itemname==null || pcost <=0 || scost<=0)
		{
			System.out.println("validationfailed");
			RequestDispatcher req = request.getRequestDispatcher("/jsp/catalogueitems/addcitemsfail.jsp");
			req.include(request, response);
		}
		else
		{
			boolean result = DBUtils.addcitems(username, cataloguename,itemname,
					pcost,scost,sizexsavail,sizexssold,sizesavail,sizessold,sizemavail,
					sizemsold,sizelavail,sizelsold,sizexlavail,sizexlsold,sizexxlavail,sizexxlsold);
			if(result) {
				RequestDispatcher req = request.getRequestDispatcher("/jsp/catalogueitems/addcitemssuccess.jsp");
				req.forward(request, response);
			}
			else {
				System.out.println("adding item failed");
				RequestDispatcher req = request.getRequestDispatcher("/jsp/catalogueitems/addcitemsfail.jsp");
				req.forward(request, response);
			}
			}
	}


}
