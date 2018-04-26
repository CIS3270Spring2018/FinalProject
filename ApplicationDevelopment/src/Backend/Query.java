package Backend;
/*
 * Class to hold all the sql statements
 */
public class Query {
	
	
	
	public static final String DRIVER = "com.mysql.jdbc.Driver";

	public static final String DATABASE ="jdbc:mysql://localhost/data?autoReconnect=true&useSSL=false";
	
	public static final String USERNAME ="root";
	
	public static final String PASSWORD = "";
	


	//////////////////////////////////////////////////////////////
	// Person
	/**works*/
	public static final String INSERT_CUSTOMER_INTO_PERSON_DATABASE ="insert into person "
			+ "(PersonId,FirstName,LastName,Address,Zip,UserName,PassWord,Email,SSN,SecurityQuestion,SecurityAnswer,Admin)"
			+ "values (?,?,?,?,?,?,?,?,?,?,?,?)";
	/**works*/
	public static final String INSERT_ADMIN_INTO_PERSON_DATABASE ="insert into person "
			+ /*"(FirstName,LastName,Address,Zip,UserName,PassWord,Email,SSN,SecurityQuestion,SecurityAnswer,Admin)"
			+ "values (?,?,?,?,?,?,?,?,?,?,?)";*/
	
	"(PersonId,FirstName,LastName,Address,Zip,UserName,PassWord,Email,SSN,SecurityQuestion,SecurityAnswer,Admin)"
	+ "values (?,?,?,?,?,?,?,?,?,?,?,?)";
	/**works*/
	public static final String SELECT_ALL_FROM_PERSON = "select * from person ";
	
	
	///////////////////////////////////////////////////////////////////////////
	//FLight
	
	public static final String GET_NUMBER_OF_CUSTOMERS  = "select numberofcustomers, capacity from demoflight"
			+ " where flightnumber = ? and startcity = ? and destinationcity =?  ";
	
	public static final String SELECT_ALL_FLIGHTS = "select * from flight ";
	
	public static final String INSERT_FLIGHT_TO_DATABASE = "insert into flight "
			+ "(FlightNum,PlaneNum,NumOfCustomers,Departedcity,Destination,DepartureTime,ArrivalTime)"
			+ "values (?,?,?,?,?,?,?)";
	
	public static final String DELETE_FLIGHT_FROM_DATABASE = "delete from flight "
			+ "where flightnumber = ? and startcity = ? and destinationcity = ?";
	
	public static final String ADD_USER_TO_FLIGHT = "update flight set numberofcustomers = ?"
			+ " where flightnumber = ? and startcity = ? and destinationcity =?  ";
	
	public static final String REMOVE_USER_FROM_FLIGHT = "update flight set numberofcustomers = ?"
			+ " where flightnumber = ? and startcity = ? and destinationcity =?  ";
	
	public static final String UPDATE_FLIGHT = "update  flight set flightnumber = ? ,startcity = ? ,destinationcity = ? "
			+ "where flightnumber = ? and startcity = ? and destinationcity = ?";
	
	public static final String LOGIN_PERSON = "select * from person where username = ? and password = ? ";
	
}
