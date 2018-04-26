package FrontEnd;

import Backend.Database;
import flightApp.VariableObject;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Menu extends Application {

	// objects  used to make javafx screens
	Scene scene;
	Button login;
	Button signup;
	Button forgotPassword;
	
	// objects used to call methods in different classes
	 RegistrationForm r = new RegistrationForm();
	 VariableObject v = new VariableObject();
	 Database d = new Database(v);
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		
		// create a stage and buttons
		primaryStage.setTitle("Main Menu");
		login = new Button("Login");
		signup = new Button("Sign Up");
		forgotPassword = new Button("Forgot Password");
		
		//vertical box layout
		VBox layout = new VBox();
		layout.getChildren().addAll(login,signup,forgotPassword);
		
		scene = new Scene(layout,300,300);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		// run login method
		login.setOnAction(e -> r.runLogin());
		
		// run signup
		signup.setOnAction(e -> {
	    
		r.runSignUp();
		
		
		});
		
		// run forget passwor
		forgotPassword.setOnAction(e -> {
			r.retrievePassword();
			
			
		});
		
		
			
		
		
		
	}
	
	public static void main(String [] args)
	{
		
		launch(args);
		
		
	}
	
	
	// method to open screen once the user has logged in
	public void loggedin(){
		// objects needed for java fx
		Stage primaryStage = new Stage();
		primaryStage.setTitle("Welcome");
		Button logout = new Button("Log Out");
		
		// make a go back to main menu button
		Button menu = new Button("Main Menu");
		
		menu.setOnAction(e->
		{Menu m = new Menu();
		try {
			m.start(primaryStage);
		} catch (Exception e1) {
		
			System.out.println(e1.getMessage());
		}
		});
		
		// Departure info
		Label lDepartureCity = new Label("Departed City");
	
		// list of cities we fly too
		ChoiceBox<String> departCity = new ChoiceBox<>();
		departCity.getItems().addAll("Atlanta", "Orlando","New York");
		
		Label lDepartureDay = new Label("Day of Departure");
		
		// is go current flights
		ChoiceBox<String> departDay = new ChoiceBox<>();
		departDay.getItems().addAll("01/01/2018","01/02/2018","01/03/2018", "01/04/2018","01/05/2018");
		
		Label lDepartureTime = new Label("Time of Departure");
		
		
		// list of time we fly
		ChoiceBox<String> departTime = new ChoiceBox<>();
		departTime.getItems().addAll("0100", "1200","1330", "1500");
		
		
		/**Destination info**/
	 
		Label lDestination  = new Label("Destination");
	
		// is of destination
		ChoiceBox<String> arrivalCity = new ChoiceBox<>();
		arrivalCity.getItems().addAll("Atlanta", "Orlando","New York");
		

		Label lArrivalDay = new Label("Day of Arrival");
		
		
		// list of day we land
		ChoiceBox<String> destinationDay = new ChoiceBox<>();
		destinationDay.getItems().addAll("01/01/2018","01/02/2018","01/03/2018", "01/04/2018","01/05/2018");
		
		
	   Label lArrivalTime  = new Label("Time of Arrival");
	
		
	   // list of time we land at locations
		ChoiceBox<String> arrivalTime = new ChoiceBox<>();
		arrivalTime.getItems().addAll("0100", "1200","1330", "1500");
	

		
		// create text that appear to show error
		final Text actiontarget1 = new Text();
	
		Button search = new Button("Search");

		// vertical box layout to house all javfx objects
		VBox layout = new VBox();
		layout.getChildren().addAll(lDepartureCity,departCity,lDepartureDay,departDay,lDepartureTime,departTime,
				lDestination,arrivalCity,lArrivalDay,destinationDay,lArrivalTime,arrivalTime
				,actiontarget1,search,menu,logout);
		
		
		
		// create a scene put it into the primary stage and show on screen
		scene = new Scene(layout,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		// when search button is clicked show flights
		search.setOnAction(e -> 
		{
			v.setDeparted_city(departCity.getValue());
			v.setDepartureDay(departDay.getValue());
			v.setDepart_time(departTime.getValue());
			v.setArrival_city(arrivalCity.getValue());
			v.setArrivalDay(destinationDay.getValue());
			v.setArrival_time(arrivalTime.getValue());
			
			// check if your left any field empty
			if(v.getDeparted_city()== null||
			v.getDepartureDay()== null||
			v.getDepart_time()== null||
			v.getArrival_city()== null||
			v.getArrivalDay() == null||
			v.getArrival_time() == null)
			{

				actiontarget1.setText("Please Enter infomation into every field");
			}
			else{
				
				// try catch to make sure object is not null
		    try {
				d.searchFlights(v);
				
			} catch (Exception e1) {
				
				actiontarget1.setText("Object is null");
			}
			}
			
		});
		
	
		// logout button that removes user information

		logout.setOnAction(e -> 
		{v = null;
				actiontarget1.setText("You have logged out");
		});
		}
	
	
	// method to list flights
	public void listOfFlight(){
		
		Stage primaryStage = new Stage();
		primaryStage.setTitle("Flights");
		
		
		
		

		VBox layout = new VBox();
		
		
		
		
		
		scene = new Scene(layout,500,500);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	
				//d.searchFlights(v);
				
			
		}
		
	
	
		
		
	}



