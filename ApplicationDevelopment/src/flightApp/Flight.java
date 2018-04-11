package flightApp;

import java.util.ArrayList;

public class Flight extends Plane {
	

	private int num_of_customers;      // number of customers on the flight
	private ArrayList<Customer> cust;  // arraylist to hold all the customers info
	private String departed_city;      // the city the plane leaves
	//private Date depart_time;        // the day and time the flight begins
	private String destination;        // the destination city
	//private Date arrival_time;       // the day and time the flight will end
	private String flight_number;      // the flights number
	private double price;              // the price of the flight// might need to use bigdecimal for rounding issue
	
	// no arg constructor to create a flight
	public Flight()
	{
		super(45);
		num_of_customers = 0;
		departed_city = "Atlanta";
		// depart time
		destination = "Flordia";
		// arrvial time
		flight_number = "00001";
		price = 500.00;
		
	}
	
	// constructor to create a flight
	public Flight(int max_customers, int num_of_customers, ArrayList<Customer> cust, String departed_city,
			String destination, String flight_number, double price) {
		super(max_customers);
		this.num_of_customers = num_of_customers;
		this.cust = cust;
		this.departed_city = departed_city;
		this.destination = destination;
		this.flight_number = flight_number;
		this.price = price;
	}
	
	public void showAllFlights(){
		
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
		
	}
	

	
	

}
