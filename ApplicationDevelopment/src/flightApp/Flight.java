package flightApp;

import java.util.ArrayList;

public class Flight {
	
	private int max_customers;
	private int num_of_customers;
	private ArrayList<Customer> cust;
	private String departed_city;
	//private Date depart_time;
	private String destination;
	//private Date arrival_time;
	private String flight_number;
	private double price;  // might need to use bigdecimal for rounding issue
	
	public Flight()
	{
		max_customers = 45;
		num_of_customers = 0;
		departed_city = "Atlanta";
		// depart time
		destination = "Flordia";
		// arrvial time
		flight_number = "00001";
		price = 500.00;
		
	}
	
	public void showAllFlights(){
		
	}
	
	public void showUserFlights()
	{
		
	}
	public void addFlightToUser(){
		
	}
	
	public void removeFlightFromUser(){
		
	}
	
	public void retrievePassword(){
		
	}
	
	

}
