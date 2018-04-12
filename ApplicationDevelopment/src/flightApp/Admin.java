package flightApp;


public class Admin extends Customer {
	
	
	
	 public Admin(String first_name,String last_name,String address,String zip,String username,
			 String password,String email,String ssn,String security_question,String sq_answer){
		 
		 
		 super(first_name,last_name,address,zip,username,password,email,ssn,security_question,sq_answer);
		 
		 
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
