package proj1;
//a database where username and assword will be saved
import java.sql.*;
public class Save_page 
{
    	 // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/Usernameandpasswords";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "root";
	   
	   public static void Savepage(String name,String pass) 
           {
	   Connection conn = null;
	   Statement stmt = null;
	   try{
	      //STEP 2: Register JDBC driver
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to a selected database...");
	      conn = DriverManager.getConnection(DB_URL, USER, PASS);
	      System.out.println("Connected database successfully...");
	      
	      //STEP 4: Execute a query
	      System.out.println("Inserting records into the table...");
	      stmt = conn.createStatement();
	      
	      String sql = "INSERT INTO Uandp " +
	                   "VALUES ('"+name+"','"+pass+"')";
	      stmt.executeUpdate(sql);
	    /*  sql = "INSERT INTO usernameandpass " +
	                   "VALUES ('Mahnaz', 'Fatma')";
	      stmt.executeUpdate(sql);
   sql = "INSERT INTO usernameandpass " +
	                   "VALUES ('Zaid', 'Khan')";
	      stmt.executeUpdate(sql);
	      sql = "INSERT INTO usernameandpass " +
	                   "VALUES('Sumit', 'Mittal')";
	      stmt.executeUpdate(sql);
	      System.out.println("Inserted records into the table...");
              */
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
           }
}
