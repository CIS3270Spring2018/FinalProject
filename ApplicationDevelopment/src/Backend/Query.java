package Backend;
/*
 * Class to hold all the sql statements
 */
public class Query {
	
	
	
	public static final String DRIVER = "com.mysql.jdbc.Driver";

	public static final String DATABASE ="jdbc:mysql://localhost/flight_appliction?autoReconnect=true&useSSL=false";
	
	public static final String USERNAME ="root";
	
	public static final String PASSWORD = "";
	


	//////////////////////////////////////////////////////////////
	// Person
	/**works*/
	public static final String INSERT_CUSTOMER_INTO_PERSON_DATABASE ="insert into user "
			+ "(FirstName,LastName,Address,state,zip,username,password,email,ssn,SecurityQuestion,SecurityAnswer,Admin)"
			+ "values (?,?,?,?,?,?,?,?,?,?,?,?)";
	/**works*/
	public static final String INSERT_ADMIN_INTO_PERSON_DATABASE ="insert into user "
			+ /*"(FirstName,LastName,Address,Zip,UserName,PassWord,Email,SSN,SecurityQuestion,SecurityAnswer,Admin)"
			+ "values (?,?,?,?,?,?,?,?,?,?,?)";*/
	
	"(FirstName,LastName,Address,state,zip,username,password,email,ssn,SecurityQuestion,SecurityAnswer,Admin)"
	+ "values (?,?,?,?,?,?,?,?,?,?,?,?)";
	/**works*/
	public static final String SELECT_ALL_FROM_PERSON = "select * from user ";
	

	///////////////////////////////////////////////////////////////////////////
	//FLight
	/**works*/
	public static final String SELECT_ALL_FLIGHTS = "select * from flight ";
	
   /**works*/
	public static final String INSERT_FLIGHT_TO_DATABASE = "insert into flight "
			+ "(DepartureCity,ArrivalCity,DepartureDay,ArrivalDay,DepartureTime,ArrivalTime)"
			+ "values (?,?,?,?,?,?)";
	
	/**works*/
	public static final String CHECK_IF_FLIGHT_IS_ALREADY_IN_DATABASE ="select * from flight where "
	+ " DepartureCity = ? AND ArrivalCity = ? AND DepartureDay = ? AND "
	+ " ArrivalDay=? AND DepartureTime=? AND ArrivalTime =? ";
	
	/**works*/
	public static final String GET_NUMBER_OF_CUSTOMERS  = "select numOfCustomers, maxCapacity from flight"
			+ " where flightnum = ? and DepartureCity = ? and ArrivalCity =?  ";
	
	/**works*/
	public static final String CHECK_IF_USER_FLIGHT_IS_ALREADY_IN_DATABASE ="select * from userflight where "
	+ " userid = ? AND flightnum = ? ";


	
	/**********************************/
	/**works*/
	public static final String ADD_USER_TO_FLIGHT = "update flight set numofCustomers = ?"
			+ " where flightnum = ? and DepartureCity = ? and ArrivalCity =?  ";
	/**works*/
	public static final String ADD_USER_AND_FLIGHT_TO_USERFLIGHT = "insert into userflight (userid, flightNum)"
			+ " value(?,?)  ";
	
	
	
	
	
	/***********************************************/
	/**works*/
	public static final String DELETE_FLIGHT_FROM_DATABASE = "delete from flight "
			+ "where flightNum = ? AND DepartureCity = ? AND ArrivalCity = ? AND DepartureDay = ? AND "
	+ " ArrivalDay=? AND DepartureTime=? AND ArrivalTime =? ";
	/**works*/
	public static final String DELETE_FLIGHT_FROM_USERFLIGHT_DATABASE = "delete from userflight "
			+ "where flightNum = ? ";
	/**works*/
	public static final String DELETE_USER_AND_FLIGHT_FROM_USERFLIGHT_DATABASE = "delete from userflight "
			+ "where userid = ? AND flightNum = ? ";
	/**work*/
	public static final String REMOVE_USER_FROM_FLIGHT = "update flight set numOfCustomers = ?"
			+ " where flightnum = ? and DepartureCity = ? and ArrivalCity =?  ";
	
	
	
	
	public static final String UPDATE_FLIGHT = "update  flight set flightnumber = ? ,startcity = ? ,destinationcity = ? "
			+ "where flightnumber = ? and startcity = ? and destinationcity = ?";
	
	public static final String LOGIN_PERSON = "select * from user where username = ? and password = ? ";
	
	
	public static final String SHOW_SECURITY_QUESTION_AND_GET_ANSWER = "SELECT * from user "
			+ "where username = ? AND securityQuestion = ? AND securityAnswer = ? ";
	
	
	
}
