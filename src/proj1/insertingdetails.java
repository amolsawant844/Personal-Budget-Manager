
package proj1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static proj1.Save_page.DB_URL;

public class insertingdetails implements textfieldelements
{
    String tx=t1.getText();
    String gx=g1.getText();
    String sx=s1.getText();
    String csx=cs1.getText();
    String ox=o1.getText();
    String ex=e11.getText();
    String cx=c1.getText();
    String bx=b.getText();
    String mx=m1.getText();
    String chaix=chai1.getText();
  //  String date1=(((TextField).d111.getEditor()).getText());
    
    int t11=Integer.parseInt(t1.getText());
    int g11=Integer.parseInt(g1.getText());
    int s11=Integer.parseInt(s1.getText());
    int cs11=Integer.parseInt(cs1.getText());
    int o11=Integer.parseInt(o1.getText());
    int e111=Integer.parseInt(e11.getText());
    int c11=Integer.parseInt(c1.getText());
    int b11=Integer.parseInt(b.getText());
    int m11=Integer.parseInt(m1.getText());
    int chai11=Integer.parseInt(chai1.getText());
     // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/Usernameandpasswords";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "root";
	
    public  insertingdetails(String use)
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
	      //Converting date picker
              //LocalDate ld=d111.getValue();
              // String date=ld.toString();
              LocalDate value=d111.getValue();
              DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd LLLL yyyy");
              String d=value.format(formatter);
               //System.out.println(d);
              //STEP 4: Execute a query
	      System.out.println("Inserting records into the table...");
	      stmt = conn.createStatement();
               String sql = "INSERT INTO "+use+" " +
                  "VALUES ('"+d+"','"+tx+"','"+gx+"','"+sx+"','"+csx+"','"+ex+"','"+cx+"','"+bx+"','"+mx+"','"+chaix+"','"+ox+"')";
	      stmt.executeUpdate(sql);
           }
           catch(Exception e)
	   {
		   e.printStackTrace();
	   }
        
    }
            
    
}
