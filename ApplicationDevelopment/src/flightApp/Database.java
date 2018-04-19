package flightApp;
import java.sql.*;
import java.util.Scanner;

public class Database {

	
	Customer cust = null;



	public Database(){



	}
	public Database(Customer cust){

		this.cust = cust;

	}
	public Customer getCust() {
		return cust;
	}


	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public void showAllFlights() {

		// objects needed for connection
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;



		try {
			// Load the JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");

			// Establish a connection
			connection = DriverManager.getConnection
					("jdbc:mysql://localhost/final?autoReconnect=true&useSSL=false", "root", "");
			System.out.println("Database connected");

			// Create a statement
			statement = connection.prepareStatement("select * from demoflight "); 


			// Execute a statement
			resultSet = statement.executeQuery();

			// Iterate through the result and print the student names
			while (resultSet.next())
				System.out.println("flight# : " +resultSet.getString(1) + " cust# " +
						resultSet.getString(2) + " Depart: " + resultSet.getString(3) + " Destination:" + resultSet.getString(4) );

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
		
	public void addFlightToDB(int numberOfCustomers, String departCity,String destinationCity){
		
		// objects needed for connection
		Connection connection = null;
		PreparedStatement statement = null;
		int resultSet;



		try {
			// Load the JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");

			// Establish a connection
			connection = DriverManager.getConnection
					("jdbc:mysql://localhost/final?autoReconnect=true&useSSL=false", "root", "");
			System.out.println("Database connected");

			// Create a statement
			statement = connection.prepareStatement("insert into demoflight "
					+ "(numberofcustomers,startcity,destinationcity)"
					+ "values (?,?,?)");

			statement.setInt(1,numberOfCustomers);
			statement.setString(2, departCity);
			statement.setString(3, destinationCity);



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

	}

	public void deleteFlightDB(int flightNum,String departCity,String destinationCity)
	{
		// objects needed for connection
				Connection connection = null;
				PreparedStatement statement = null;
				int resultSet;



				try {
					// Load the JDBC driver
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver loaded");

					// Establish a connection
					connection = DriverManager.getConnection
							("jdbc:mysql://localhost/final?autoReconnect=true&useSSL=false", "root", "");
					System.out.println("Database connected");

					// Create a statement
					statement = connection.prepareStatement("delete from demoflight "
							+ "where flightnumber = ? and startcity = ? and destinationcity = ?");

					statement.setInt(1,flightNum);
					statement.setString(2, departCity);
					statement.setString(3, destinationCity);



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

	public void signupCustomer(String first_name,String last_name,String address,String zip,String username,String
		 password,String email,String ssn,String security_question,String question_answer){	
	
	// objects needed for connection
	Connection connection = null;
	PreparedStatement statement = null;
	int resultSet;
	
	
	/** nned to make sure username email ssn is not already in system*/



	try {
		// Load the JDBC driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");

		// Establish a connection
		connection = DriverManager.getConnection
				("jdbc:mysql://localhost/final?autoReconnect=true&useSSL=false", "root", "");
		System.out.println("Database connected");

		// Create a statement
		statement = connection.prepareStatement("insert into person "
				+ "(username,password,firstname,lastname,address,zip,email,ssn,securityquestion,questionanswer,admin)"
				+ "values (?,?,?,?,?,?,?,?,?,?,?)");

		statement.setString(1,username);
		statement.setString(2, password);
		statement.setString(3, first_name);
		statement.setString(4, last_name);
		statement.setString(5, address);
		statement.setString(6, zip);
		statement.setString(7, email);
		statement.setString(8, ssn);
		statement.setString(9, security_question);
		statement.setString(10, question_answer);
		statement.setBoolean(11, false);



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
		
	public void signupAdmin(String first_name,String last_name,String address,String zip,String username,String
			 password,String email,String ssn,String security_question,String question_answer){	
		
		// objects needed for connection
		Connection connection = null;
		PreparedStatement statement = null;
		int resultSet;
		
		
		/** nned to make sure username email ssn is not already in system*/



		try {
			// Load the JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");

			// Establish a connection
			connection = DriverManager.getConnection
					("jdbc:mysql://localhost/final?autoReconnect=true&useSSL=false", "root", "");
			System.out.println("Database connected");

			// Create a statement
			statement = connection.prepareStatement("insert into person "
					+ "(username,password,firstname,lastname,address,zip,email,ssn,securityquestion,questionanswer,admin)"
					+ "values (?,?,?,?,?,?,?,?,?,?,?)");

			statement.setString(1,username);
			statement.setString(2, password);
			statement.setString(3, first_name);
			statement.setString(4, last_name);
			statement.setString(5, address);
			statement.setString(6, zip);
			statement.setString(7, email);
			statement.setString(8, ssn);
			statement.setString(9, security_question);
			statement.setString(10, question_answer);
			statement.setBoolean(11, true);



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
			
	public void showAllUser(){
		// objects needed for connection
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet;



		try {
			// Load the JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");

			// Establish a connection
			connection = DriverManager.getConnection
					("jdbc:mysql://localhost/final?autoReconnect=true&useSSL=false", "root", "");
			System.out.println("Database connected");

			// Create a statement
			statement = connection.prepareStatement("select * from person ");



			// Execute a statement
			resultSet = statement.executeQuery();
			
			while (resultSet.next())
			{
				System.out.println("username: " +resultSet.getString(2) + " password: " +resultSet.getString(3)
				+ " Fname: " + resultSet.getString(4) + " Lname: " + resultSet.getString(5)
				+ " address" + ": " +resultSet.getString(6) + " zip: " + resultSet.getString(7)
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
			
		
	public void addUserToFlightDB(int flightNumber, String departCity,String destinationCity){
		
		// objects needed for connection
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet;
		int set;
		int capacity = -1;
		int numberOfCustomers = -1;



		// get the number of customers in the flight
		try {
			// Load the JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");

			// Establish a connection
			connection = DriverManager.getConnection
					("jdbc:mysql://localhost/final?autoReconnect=true&useSSL=false", "root", "");
			System.out.println("Database connected");

			// Create a statement
			statement = connection.prepareStatement("select numberofcustomers, capacity from demoflight"
					+ " where flightnumber = ? and startcity = ? and destinationcity =?  ");

		
			statement.setInt(1,flightNumber); 
			statement.setString(2, departCity);
			statement.setString(3, destinationCity);



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
				// Load the JDBC driver
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Driver loaded");

				// Establish a connection
				connection = DriverManager.getConnection
						("jdbc:mysql://localhost/final?autoReconnect=true&useSSL=false", "root", "");
				System.out.println("Database connected");

				// Create a statement
				statement = connection.prepareStatement("update demoflight set numberofcustomers = ?"
						+ " where flightnumber = ? and startcity = ? and destinationcity =?  ");

				statement.setInt(1, ++numberOfCustomers);
				statement.setInt(2,flightNumber); 
				statement.setString(3, departCity);
				statement.setString(4, destinationCity);




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


	public void removeUserFromFlightDB(int flightNumber, String departCity,String destinationCity){

		// objects needed for connection
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet;
		int set;
		int capacity = -1;
		int numberOfCustomers = -1;



		// get the number of customers in the flight
		try {
			// Load the JDBC driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");

			// Establish a connection
			connection = DriverManager.getConnection
					("jdbc:mysql://localhost/final?autoReconnect=true&useSSL=false", "root", "");
			System.out.println("Database connected");

			// Create a statement
			statement = connection.prepareStatement("select numberofcustomers, capacity from demoflight"
					+ " where flightnumber = ? and startcity = ? and destinationcity =?  ");


			statement.setInt(1,flightNumber); 
			statement.setString(2, departCity);
			statement.setString(3, destinationCity);



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
				// Load the JDBC driver
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Driver loaded");

				// Establish a connection
				connection = DriverManager.getConnection
						("jdbc:mysql://localhost/final?autoReconnect=true&useSSL=false", "root", "");
				System.out.println("Database connected");

				// Create a statement
				statement = connection.prepareStatement("update demoflight set numberofcustomers = ?"
						+ " where flightnumber = ? and startcity = ? and destinationcity =?  ");

				statement.setInt(1, --numberOfCustomers);
				statement.setInt(2,flightNumber); 
				statement.setString(3, departCity);
				statement.setString(4, destinationCity);




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

	public void updateFlightDB(int flightNum,String departCity,String destinationCity,	int newFlightNum,String newDepartCity,String newDestinationCity)
	{
		
		// objects needed for connection
				Connection connection = null;
				PreparedStatement statement = null;
				int resultSet;
			
				
				try {
					// Load the JDBC driver
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("Driver loaded");

					// Establish a connection
					connection = DriverManager.getConnection
							("jdbc:mysql://localhost/final?autoReconnect=true&useSSL=false", "root", "");
					System.out.println("Database connected");

					// Create a statement
					statement = connection.prepareStatement("update  demoflight set flightnumber = ? ,startcity = ? ,destinationcity = ? "
							+ "where flightnumber = ? and startcity = ? and destinationcity = ?");

					statement.setInt(1,newFlightNum);
					statement.setString(2, newDepartCity);
					statement.setString(3, newDestinationCity);
					statement.setInt(4,flightNum);
					statement.setString(5, departCity);
					statement.setString(6, destinationCity);



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


	public Customer login(String username, String password)
	{
	
			  
			
			
			// objects need to make connection to jdbc
			  Customer cust = null;
			  Connection connection = null;
			  PreparedStatement statement = null;
			  ResultSet resultSet = null;
			  Scanner scan = new Scanner(System.in);
			  
			  
			  /*variable probably be removed*/
				String usernameDB = null,passwordDB = null,fname = null,lname = null,address = null,zip = null, email = null,
						ssn = null, securityQuestion = null,answer = null;
				Boolean admin = false;
			  
		
				/** add try catch */
			  
		    // Load the JDBC driver
		    try {
				Class.forName("com.mysql.jdbc.Driver");
				
				System.out.println("Driver loaded");
				
				// Establish a connection
				connection = DriverManager.getConnection
						("jdbc:mysql://localhost/final?autoReconnect=true&useSSL=false", "root", "");
				
				System.out.println("Database connected");
				
				
				
				// Create a statement
				statement = connection.prepareStatement("select * from person where username = ? and password = ? ");
				
				statement.setString(1,username);
				statement.setString(2,password);
				
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
				
				cust = new Customer(fname,lname,address,zip,usernameDB,passwordDB,email,ssn,securityQuestion,answer,admin);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		    
	
		    return cust;
		    }
	
		    
		     
		     
}
		     
		    

		
	


