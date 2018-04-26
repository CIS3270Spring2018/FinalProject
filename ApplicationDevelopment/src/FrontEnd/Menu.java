package FrontEnd;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

public class Menu extends Application {

	Scene scene;
	Button login;
	Button signup;
	Button forgotPassword;
	 RegistrationForm r = new RegistrationForm();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Main Menu");
		login = new Button("Login");
		signup = new Button("Sign Up");
		forgotPassword = new Button("Forgot Password");
		
		VBox layout = new VBox();
		layout.getChildren().addAll(login,signup,forgotPassword);
		
		scene = new Scene(layout,300,300);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		login.setOnAction(e -> r.runLogin());
		
		signup.setOnAction(e -> {
	    
		r.runSignUp();
		
		});
		
		forgotPassword.setOnAction(e -> {
			
			
			
		});
		
		
		
	}
	
	public static void main(String [] args)
	{
		launch(args);
	}
	
	

}
