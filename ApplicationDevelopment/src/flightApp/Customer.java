package flightApp;

import java.util.ArrayList;

public class Customer implements Person {
 private String first_name;
 private String last_name;
 //private Date dob; // might want to use new date format local date of
 private String address;
 private String zip;
 private String username;
 private String password;
 private String email;
 private String ssn;
 private String security_question;
 private ArrayList<Flight> bookedFlights;
 
 public Customer(String first_name,String last_name, Date dob,String address,String zip,String username,
		 String password,String email,String ssn,String security_question){
	 
	 this.first_name = first_name;
	 this.last_name = last_name;
	// this.dob = dob;
	 this.address = address;
	 this.zip = zip;
	 this.username = username;
	 this.password = password;
	 this.email = email;
	 this.ssn = ssn;
	 this.security_question = security_question;
	 
	 
 }
 
}
