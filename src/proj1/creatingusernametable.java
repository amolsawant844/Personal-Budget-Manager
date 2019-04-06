
package proj1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class creatingusernametable
{
    public creatingusernametable()
    {
        //Alert_box_2.display("Notification","creating ur database...please wait");
    }
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";// driver gets to know on which platform u r working(mac ,win,linux)  
	   static final String DB_URL = "jdbc:mysql://localhost/Usernameandpasswords";//send the workbench a connection address
	   static final String USER = "root";
	   static final String PASS = "root";
	   public creatingusernametable(String username)
	   {
		   Connection conn=null;
		   Statement stmt = null;
		   try
		   {
		   Class.forName("com.mysql.jdbc.Driver");
		   System.out.println("Connecting to a selected database...");
		   conn = DriverManager.getConnection(DB_URL, USER, PASS);
		   System.out.println("Connected database successfully...");
		   System.out.println("Creating table in given database...");
		   stmt = conn.createStatement();
		   String sql = " CREATE TABLE  "+username+" "  +
                   "(date VARCHAR(255) not NULL, " +
                   "travelling VARCHAR(255) , " +
                           "groceries VARCHAR(255) , " +
                           "snacks VARCHAR(255) , " +
                           "CS VARCHAR(255) , " +
                           "electronics VARCHAR(255) , " +
                           "clothes VARCHAR(255) , " +
                           "Bills VARCHAR(255) , " +
                           "Movies VARCHAR(255) , " +
                           "Chai VARCHAR(255) , " +
                           "others VARCHAR(255) , " +
                           " PRIMARY KEY (date))"; 
   
		   stmt.executeUpdate(sql);
		   System.out.println("a table has been created");
		   
		     
		      
		   }
		   catch(Exception e)
		   {
			   e.printStackTrace();
		   }
	
           }
    
}
