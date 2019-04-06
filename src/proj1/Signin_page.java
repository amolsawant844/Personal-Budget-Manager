/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj1;
import javafx.application.*;
import javafx.geometry.Insets;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.layout.Region;
import javafx.scene.control.*;
public class Signin_page
{
    static Label N,E,sd;
     public static void  signin()
    {
         
        //creating a window
        Stage window=new Stage();
        window.setTitle("login page");
        window.initModality(Modality.APPLICATION_MODAL);
        
        //Labels
        N=new Label("Enter your name");
        E=new Label("Enter your Password");
        sd=new Label("save your details and then login");
        
        //TextField
        TextField name=new TextField();
        name.setPromptText("Name");
        TextField Pass=new TextField();
        Pass.setPromptText("Min 6 characters long");
        
        //Buttons
        Button s =new Button("Save");
        Button l1=new Button("Login");
        l1.setPrefHeight(40);
        l1.setPrefWidth(100);
        s.setPrefHeight(40);
        s.setPrefWidth(100);
        s.setOnAction(e ->
        {
            String s1=Pass.getText();
            String s0=name.getText();
            if(s1.length()<=6)
            {
                Alert_box_2.display("Notification","Password length should be atleast 6 characters");
            
            }
            else
            {    
                Save_page.Savepage(s0,s1);
                creatingusernametable c=new creatingusernametable(s0);
                Alert_box_2.display("Notification","Your details have been saved");
            }
        });
        l1.setOnAction(e -> Login_page.login());
        
        GridPane g=new GridPane();
        g.setPadding(new Insets(10,10,10,10));
        g.setVgap(8);
        g.setHgap(10);
        g.setConstraints(N,0,0);
        g.setConstraints(name,1,0);
        g.setConstraints(E,0,1);
        g.setConstraints(Pass,1,1);
        g.setConstraints(sd,0,2);
        g.setConstraints(s,0,3);
        g.setConstraints(l1,1,3);
                
                
        g.getChildren().addAll(N,E,sd,name,Pass,s,l1);
        Scene s1=new Scene(g,500,400);
        window.setScene(s1);
        window.show();
      
      
    }  
}
