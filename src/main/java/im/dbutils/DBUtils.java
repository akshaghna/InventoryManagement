package im.dbutils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import im.dao.UserCatalogue;
import im.dao.UserCatalogueItem;

public class DBUtils {
    public static Connection getConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/OIM";
        String username = "admin";
        String password = "admin123";
        Class.forName("com.mysql.cj.jdbc.Driver"); 
        return DriverManager.getConnection(url, username, password);
    }
    
    public static void main(String args[]) {
    	try
    	{
    		DBUtils.accountcreation("aks", "boy", "aks", "aks@gmail.com", "pfs, blr", "9845380758", "test123");
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
    public static boolean verifylogin(String username ,String pwd)
    {
    	boolean result = false;    	
    	Connection conn=null;
    	Statement stmt=null;
    	ResultSet rs=null;
   
    	try{
    		conn = DBUtils.getConnection();
    		stmt = conn.createStatement();
    	    rs = stmt.executeQuery("select * from oim_useraccoutns where username='" + username + "'");
    		while(rs.next()){
    			String pass= rs.getString("PASSWORD");
    			if (pass.equals(pwd)) {
    				result = true;
    			}
    		}
    	}
        catch (Exception e) {
    		  e.printStackTrace();
    	}
    	finally { 
    		try {
    			rs.close();
        		conn.close();
    		}catch (Exception e) {  } 		
    		
    	}
    	return result;
    }
 public static boolean accountcreation (String firstname,String lastname, 
		 String username, String emailid,String Address,String phoneno,String passwrd){ 
    	boolean result = false;    	
    	Connection conn=null;
    	Statement stmt=null;
    	try{
    		conn = DBUtils.getConnection();
    		stmt = conn.createStatement();
    		String query = "insert into oim_useraccoutns values('"+
        		    username +"','"+ firstname +"','"+ lastname +"','"+ Address +"','"+ 
    				emailid +"',"+ phoneno +",'"+ passwrd +"')";
    		System.out.println(query);
    		int result1 = stmt.executeUpdate(query);
    		if (result1 ==1) {
                System.out.println("successfully inserted"); 
                result = true;
    		}  
            else {
                System.out.println( "unsucessful insertion "); 
            }      
    	}catch (Exception e) {
    		  e.printStackTrace();
    	} 
    	finally { 
    		try {
        		conn.close();
    		}catch (Exception e) {  } 		
    		
    	}
    	return result;
    }
       
    public static List<UserCatalogue> getCatalogues(String username) {
    	List<UserCatalogue> catlogues = new ArrayList<UserCatalogue>();
    	Connection conn=null;
    	Statement stmt=null;
    	ResultSet result1=null;
    	try{
    		conn = DBUtils.getConnection();
    		stmt = conn.createStatement();
    		String query = "select * from oim_inventory_category where username='" + username + "'";
    		System.out.println(query);
    		result1 = stmt.executeQuery(query);
    		while(result1.next()) {
    			UserCatalogue catl = new UserCatalogue(result1.getString("category"), 
    					result1.getInt("year"), result1.getString("season"));
    			System.out.println(catl);
    			catlogues.add(catl);
    		}
    	}catch (Exception e) {
    		  e.printStackTrace();
    	} 
    	finally { 
    		try {
    			result1.close();
        		conn.close();
    		}catch (Exception e) {  } 		
    		
    	}
    	return catlogues;
    }
        
    public static boolean createcatalogue (String username,String cataloguename, 
   		 int year, String season){ 
       	boolean result = false;    	
       	Connection conn=null;
       	Statement stmt=null;
       	try{
       		conn = DBUtils.getConnection();
       		stmt = conn.createStatement();
       		String query = "insert into oim_inventory_category values('"+
           		    username +"','"+ cataloguename +"',"+ year +",'"+ season +"')";
       		System.out.println(query);
       		int result1 = stmt.executeUpdate(query);
       		if (result1 ==1) {
                   System.out.println("successfully inserted"); 
                   result = true;
       		}  
               else {
                   System.out.println( "unsucessful insertion "); 
               }      
       	}catch (Exception e) {
       		  e.printStackTrace();
       	} 
       	finally { 
       		try {
           		conn.close();
       		}catch (Exception e) {  } 		
       		
       	}
       	return result;
       }
    public static boolean deletecatalogue (String username,String cataloguename){ 
          	boolean result = false;    	
          	Connection conn=null;
          	Statement stmt=null;
          	try{
          		conn = DBUtils.getConnection();
          		stmt = conn.createStatement();
          		String query = "delete from oim_inventory_category where category='"+
              		   cataloguename +"' and username='"+username+"'";
          		System.out.println(query);
          		int result1 = stmt.executeUpdate(query);
          		if (result1>0) {
                      System.out.println("successfully deleted"); 
                      result = true;
          		}  
                  else {
                      System.out.println( "unsucessful deletion "); 
                  }      
          	}catch (Exception e) {
          		  e.printStackTrace();
          	} 
          	finally { 
          		try {
              		conn.close();
          		}catch (Exception e) {  } 		
          		
          	}
          	return result;
          }
    public static List<UserCatalogueItem> getCatalogueItem(String cataloguename,String username) {
    	ArrayList<UserCatalogueItem> catItems = new ArrayList<UserCatalogueItem>();
    	Connection conn=null;
    	Statement stmt=null;
    	ResultSet result1=null;
    	try{
    		conn = DBUtils.getConnection();
    		stmt = conn.createStatement();
    		String query = "select * from oim_inventory_items where category='" + cataloguename + "'and username='"+username+"'";
    		System.out.println(query);
    		result1 = stmt.executeQuery(query);
    		while(result1.next()) {
    			UserCatalogueItem catl = new UserCatalogueItem(result1.getString("ITEMNAME"), 
    					result1.getInt("PRODUCTION_COST"), result1.getInt("SELLING_COST"), result1.getInt("SIZEXS_AVAIL"),
    					result1.getInt("SIZEXS_SOLD"),
    					result1.getInt("SIZES_AVAIL"),result1.getInt("SIZES_SOLD"),result1.getInt("SIZEM_AVAIL"),
    					result1.getInt("SIZEM_SOLD"),result1.getInt("SIZEL_AVAIL"),result1.getInt("SIZEL_SOLD"),
    					result1.getInt("SIZEXL_AVAIL"),result1.getInt("SIZEXL_SOLD"),result1.getInt("SIZEXXL_AVAIL"),
    					result1.getInt("SIZEXXL_SOLD"));
    			catItems.add(catl);
    		}
    	}catch (Exception e) {
    		  e.printStackTrace();
    	} 
    	finally { 
    		try {
    			result1.close();
        		conn.close();
    		}catch (Exception e) {  } 		
    		
    	}
    	return catItems;
    }
    public static boolean addcitems (String username, String cataloguename,String itemname, int scost,
    		int pcost,int sizexsavail,int sizexssold, int sizesavail, int sizessold, int sizemavail, int sizemsold, int sizelavail, int sizelsold, int sizexlavail, 
    		int sizexlsold, int sizexxlavail, int sizexxlsold){ 
          	boolean result = false;    	
          	Connection conn=null;
          	Statement stmt=null;
          	try{
          		conn = DBUtils.getConnection();
          		stmt = conn.createStatement();
          		String query = "insert into oim_inventory_items values('"+ username + "','" + cataloguename + "','"+
              		    itemname +"',"+ scost +","+ pcost +","+sizexsavail+","+sizexssold+","+sizesavail+","+
          				sizessold+","+ sizemavail+","+sizemsold+","+sizelavail+","+sizelsold+
          				","+sizexlavail+","+sizexlsold+","+sizexxlavail+","+sizexxlsold + ");";
          		System.out.println(query);
          		int result1 = stmt.executeUpdate(query);
          		if (result1 ==1) {
                      System.out.println("successfully inserted"); 
                      result = true;
          		}  
                  else {
                      System.out.println( "unsucessful insertion "); 
                  }      
          	}catch (Exception e) {
          		  e.printStackTrace();
          	} 
          	finally { 
          		try {
              		conn.close();
          		}catch (Exception e) {  } 		
          		
          	}
          	return result;
          }
    public static boolean deletecitems (String itemname,String cataloguename){ 
      	boolean result = false;    	
      	Connection conn=null;
      	Statement stmt=null;
      	try{
      		conn = DBUtils.getConnection();
      		stmt = conn.createStatement();
      		String query = "delete from oim_inventory_items where category='"+
          		   cataloguename + "' and itemname='"+itemname+"'";
      		System.out.println(query);
      		int result1 = stmt.executeUpdate(query);
      		if (result1>0) {
                  System.out.println("successfully deleted"); 
                  result = true;
      		}  
              else {
                  System.out.println( "unsucessful deletion "); 
              }      
      	}catch (Exception e) {
      		  e.printStackTrace();
      	} 
      	finally { 
      		try {
          		conn.close();
      		}catch (Exception e) {  } 		
      		
      	}
      	return result;
      }

 }
 
    


    
