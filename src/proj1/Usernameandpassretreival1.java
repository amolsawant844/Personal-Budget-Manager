    package proj1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Usernameandpassretreival1 
{
    public static void Usernameandpassretreival1(String s0,String s1)
    {
        try
        {  
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver"); 

            //STEP 3: Open a connection
             System.out.println("Connecting to a selected database...");
 
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Usernameandpasswords","root","root");  
            //here test is database name, root is username and password  
  
             System.out.println("Connected database successfully...");
      

            Statement stmt=con.createStatement();  
           // ResultSet rs=stmt.executeQuery("select * from Uandp ");  

            /*while(rs.next())  
            System.out.println(rs.getString(1)+"  "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));  
            */
            
            String query="Select Username, Password from Uandp where username='"+s0+"'";
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(query);
            ResultSet rs=pst.executeQuery();
            rs.next();
            String x=rs.getString("Password");
            if(x.equals(s1))
            {
               Afterlogin_page.after(s0);
               
                
            }
            else
            {
                Alert_box_2.display("Warning","username and passsword incorrect");
                
            }
             
            
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  

    }
    
}
