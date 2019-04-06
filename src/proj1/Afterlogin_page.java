/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author amol
 */
public class Afterlogin_page  
{
    public static void after(String s0)
    {
        Stage window=new Stage();
        window.setTitle("What do you want to do?");
        window.initModality(Modality.APPLICATION_MODAL);
        
        //labels
        Label wh=new Label("What do You want to do ?");
         wh.setMaxSize(200, 100);
        //Buttons
        Button b1=new Button("Enter today's Budget");
        Button b2=new Button("Get Budget Details");
        b1.setPrefHeight(40);
        b1.setPrefWidth(150);
        b2.setPrefHeight(40);
        b2.setPrefWidth(150);
        b1.setOnAction(e ->
        {
             mainpage m=new mainpage();
                m.Ma(s0);
               
        });
        b2.setOnAction(e ->
        {
            Show_details.show_det(s0);
        });
        GridPane v1=new GridPane();
        v1.setPadding(new Insets(10,10,10,10));
        v1.setVgap(8);
        v1.setHgap(10);
        v1.setConstraints(wh,0,0);
        v1.setConstraints(b1,0,1);
        v1.setConstraints(b2,1,1);
        v1.getChildren().addAll(wh,b1,b2);
        Scene s=new Scene(v1,400,200);
        window.setScene(s);
        window.show();
    
        
    }

    
}
