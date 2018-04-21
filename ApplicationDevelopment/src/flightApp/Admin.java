package flightApp;

import java.sql.Driver;
import java.sql.DriverManager;
public class Admin extends Customer {
	
	
	
	 public Admin(VariableObject o){
		 
		 
		 super(o);
		 
		 
	 }
	 
	 public void addFlight()
	 {
		 // create a new flight with flight info
		 
		 // add the new flight to the flight database
		 
		 // show the flight was successfully added or an error
		 
	 }
	 public void deleteFlight()
	 {
		// select the flight 
		 
		
		 
		 // find the flight in the customer flight database
		 
		 // remove flight from all customers arraylist and the database
		 
		 // remove flight from customer flight database
		 
		 // remove flight from flights
	 }
	 public void updateFlight()
	 {
		// select the flight and input changes the flight info
		 
		 // get the original date
		
		 // check which data is changed
		 
		 // if variable is null use original
		 
		// update the row in the database with the changed values
		 
		 // show with javafx that the table has been changed or an error
		 
		
	 }
	 public void deleteUser()
	 {
		 // get the user id or name
		 
		 // select the user and delete them from the table
	 }

}
