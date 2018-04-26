package flightApp;

import java.util.ArrayList;

public class Flight extends Plane {
	

	private int num_of_customers;      // number of customers on the flight
	private ArrayList<Customer> cust;  // arraylist to hold all the customers info
	private String departed_city;      // the city the plane leaves
	private String depart_time;        // the day and time the flight begins
	private String arrival_city;        // the arrival_city city
	private String arrival_time;       // the day and time the flight will end
	private int flight_number;      // the flights number
	private String departureDay;       // the day the flight starts
	private String arrivalDay;         // the day the flight ends
	private double price;              // the price of the flight// might need to use bigdecimal for rounding issue
	
	// no arg constructor to create a flight
	public Flight()
	{
		super(45);
		num_of_customers = 0;
		departed_city = "Atlanta";
		depart_time ="1200";
		arrival_city = "Flordia";
		arrival_time = "1300";
		flight_number = 0;
		price = 500.00;
		departureDay = "01/01/2018";       // the day the flight starts
		arrivalDay = "01/01/2018"; 
		
	}
	
	// constructor to create a flight
	public Flight(VariableObject o) {
		super(o.getMax_customers());
		this.num_of_customers = o.getNum_of_customers();
		this.cust = o.getCust();
		this.departed_city = o.getDeparted_city();
		this.arrival_city = o.getArrival_city();
		this.flight_number = o.getFlight_number();
		this.price = o.getPrice();
		this.departureDay = departureDay;      
		this.arrivalDay = arrivalDay; 
		
	}	
	public String getDepartureDay() {
		return departureDay;
	}

	public void setDepartureDay(String departureDay) {
		this.departureDay = departureDay;
	}

	public String getArrivalDay() {
		return arrivalDay;
	}

	public void setArrivalDay(String arrivalDay) {
		this.arrivalDay = arrivalDay;
	}

	public String getDepart_time() {
		return depart_time;
	}

	public void setDepart_time(String depart_time) {
		this.depart_time = depart_time;
	}

	public String getArrival_time() {
		return arrival_time;
	}

	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
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

	public String getArrival_city() {
		return arrival_city;
	}

	public void setArrival_city(String arrival_city) {
		this.arrival_city = arrival_city;
	}

	public int getFlight_number() {
		return flight_number;
	}

	public void setFlight_number(int flight_number) {
		this.flight_number = flight_number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	
	/*might be able to delete
	 * public void showAllFlights(){
		
		//  draw gui 
		
		// select all flight rows from database
		
		// show all flights in javafx
		
	}
	
	public void showUserFlights()
	{
		// find the user id
		
		// find all flight with user id
		
		// show selected flights to user with javafx
	}
	public void addFlightToUser(){
		
		// get user id
		
		// get the flight number
		
		// add flight number to customers flight arraylist
		
		// add flight number to customers flight database
		
		// show customer the list of their flight with javafx
	}
	
	public void removeFlightFromUser(){
		
		// get the customer id
		
		// get the flight number
		
		// remove flight number from customer arraylist
		
		// remove flight number from customers flight in database
		
		// tell customer the flight was removed and show updated javafx
		
	}*/
	

	
	

}
