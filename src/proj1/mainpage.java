
package proj1;

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.layout.Region;
import javafx.scene.control.*;
interface textfieldelements
{
      TextField  t1=new TextField();
      TextField  g1=new TextField();
      TextField  s1=new TextField();
      TextField  cs1=new TextField();
      TextField  o1=new TextField();
      TextField  e11=new TextField();
      TextField  c1=new TextField();
      TextField  b=new TextField();
      TextField  m1=new TextField();
      TextField  chai1=new TextField();
     DatePicker d111=new DatePicker();
}
public class mainpage implements textfieldelements
{
    public void Ma(String user)
    {
        //Date picker
      
      d111.setPromptText("Enter Today's Date");
      
      //Labels
      Label t=new Label("Travelling:");
      Label  g=new Label("Groceries:");
      Label  s=new Label("Snacks:");
      Label  cs=new Label("CS Gaming:");
      Label  o=new Label("Others:");
      Label  e1=new Label("Electronic items/Recharges:");
      Label  c=new Label("Clohtes:");
      Label  bill=new Label("Bill Payements:");
      Label  m=new Label("Movies:");
      Label  chai=new Label("Chai:");
      Label Date=new Label("Enter today's Date:");  
        
        //TextFields
     

//Buttons
        Button save=new Button("Submit");
        save.prefHeight(40);
        save.prefWidth(100);
        save.setOnAction( e ->
        { 
            insertingdetails i=new insertingdetails(user);
            int sum=(Integer.parseInt(t1.getText())+Integer.parseInt(g1.getText())+Integer.parseInt(s1.getText())+Integer.parseInt(cs1.getText())+Integer.parseInt(o1.getText())+Integer.parseInt(e11.getText())+Integer.parseInt(c1.getText())+Integer.parseInt(m1.getText())+Integer.parseInt(chai1.getText())+Integer.parseInt(b.getText()));
            Alert_box_2.display("Saving your details...", "Your today's expense: "+sum);
        }
        );
        
       
        
        GridPane g11=new GridPane();
        g11.setPadding(new Insets(30,30,30,30));
        g11.setVgap(8);
        g11.setHgap(10);
       
        //setting constraints
        GridPane.setConstraints(t,0,3);
        GridPane.setConstraints(t1,1,3);
        GridPane.setConstraints(g,0,4);
        GridPane.setConstraints(g1,1,4);
        GridPane.setConstraints(s,0,5);
        GridPane.setConstraints(s1,1,5);
        GridPane.setConstraints(cs,0,6);
        GridPane.setConstraints(cs1,1,6);
        GridPane.setConstraints(o,0,12);
        GridPane.setConstraints(o1,1,12);
        GridPane.setConstraints(e1,0,7);
        GridPane.setConstraints(e11,1,7);
        GridPane.setConstraints(c,0,8);
        GridPane.setConstraints(c1,1,8);
        GridPane.setConstraints(bill,0,9);
        GridPane.setConstraints(b,1,9);
        GridPane.setConstraints(m,0,10);
        GridPane.setConstraints(m1,1,10);
        GridPane.setConstraints(chai,0,11);
        GridPane.setConstraints(chai1,1,11);
        GridPane.setConstraints(save,0,15);
        GridPane.setConstraints(d111,1,1);
        GridPane.setConstraints(Date,0,1);
        
        Stage window=new Stage();
        g11.getChildren().addAll(d111,Date,t1,t,g,g1,s,s1,cs,cs1,e1,e11,c,c1,bill,b,m,m1,chai,chai1,o,o1,save);
        Scene s2=new Scene(g11,600,600);
        window.setScene(s2);
        window.show();
       
    }
    
    
    
    
}
