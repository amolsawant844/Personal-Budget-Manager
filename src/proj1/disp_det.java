/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proj1;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author amol
 */
public class disp_det 
{
    public static void dis(String t,String g,String s,String cs,String o,String e1,String c4,String b4,String m,String c)
    {
         Stage window=new Stage();
        window.setTitle("Details");
        window.initModality(Modality.APPLICATION_MODAL);
      
        Label t3,g3,s3,cs3,o3,e13,c3,bill3,m3,chai3,Total;
        t3=new Label("Travelling : "+t);
        g3=new Label("Groceries : "+g);
        s3=new Label("Snacks : "+s);
        cs3=new Label("CS Gaming : "+cs);
        o3=new Label("Others : "+o);
        e13=new Label("Electronic items/Recharges : "+e1);
        c3=new Label("Clohtes : "+c);
        bill3=new Label("Bill Payements : "+b4);
        m3=new Label("Movies : "+m);
        chai3=new Label("Chai : "+c4);
          int sum=(Integer.parseInt(t)+Integer.parseInt(g)+Integer.parseInt(s)+Integer.parseInt(cs)+Integer.parseInt(o)+Integer.parseInt(e1)+Integer.parseInt(c)+Integer.parseInt(b4)+Integer.parseInt(m)+Integer.parseInt(c4));
          
        Total=new Label("Total:"+sum);
        
        GridPane v1=new GridPane();
        v1.setPadding(new Insets(10,10,10,10));
        v1.setVgap(8);
        v1.setHgap(10);
        GridPane.setConstraints(t3,0,0);
        GridPane.setConstraints(g3,0,1);
        GridPane.setConstraints(s3,0,2);
        GridPane.setConstraints(cs3,0,3);
        GridPane.setConstraints(o3,0,9);
        GridPane.setConstraints(e13,0,4);
        GridPane.setConstraints(c3,0,5);
        GridPane.setConstraints(bill3,0,6);
        GridPane.setConstraints(m3,0,7);
        GridPane.setConstraints(chai3,0,8);
        GridPane.setConstraints(Total,0,10);
        v1.getChildren().addAll(t3,g3,s3,cs3,o3,e13,c3,bill3,m3,chai3,Total);
        Scene s4=new Scene(v1,600,600);
        window.setScene(s4);
        window.show();
    
     
    }
    
}
