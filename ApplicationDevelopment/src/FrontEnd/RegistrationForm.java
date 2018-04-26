package FrontEnd;


import FrontEnd.LoginWindow;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Backend.Database;
import flightApp.VariableObject;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.Window;


public class RegistrationForm extends Application {
	
	
	// objects used to call methods in other classes
	VariableObject v = new VariableObject();
	Database d = new Database(v);
	
	// method to show signup javafx
	public  void runSignUp(){
		// create a stage
		Stage primaryStage = new Stage();
		primaryStage.setTitle("Registration Form For New User");

		// Create the registration form grid pane
		GridPane gridPane = createRegistrationFormPane();
		// Add UI controls to the registration form grid pane
		addUIControls(gridPane);
		// Create a scene with registration form grid pane as the root node
		Scene scene = new Scene(gridPane, 800, 500);
		// Set the scene in primary stage
		primaryStage.setScene(scene);

		primaryStage.show();
	}


	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Registration Form For New User");

		// Create the registration form grid pane
		GridPane gridPane = createRegistrationFormPane();
		// Add UI controls to the registration form grid pane
		addUIControls(gridPane);
		// Create a scene with registration form grid pane as the root node
		Scene scene = new Scene(gridPane, 800, 500);
		// Set the scene in primary stage
		primaryStage.setScene(scene);

		primaryStage.show();
	}

	private GridPane createRegistrationFormPane() {
		// Instantiate a new Grid Pane
		GridPane gridPane = new GridPane();

		// Position the pane at the center of the screen, both vertically and
		// horizontally
		gridPane.setAlignment(Pos.CENTER);

		// Set a padding of 20px on each side
		gridPane.setPadding(new Insets(40, 40, 40, 40));

		// Set the horizontal gap between columns
		gridPane.setHgap(10);

		// Set the vertical gap between rows
		gridPane.setVgap(8);

		// Add Column Constraints

		// columnOneConstraints will be applied to all the nodes placed in
		// column one.
		ColumnConstraints columnOneConstraints = new ColumnConstraints(100,
				100, Double.MAX_VALUE);
		columnOneConstraints.setHalignment(HPos.RIGHT);

		// columnTwoConstraints will be applied to all the nodes placed in
		// column two.
		ColumnConstraints columnTwoConstrains = new ColumnConstraints(200, 200,
				Double.MAX_VALUE);
		columnTwoConstrains.setHgrow(Priority.ALWAYS);

		gridPane.getColumnConstraints().addAll(columnOneConstraints,
				columnTwoConstrains);

		return gridPane;
	}

	private void addUIControls(final GridPane gridPane) {
		// Add Header
		Label headerLabel = new Label("Registration Form");
		headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
		gridPane.add(headerLabel, 0, 0, 2, 1);
		GridPane.setHalignment(headerLabel, HPos.CENTER);
		GridPane.setMargin(headerLabel, new Insets(20, 0, 20, 0));

		

		// Add First Name Label
		Label FnameLabel = new Label("First Name : ");
		gridPane.add(FnameLabel, 0, 2);

		// Add First Name Text Field
		final TextField FnameField = new TextField();
		FnameField.setPrefHeight(40);
		gridPane.add(FnameField, 1, 2);

		// Add Last Name Label
		Label LnameLabel = new Label("Last Name: ");
		gridPane.add(LnameLabel, 0, 3);

		// Add Last Name Text Field
		final TextField LnameField = new TextField();
		LnameField.setPrefHeight(40);
		gridPane.add(LnameField, 1, 3);

		// Label for Address
		Label addressLabel = new Label("Address");
		gridPane.add(addressLabel, 0, 4);

		// text field address
		final TextField addressField = new TextField();
		addressField.setPrefHeight(40);
		gridPane.add(addressField, 1, 4);

		// Label for state
		Label stateLabel = new Label("State");
		gridPane.add(stateLabel, 0, 5);

		// Text for state
		final TextField stateField = new TextField();
		stateField.setPrefHeight(40);
		gridPane.add(stateField, 1, 5);

		// label for zip
		Label zipLabel = new Label("Zip");
		gridPane.add(zipLabel, 0, 6);

		// TextField for zip
		final TextField zipField = new TextField();
		zipField.setPrefHeight(40);
		gridPane.add(zipField, 1, 6);

		// label username
		Label usernameLabel = new Label("Username");
		gridPane.add(usernameLabel, 0, 7);

		// textfield username
		final TextField usernameField = new TextField();
		usernameField.setPrefHeight(40);
		gridPane.add(usernameField, 1, 7);

		// label password
		Label passwordLabel = new Label("Password");
		gridPane.add(passwordLabel, 0, 8);

		// TextField
		final TextField passwordField = new TextField();
		passwordField.setPrefHeight(40);
		gridPane.add(passwordField, 1, 8);

		// Add Email Label
		Label emailLabel = new Label("Email: ");
		gridPane.add(emailLabel, 0, 9);

		// Add Email Text Field
		final TextField emailField = new TextField();
		emailField.setPrefHeight(40);
		gridPane.add(emailField, 1, 9);

		// Add SSN label
		Label ssnLabel = new Label("SSN");
		gridPane.add(ssnLabel, 0, 10);

		// Add ssn textfield
		final TextField ssnField = new TextField();
		ssnField.setPrefHeight(40);
		gridPane.add(ssnField, 1, 10);

		// Security Question Label
		Label SQLabel = new Label("Security Question:");
		gridPane.add(SQLabel, 0, 11);

		// Secuirty Quesiton Text Field
		/*final TextField SQField = new TextField();
		SQField.setPrefHeight(40);
		gridPane.add(SQField, 1, 11);*/
		
		// chioce box for secrity question
		ChoiceBox<String> SQField = new ChoiceBox<>();
		SQField.getItems().addAll("first pet's name?", "first car's make");
		gridPane.add(SQField, 1, 11);
				

		// Securiyt Answer label
		Label SALabel = new Label("Security Answer");
		gridPane.add(SALabel, 0, 12);

		// Secuiryt Anser TextField
		final TextField SAField = new TextField();
		SAField.setPrefHeight(40);
		gridPane.add(SAField, 1, 12);

		// Add Submit Button
		Button submitButton = new Button("Submit");
		submitButton.setPrefHeight(40);
		submitButton.setDefaultButton(true);
		submitButton.setPrefWidth(100);
		gridPane.add(submitButton, 0, 13, 2, 1);
		GridPane.setHalignment(submitButton, HPos.CENTER);
		GridPane.setMargin(submitButton, new Insets(20, 0, 20, 0));

		submitButton.setOnAction(new EventHandler<ActionEvent>() {
			
			
			

			public void handle(ActionEvent event) {
		
			// login code needs to be implmented
			//	v.setUserid(Integer.parseInt(UserIDField.getText()));
				v.setFirst_name(FnameField.getText());
				v.setLast_name(LnameField.getText());
				v.setAddress(addressField.getText());
				v.setZip(zipField.getText());
				v.setState(stateField.getText());
				v.setUsername(usernameField.getText());
				v.setPassword(passwordField.getText());
				v.setEmail(emailField.getText());
				v.setSsn(ssnField.getText());
				v.setSecurity_question(SQField.getValue());
				v.setQuestion_answer(SAField.getText());
				
				try {
/*					String query = "insert Into user (userID, FirstName, LastName, address, zip, state, username, password, email, ssn, securityQuestion, securityAnswer)"
							+ "values (?,?,?,?,?,?,?,?,?,?,?,?)";
					Connection con = Query.getConnection();
					PreparedStatement pst = con.prepareStatement(query);

					pst.setString(1, UserIDField.getText());
					pst.setString(2, FnameField.getText());
					pst.setString(3, LnameField.getText());
					pst.setString(4, addressField.getText());
					pst.setString(5, zipField.getText());
					pst.setString(6, stateField.getText());
					pst.setString(7, usernameField.getText());
					pst.setString(8, passwordField.getText());
					pst.setString(9, emailField.getText());
					pst.setString(10, ssnField.getText());
					pst.setString(11, SQField.getText());
					pst.setString(12, SAField.getText());

					pst.executeUpdate();

					pst.close();*/
					
					d.signupCustomer(v);
					d.showAllUser();

				} catch (Exception e) {

					e.printStackTrace();
				}

				showAlert(Alert.AlertType.CONFIRMATION, gridPane.getScene()
						.getWindow(), "Registration Successful!", "Welcome "
						+ FnameField.getText() + " " + LnameField.getText());
				
				  
				}
			
			
			
			
		});
		
		
	}

	private void showAlert(Alert.AlertType alertType, Window owner,
			String title, String message) {
		Alert alert = new Alert(alertType);
		alert.setTitle(title);
		alert.setHeaderText(null);
		alert.setContentText(message);
		alert.initOwner(owner);
		alert.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	public void runLogin(){

		/*
		 * login a user
		 * 
		 * */
		
		// create the stage ,gridpane , vertical and horizontal gap
		      Stage secondStage = new Stage();
		        secondStage.setTitle("JavaFX Welcome");
		        GridPane grid = new GridPane();
		        grid.setAlignment(Pos.CENTER);
		        grid.setHgap(10);
		        grid.setVgap(10);
		        grid.setPadding(new Insets(25, 25, 25, 25));

		        // put text on the screen saying welcome
		        Text scenetitle = new Text("Welcome");
		        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		        grid.add(scenetitle, 0, 0, 2, 1);

		        // label for username in row 1 column 0
		        Label userName = new Label("User Name:");
		        grid.add(userName, 0, 1);

		        // tet field for user input
		        TextField userTextField = new TextField();
		        grid.add(userTextField, 1, 1);

		        // label for password
		        Label pw = new Label("Password:");
		        grid.add(pw, 0, 2);

		        // text fiekd for password input
		        PasswordField pwBox = new PasswordField();
		        grid.add(pwBox, 1, 2);

		        // create signin button
		        Button btn = new Button("Sign in");
		        // mae a horizontal box on the bottom right for button
		        HBox hbBtn = new HBox(10);
		        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		        hbBtn.getChildren().add(btn);
		        grid.add(hbBtn, 1, 4);

		        // create error message text area
		        final Text actiontarget = new Text();
		        grid.add(actiontarget, 1, 6);

		        // when button is clicked run code with anonmous inner class
		        btn.setOnAction(new EventHandler<ActionEvent>() {

		            //@Override
		            public void handle(ActionEvent e) {
		            	// set text color
		                actiontarget.setFill(Color.FIREBRICK);    
		                
		                // assign input values to object
		                v.setUsername(userTextField.getText());
		                v.setPassword(pwBox.getText());
		                
		                // run database method to check for user
		                d.loginUser(v);
		            
		                // if user is found
		                if(v.getAddress() != null)
		                {
		                	// tell user they can close window
		                	actiontarget.setText("You are logged in. Please exit the window");
		                	
		                	//open new window with logged in view
		                	Menu m = new Menu();
		                	m.loggedin();
		                }
		                else
		                {
		                	// if username is not found let user know to try again
		                	actiontarget.setText("Username and Password not found");
		                }
		                
		                
		                
		               
		            }
		        });

		        
		        // make the scene and show it
		        Scene scene = new Scene(grid, 300, 275);
		        secondStage.setScene(scene);
		        secondStage.show();
	}
	
	// method to get the users password if they forget it and answer
	// their security question correct
	public void retrievePassword(){
		
		/*
		 *  get user password
		 * 
		 * */
		
		//  create the stage
		Stage primaryStage = new Stage();
		
		primaryStage.setTitle("Retrieve Password");
	
		// create a button to retrueve password
		Button btn1 = new Button("Retrieve Password");
		
		// label for text field
		Label userName1 = new Label("User Name:");
	
		
		// make a test field for username
		TextField userTextField1 = new TextField();
	
		
		// make choice box for the security question the user signed up with
		ChoiceBox<String> securityQuestion = new ChoiceBox<>();
		securityQuestion.getItems().addAll("first pet's name?", "first car's make");

		
		// label and text field for answer
		Label answer = new Label("Security Question Answer:");
	
		
		TextField txtAnswer = new TextField();

		
		// text for error if they error
		final Text actiontarget1 = new Text();
	

		// create  vbox layout , scene and show it on the stage
		VBox layout = new VBox();
		layout.getChildren().addAll(userName1,userTextField1,securityQuestion,answer,txtAnswer,actiontarget1,btn1);
		
		
		Scene scene = new Scene(layout, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	
	
		
		
		
// when button is clicked run code to find password
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
			//@Override
			public void handle(ActionEvent e) {
				actiontarget1.setFill(Color.FIREBRICK);
				// get the values of user inputs
				String answer = txtAnswer.getText();
				v.setUsername(userTextField1.getText());
				v.setSecurity_question(securityQuestion.getValue());
				
				// run database method to check for password
				d.forgotPassword(v);
			
				System.out.println(txtAnswer.getText());
				System.out.println(v.getQuestion_answer() );
				System.out.println(securityQuestion.getValue());
				
				// if the answer from the database equals the imput from user show their password else tell them you can't find them in the DB
				if(v.getQuestion_answer().equalsIgnoreCase(txtAnswer.getText()) )
				{
					
					actiontarget1.setText("Your pass word is " + v.getPassword());
				}
				else
				{
					
					actiontarget1.setText("Username and Password not found");
				}
				
				
				
				
			}
		});
		
		

		}
}



