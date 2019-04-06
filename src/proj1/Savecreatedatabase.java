
package proj1;
import java.sql.*;
public class Savecreatedatabase 
{
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";// driver gets to know on which platform u r working(mac ,win,linux)  
	   static final String DB_URL = "jdbc:mysql://localhost";//send the workbench a connection address
	   static final String USER = "root";
	   static final String PASS = "root";
           public static void main (String args[])
	   {
		   Connection conn=null;
		   Statement stmt = null;
		   try
		   {
		   Class.forName("com.mysql.jdbc.Driver");//load and register ur driver class
		   System.out.println("Connecting to a selected database...");
		   conn = DriverManager.getConnection(DB_URL, USER, PASS);//passing the address and the username and the password
		   System.out.println("Connected database successfully...");
		   System.out.println("Creating table in given database...");
		   stmt = conn.createStatement();//create connection between java apllicaton and database...coz java calls get converted into database calls coz java calls cannot be understood
		   String sql=  "Create database Usernameandpasswords";
		   stmt.executeUpdate(sql);
		   System.out.println("a database created");
		   
		     
		      
		   }
		   catch(Exception e)
		   {
			   e.printStackTrace();
		   }
		   
	   }

 
}
    

