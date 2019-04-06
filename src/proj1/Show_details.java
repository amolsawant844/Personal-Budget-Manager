/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author amol
 */
public class Show_details 
{
    public static void show_det(String s0)
    {
         
        Stage window=new Stage();
     //   window.setTitle("What do you want to do?");
        window.initModality(Modality.APPLICATION_MODAL);
        Label d=new Label("Enter the date");
        DatePicker d222=new DatePicker();
        Button get=new Button("Get Details");
        get.setPrefHeight(40);
        get.setPrefWidth(150);
        get.setOnAction(e ->
        {
             LocalDate value=d222.getValue();
              DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd LLLL yyyy");
              String df=value.format(formatter);
              try
        { 
            String d2,t = null,g = null,s = null,cs = null,e1 = null,c=null,b4 = null,m = null,c4 = null,o = null;
           
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            //STEP 3: Open a connection
             System.out.println("Connecting to a selected database...");
 
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Usernameandpasswords","root","root");  
            //here test is database name, root is username and password  
  
             System.out.println("Connected database successfully...");
      //String query="Select Username, Password from usernameandpass where username='"+s+"'";
	//rs.next();
	//System.out.println(rs.getString("Password"));
	
//date,travelling,groceries,snacks,CS,electronics,clothes,Bills,Movies,Chai,others
            Statement stmt=con.createStatement();
            String query="Select  *from "+s0+" where date='"+df+"'";
            PreparedStatement pst=(PreparedStatement) con.prepareStatement(query);
            ResultSet rs=pst.executeQuery();
            
            while(rs.next())  
            {   d2=rs.getString(1);
                t=rs.getString(2);
                g=rs.getString(3);
                s=rs.getString(4);
                cs=rs.getString(5);
                e1=rs.getString(6);
                c=rs.getString(7);
                b4=rs.getString(8);
                m=rs.getString(9);
                c4=rs.getString(10);
                o=rs.getString(11);
            }
        
               disp_det.dis(t, g, s, cs, o, e1, c4, b4, m, c);
            con.close();    
        }
         catch(Exception e1)
         {
                e1.printStackTrace();
         }
        });
        GridPane v1=new GridPane();
        v1.setPadding(new Insets(10,10,10,10));
        v1.setVgap(8);
        v1.setHgap(10);
       GridPane.setConstraints(d,0,0);
       GridPane.setConstraints(d222,1,0);
       GridPane.setConstraints(get,0,1);
       v1.getChildren().addAll(d,d222,get);
        Scene s4=new Scene(v1,400,200);
        window.setScene(s4);
        window.show();
    
    }
    
}
