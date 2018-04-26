package Backend;
import java.sql.*;


import flightApp.Customer;
import flightApp.VariableObject;

public class Database {

	
	Customer cust = null;



	
	public Database(VariableObject o){

		// call the set customer method
		setCust(o);

	}

	/**works*/
	public void signupCustomer(VariableObject o){
		
		/*String first_name,String last_name,String address,String zip,String username,String
		 password,String email,String ssn,String security_question,String question_answer*/
	
	// objects needed for connection
	Connection connection = null;
	PreparedStatement statement = null;
	int resultSet;
	
	
	/** nned to make sure username email ssn is not already in system*/



	try {

		// Establish a connection
		connection = getDriverConnection();
				System.out.println("Database connected");

		// Create a statement
		statement = connection.prepareStatement(Query.INSERT_CUSTOMER_INTO_PERSON_DATABASE);

		statement.setInt(1, 2);  // need to havee auto increment so we dont need variable
		statement.setString(2, o.getFirst_name());
		statement.setString(3, o.getLast_name());
		statement.setString(4, o.getAddress());
		statement.setString(5, o.getZip());
		statement.setString(6,o.getUsername());
		statement.setString(7,o.getPassword());
		statement.setString(8, o.getEmail());
		statement.setString(9, o.getSsn());
		statement.setString(10, o.getSecurity_question());
		statement.setString(11, o.getQuestion_answer());
		statement.setBoolean(12, false);
	



		// Execute a statement
		resultSet = statement.executeUpdate();
		
		System.out.println("User added");


	} catch (ClassNotFoundException e) {


		System.out.println(e.getMessage());
	} catch (SQLException e) {



		System.out.println(e.getMessage());
	}
	// Close the connection
	finally{
		try {
			connection.close();
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
	/**works*/	
	public void signupAdmin(VariableObject o){	
		
		// objects needed for connection
		Connection connection = null;
		PreparedStatement statement = null;
		int resultSet;
		
		
		/** nned to make sure username email ssn is not already in system*/



		try {
	

			// Establish a connection
			connection = getDriverConnection();
			System.out.println("Database connected");

			// Create a statement
			statement = connection.prepareStatement(Query.INSERT_ADMIN_INTO_PERSON_DATABASE);

			
			statement.setInt(1, 2);  // need to havee auto increment so we dont need variable
			statement.setString(2, o.getFirst_name());
			statement.setString(3, o.getLast_name());
			statement.setString(4, o.getAddress());
			statement.setString(5, o.getZip());
			statement.setString(6,o.getUsername());
			statement.setString(7,o.getPassword());
			statement.setString(8, o.getEmail());
			statement.setString(9, o.getSsn());
			statement.setString(10, o.getSecurity_question());
			statement.setString(11, o.getQuestion_answer());
			statement.setBoolean(12, true);
		
			/*statement.setString(1, o.getFirst_name());
			statement.setString(2, o.getLast_name());
			statement.setString(3, o.getAddress());
			statement.setString(4, o.getZip());
			statement.setString(5,o.getUsername());
			statement.setString(6,o.getPassword());
			statement.setString(7, o.getEmail());
			statement.setString(8, o.getSsn());
			statement.setString(9, o.getSecurity_question());
			statement.setString(10, o.getQuestion_answer());
		*/
		



			// Execute a statement
			resultSet = statement.executeUpdate();
			
			System.out.println("User added");


		} catch (ClassNotFoundException e) {

          
			System.out.println(e.getMessage());
		} catch (SQLException e) {



			System.out.println(e.getMessage());
		}
		// Close the connection
		finally{
			try {
				connection.close();
			} catch (SQLException e) {
				
				System.out.println(e.getMessage());
			}
		}
		
	}
	/**works*/	
	public void showAllUser(){
		// objects needed for connection
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet;



		try {
		
			// Establish a connection
			connection = getDriverConnection();
			System.out.println("Database connected");

			// Create a statement
			statement = connection.prepareStatement(Query.SELECT_ALL_FROM_PERSON);



			// Execute a statement
			resultSet = statement.executeQuery();
			
			while (resultSet.next())
			{
				/* original System.out.println("username: " +resultSet.getString(2) + " password: " +resultSet.getString(3)
				+ " Fname: " + resultSet.getString(4) + " Lname: " + resultSet.getString(5)
				+ " address" + ": " +resultSet.getString(6) + " zip: " + resultSet.getString(7)
				+ " email: " + resultSet.getString(8) + " ssn: " + resultSet.getString(9) 
				+ " Question: " + resultSet.getString(10)+ " answer: " +resultSet.getString(11) 
				+ " admin: " +resultSet.getBoolean(12));*/
				
				System.out.println("username: " +resultSet.getString(6) + " password: " +resultSet.getString(7)
				+ " Fname: " + resultSet.getString(2) + " Lname: " + resultSet.getString(3)
				+ " address" + ": " +resultSet.getString(4) + " zip: " + resultSet.getString(5)
				+ " email: " + resultSet.getString(8) + " ssn: " + resultSet.getString(9) 
				+ " Question: " + resultSet.getString(10)+ " answer: " +resultSet.getString(11) 
				+ " admin: " +resultSet.getBoolean(12));
			}


		} catch (ClassNotFoundException e) {


			System.out.println(e.getMessage());
		} catch (SQLException e) {



			System.out.println(e.getMessage());
		}
		// Close the connection
		finally{
			try {
				connection.close();
			} catch (SQLException e) {
				
				System.out.println(e.getMessage());
			}
		}
	}
			
	public void showAllFlights() {

		// objects needed for connection
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;



		try {
		

			// Establish a connection
			connection = getDriverConnection();
			System.out.println("Database connected");

			// Create a statement
			statement = connection.prepareStatement(Query.SELECT_ALL_FLIGHTS); 


			// Execute a statement
			resultSet = statement.executeQuery();

			// Iterate through the result and print the student names
			while (resultSet.next())
				System.out.println("Flight# : " +resultSet.getString(1) + "\tCustomer# " +
						resultSet.getString(2) + "\tDepart: " + resultSet.getString(3) + "\tDestination: " + resultSet.getString(4) );

		} catch (ClassNotFoundException e) {


			System.out.println(e.getMessage());
		} catch (SQLException e) {



			System.out.println(e.getMessage());
		}
		// Close the connection
		finally{
			try {
				connection.close();
			} catch (SQLException e) {
				
				System.out.println(e.getMessage());
			}
		}






		
	}
		
	public void addFlightToDB(VariableObject o){
		
		// objects needed for connection
		Connection connection = null;
		PreparedStatement statement = null;
		int resultSet;


		//if(o.isAdmin())
		//{
			try {


				// Establish a connection
				connection = getDriverConnection();
				System.out.println("Database connected");

				// Create a statement
				statement = connection.prepareStatement(Query.INSERT_FLIGHT_TO_DATABASE);

				statement.setString(1, o.getFlight_number());
				statement.setString(2, "1");
				statement.setInt(3,o.getNum_of_customers());
				statement.setString(4, o.getDeparted_city());
				statement.setString(5, o.getDestination());
				statement.setString(6, o.getDepart_time());
				statement.setString(7, o.getArrival_time());



				// Execute a statement
				resultSet = statement.executeUpdate();

				System.out.println("Flight added");



			} catch (ClassNotFoundException e) {


				System.out.println(e.getMessage());
			} catch (SQLException e) {



				System.out.println(e.getMessage());
			}	// Close the connection
			finally{
				try {
					connection.close();
				} catch (SQLException e) {

					System.out.println(e.getMessage());
				}
			}
		//}

	}

	public void deleteFlightDB(VariableObject o)
	{
		// objects needed for connection
				Connection connection = null;
				PreparedStatement statement = null;
				int resultSet;

				if( o.isAdmin())
				{

				try {
				
					// Establish a connection
					connection = getDriverConnection();
					System.out.println("Database connected");

					// Create a statement
					statement = connection.prepareStatement(Query.DELETE_FLIGHT_FROM_DATABASE);

					statement.setString(1,o.getFlight_vo().getFlight_number());
					statement.setString(2, o.getFlight_vo().getDeparted_city());
					statement.setString(3, o.getFlight_vo().getDestination());



					// Execute a statement
					resultSet = statement.executeUpdate();
					System.out.println("flight deleted");

				} catch (ClassNotFoundException e) {


					System.out.println(e.getMessage());
				} catch (SQLException e) {



					System.out.println(e.getMessage());
				}	// Close the connection
				finally{
					try {
						connection.close();
					} catch (SQLException e) {
						
						System.out.println(e.getMessage());
					}
				}
				}

	}


		
	public void addUserToFlightDB(VariableObject o){
		
		// objects needed for connection
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet;
		int set;
		int capacity = -1;
		int numberOfCustomers = -1;



		// get the number of customers in the flight
		try {
			
			// Establish a connection
			connection = getDriverConnection();
			System.out.println("Database connected");

			// Create a statement
			statement = connection.prepareStatement(Query.GET_NUMBER_OF_CUSTOMERS);

		
			statement.setString(1,o.getFlight_vo().getFlight_number()); 
			statement.setString(2, o.getFlight_vo().getDeparted_city());
			statement.setString(3, o.getFlight_vo().getDestination());



			// Execute a statement
			resultSet = statement.executeQuery();
			
			if(resultSet.next())
			{
			System.out.println("Row Found");
			numberOfCustomers = resultSet.getInt(1);
			capacity = resultSet.getInt(2);
			System.out.println(numberOfCustomers);
			System.out.println(capacity);
			
			}
			else
			{
				System.out.println("Row not Found");
			}


		} catch (ClassNotFoundException e) {


			System.out.println(e.getMessage());
		} catch (SQLException e) {



			System.out.println(e.getMessage());
		}
		finally{
			try {
				connection.close();
				statement = null;
			} catch (SQLException e) {
				
				System.out.println(e.getMessage());
			}
		}
		
		

		if(numberOfCustomers > -1 && capacity > -1 && numberOfCustomers < capacity)
		{
			try {
		
				// Establish a connection
				connection = getDriverConnection();
				System.out.println("Database connected");

				// Create a statement
				statement = connection.prepareStatement(Query.ADD_USER_TO_FLIGHT);

				statement.setInt(1, ++numberOfCustomers);
				statement.setString(2,o.getFlight_vo().getFlight_number()); 
				statement.setString(3, o.getFlight_vo().getDeparted_city());
				statement.setString(4, o.getFlight_vo().getDestination());




				// Execute a statement
				set = statement.executeUpdate();

				System.out.println("Customer added");
				System.out.println("New Number of customer " + numberOfCustomers);


			} catch (ClassNotFoundException e) {


				System.out.println(e.getMessage());
			} catch (SQLException e) {



				System.out.println(e.getMessage());
			}
			finally{
				try {
					connection.close();
				} catch (SQLException e) {

					System.out.println(e.getMessage());
				}
			}
		}
		else
		{
			System.out.println("Flight was not found");
		}
	}


	public void removeUserFromFlightDB(VariableObject o){

		// objects needed for connection
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet;
		int set;
		int capacity = -1;
		int numberOfCustomers = -1;



		// get the number of customers in the flight
		try {
		
			// Establish a connection
			connection = getDriverConnection();
			System.out.println("Database connected");

			// Create a statement
			statement = connection.prepareStatement(Query.GET_NUMBER_OF_CUSTOMERS);


			statement.setString(1,o.getFlight_vo().getFlight_number()); 
			statement.setString(2, o.getFlight_vo().getDeparted_city());
			statement.setString(3, o.getFlight_vo().getDestination());



			// Execute a statement
			resultSet = statement.executeQuery();

			if(resultSet.next())
			{
				System.out.println("Row Found");
				numberOfCustomers = resultSet.getInt(1);
				capacity = resultSet.getInt(2);
				System.out.println(numberOfCustomers);
				System.out.println(capacity);

			}
			else
			{
				System.out.println("Row not Found");
			}


		} catch (ClassNotFoundException e) {


			System.out.println(e.getMessage());
		} catch (SQLException e) {



			System.out.println(e.getMessage());
		}
		finally{
			try {
				connection.close();
				statement = null;
			} catch (SQLException e) {

				System.out.println(e.getMessage());
			}
		}



		if(numberOfCustomers > 0 && capacity > -1)
		{
			try {
		
				// Establish a connection
				connection = getDriverConnection();
				System.out.println("Database connected");

				// Create a statement
				statement = connection.prepareStatement(Query.REMOVE_USER_FROM_FLIGHT);

				statement.setInt(1, --numberOfCustomers);
				statement.setString(2,o.getFlight_vo().getFlight_number()); 
				statement.setString(3, o.getFlight_vo().getDeparted_city());
				statement.setString(4, o.getFlight_vo().getDestination());




				// Execute a statement
				set = statement.executeUpdate();

				System.out.println("Customer removed");
				System.out.println("New Number of customer " + numberOfCustomers);


			} catch (ClassNotFoundException e) {


				System.out.println(e.getMessage());
			} catch (SQLException e) {



				System.out.println(e.getMessage());
			}
			finally{
				try {
					connection.close();
				} catch (SQLException e) {

					System.out.println(e.getMessage());
				}
			}
		}
		else
		{
			System.out.println("Flight was not found");
		}
	}

	public void updateFlightDB(VariableObject o,int newFlightNum,String newDepartCity,String newDestinationCity)
	{
		
		// objects needed for connection
				Connection connection = null;
				PreparedStatement statement = null;
				int resultSet;
			
				
				try {
				

					// Establish a connection
					connection = getDriverConnection();
					System.out.println("Database connected");

					// Create a statement
					statement = connection.prepareStatement(Query.UPDATE_FLIGHT);

					statement.setInt(1,newFlightNum);
					statement.setString(2, newDepartCity);
					statement.setString(3, newDestinationCity);
					statement.setString(4,o.getFlight_vo().getFlight_number());
					statement.setString(5, o.getFlight_vo().getDeparted_city());
					statement.setString(6, o.getFlight_vo().getDestination());



					// Execute a statement
					resultSet = statement.executeUpdate();
					System.out.println("flight updated");

				} catch (ClassNotFoundException e) {


					System.out.println(e.getMessage());
				} catch (SQLException e) {



					System.out.println(e.getMessage());
				}	// Close the connection
				finally{
					try {
						connection.close();
					} catch (SQLException e) {
						
						System.out.println(e.getMessage());
					}
				}

	}


	public VariableObject login(VariableObject o)
	{
	
			  
			
			
			// objects need to make connection to jdbc
		VariableObject n = null;
			  Connection connection = null;
			  PreparedStatement statement = null;
			  ResultSet resultSet = null;
			
			  
			  
			  /*variable probably be removed*/
				String usernameDB = null,passwordDB = null,fname = null,lname = null,address = null,zip = null, email = null,
						ssn = null, securityQuestion = null,answer = null;
				Boolean admin = false;
			  
		
				/** add try catch */
			  
		    // Load the JDBC driver
		    try {
				
				// Establish a connection
				connection = getDriverConnection();
				
				System.out.println("Database connected");
				
				
				
				// Create a statement
				statement = connection.prepareStatement(Query.LOGIN_PERSON);
				
				statement.setString(1,o.getUsername());
				statement.setString(2,o.getPassword());
				
				// Execute a statement
				resultSet = statement.executeQuery();
				
				while (resultSet.next())
				{
					usernameDB = resultSet.getString(2);
					passwordDB  =resultSet.getString(3);
					fname  =resultSet.getString(5);
					lname = resultSet.getString(4);
					address  =resultSet.getString(6);
					zip = resultSet.getString(7);
					email  =resultSet.getString(8);
					ssn  =resultSet.getString(9);
					securityQuestion  =resultSet.getString(10);
					answer  =resultSet.getString(11);
				    admin  =resultSet.getBoolean(12);
				}
				
				System.out.println("UserName : " + usernameDB);
				System.out.println("Password : " +passwordDB);
				System.out.println("Name : " + lname + "," +fname);
				System.out.println("Address : " + address+ "," + zip);
				System.out.println("Email : " +email);
				System.out.println("SSN : " +ssn);
				System.out.println("Security Question : " +securityQuestion);
				System.out.println("Answer : " +answer);
				System.out.println("Admin : " +admin);
				
				n = new VariableObject(fname,lname,address,zip,usernameDB,passwordDB,email,ssn,securityQuestion,answer,admin);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		    
	
		    return n;
		    }
	
	
	public Customer getCust() {
		return cust;
	}


	public void setCust(VariableObject o) {
		this.cust = o.getCust_vo();
	}
	                                                                                                                                                           	
		    
		     
// method to check for drivers and start connection
	
	private Connection getDriverConnection() throws ClassNotFoundException, SQLException
	{
		Connection connection = null;
		
		Class.forName(Query.DRIVER);
		
		System.out.println("Driver loaded");
		
		// Establish a connection
		connection = DriverManager.getConnection
				(Query.DATABASE, Query.USERNAME,Query.PASSWORD );
		
	
		return connection;
	}
	
		     
}


		
	


