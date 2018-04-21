package flightApp;

import java.util.ArrayList;

public class VariableObject {
	private int max_customers;         // max number of customers
	private int num_of_customers;      // number of customers on the flight
	private ArrayList<Customer> cust;  // arraylist to hold all the customers info
	private String departed_city;      // the city the plane leaves
	//private Date depart_time;        // the day and time the flight begins
	private String destination;        // the destination city
	//private Date arrival_time;       // the day and time the flight will end
	private String flight_number;      // the flights number
	private double price;              // the price of the flight// might need to use bigdecimal for rounding issue
	
	
	public VariableObject(String first_name, String last_name, String address, String zip, String username,
			String password, String email, String ssn, String security_question, String question_answer,
			boolean admin) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.zip = zip;
		this.username = username;
		this.password = password;
		this.email = email;
		this.ssn = ssn;
		this.security_question = security_question;
		this.question_answer = question_answer;
		this.admin = admin;
	}
	private String first_name;  // hold the persons first name
	private String last_name;   // hold the persons last name
	//private Date dob; // might want to use new date format local date of
	private String address;     // hold the persons address
	private String zip;         // hold the person zip code
	private String username;    // hold the persons username 
	private String password;     // hold the persons password
	private String email;         // hold the persons email
	private String ssn;           // hold the persons social security number
	private String security_question;   // hold the persons security question
	private String question_answer;   // hold the persons security questions answer	
	private boolean admin;
	private Customer cust_vo;
	private Flight flight_vo;
	
	
	public VariableObject() {
		// TODO Auto-generated constructor stub
	}
	

	public int getMax_customers() {
		return max_customers;
	}
	public void setMax_customers(int max_customers) {
		this.max_customers = max_customers;
	}
	
	// getters + setters
	public Customer getCust_vo() {
		return cust_vo;
	}
	public void setCust_vo(Customer cust_vo) {
		this.cust_vo = cust_vo;
	}
	public Flight getFlight_vo() {
		return flight_vo;
	}
	public void setFlight_vo(Flight flight_vo) {
		this.flight_vo = flight_vo;
	}
	public int getNum_of_customers() {
		return num_of_customers;
	}
	public void setNum_of_customers(int num_of_customers) {
		this.num_of_customers = num_of_customers;
	}
	public ArrayList<Customer> getCust() {
		return cust;
	}
	public void setCust(ArrayList<Customer> cust) {
		this.cust = cust;
	}
	public String getDeparted_city() {
		return departed_city;
	}
	public void setDeparted_city(String departed_city) {
		this.departed_city = departed_city;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getFlight_number() {
		return flight_number;
	}
	public void setFlight_number(String flight_number) {
		this.flight_number = flight_number;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSecurity_question() {
		return security_question;
	}
	public void setSecurity_question(String security_question) {
		this.security_question = security_question;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public String getQuestion_answer() {
		return question_answer;
	}
	public void setQuestion_answer(String question_answer) {
		this.question_answer = question_answer;
	}

}
