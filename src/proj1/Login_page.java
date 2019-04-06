
package proj1;

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.layout.Region;
import javafx.scene.control.*;
public class Login_page 
{
     static Label U,p;
     
    public static void  login()
    {
        //creating a window
        Stage window=new Stage();
        window.setTitle("login page");
        window.initModality(Modality.APPLICATION_MODAL);
        
        //Labels
        U=new Label("Username");
        U.setMaxSize(100, 100);
        p=new Label("Password");
        
        //TextField
        TextField Username=new TextField();
        Username.setPromptText("Name");
        TextField Password=new TextField();
                Password.setPromptText("Password");
        //Username.autosize();
        //Password.autosize();
        
        //Buttons
        Button l =new Button("Login");
        l.setPrefHeight(40);
        l.setPrefWidth(100);
        l.setOnAction(e -> 
        { 
            String u=Username.getText();
            String p=Password.getText();
            
            Usernameandpassretreival1.Usernameandpassretreival1(u, p);
                
                });
      
        
        //adding layout,scenes,labels,buttons
        GridPane v=new GridPane();
        v.setPadding(new Insets(10,10,10,10));
        v.setVgap(8);
        v.setHgap(10);
        v.setConstraints(U,5,0);
        v.setConstraints(p,5,3);
        v.setConstraints(Username,7,0);
        v.setConstraints(Password,7,3);
        v.setConstraints(l,5,7);
        
        v.getChildren().addAll(U,p,Username,Password,l);
        Scene s=new Scene(v,300,200);
        window.setScene(s);
        window.show();
    
    }
}
