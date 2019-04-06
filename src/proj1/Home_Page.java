package proj1;
import javafx.application.*;
import javafx.geometry.Pos;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.Insets;
public class Home_Page extends Application
{
    
   
    Stage window;
    Button signin,login;
    Label welcome;
    @Override
    public void start(Stage primaryStage)throws Exception 
    {
        // TODO Auto-generated method stub
		
        //creating a window
        window=primaryStage;
        window.setTitle("BUDGET_MANAGING");
        
        
        //Labels
        welcome=new Label("WELCOME TO BUDGET MANAGER!");
       
        
        //Buttons
        signin=new Button("Sign In");
        signin.setPrefHeight(40);
        signin.setPrefWidth(100);
        login=new Button("Log In");
        login.setPrefHeight(40);
        login.setPrefWidth(100);
        login.setOnAction(e -> 
        {
            Login_page.login();
                
        });
        signin.setOnAction(e -> 
        {
            Signin_page.signin();
                
        });
        
        GridPane g=new GridPane();
        g.setPadding(new Insets(10,10,10,10));
        g.setVgap(8);
        g.setHgap(10);
        
        g.setConstraints(welcome,10,4);
        g.setConstraints(login,10,8);
        g.setConstraints(signin,10,6);
        
        g.getChildren().addAll(welcome,signin,login);
        Scene s=new Scene(g,400,300);
        window.setScene(s);
        window.show();
    }
    public static void main(String args[])
    {
        launch(args);
        
    }
    
}
