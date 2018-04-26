package flightApp;

import java.util.ArrayList;


public class Customer extends Person {




private ArrayList<Flight> bookedFlights;
 
 public Customer(VariableObject o){
	 
	 
	 super(o);
	 

 }
 
 
 
@Override
 public String toString(Object o){
	 return "The customer is " + getFirst_name()+ " " + getLast_name();
	 
 }
 
 

 public boolean equals(Object o){
	 
	 if(o instanceof VariableObject)
	 {
		 VariableObject vo = (VariableObject) o;
		 
		 if(vo.getFirst_name() == getFirst_name() && 
				 vo.getLast_name() == getLast_name() && 
				 vo.getSsn() == getSsn())
		 {
			 return true;
		 }
	 }
	
	 return false;
 }
 
 public ArrayList<Flight> getBookedFlights() {
		return bookedFlights;
	}


	public void setBookedFlights(VariableObject o) {
		
		// get the customer id 
		
		// select all the flight for customer
		
		// put flights into booked flights arraylist
		this.bookedFlights.add(o.getFlight_vo());
	
	}
	
	
	public void purchaseFlight(int flight_number){
		// get the flight number
		
		// get the customer id
		
		// add flight to customer array
		
		// add flight to customer flight database
		
		// show customer their flight list with javafx
		
		
		
	}
	
	public void cancelFlight(int flight_number){
		// get the flight number
		
		// get the customer id
		
		// remove flight to customer array
		
		// remove flight to customer flight database
		
		// show customer their flight list with javafx
		
		
		
	}
	
	public void searchFlight(int flight_number){
		// get the flight info
		
		// check if there is a matching flight
		
		// if there is a flight show in javafx
		
		// if there is no flight show we dont have a flight scheduled
		
		
		
	}
	
	public void retrievePassword(){
		
		// get customers id
		
		// select password from customer where id = customerid
		
		// display customer password with javafx
		
		/*  code without db*/
		System.out.println("The password for" + getUsername() + ": " + getPassword());
		
	}

 
 
 
}
