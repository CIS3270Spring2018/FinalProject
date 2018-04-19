package flightApp;



public abstract class Person {
	


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
	private String sq_answer;   // hold the persons security questions answer	
	private boolean admin;
	
	
	// constructor with all the information needed to make a customer
	 public Person(String first_name, String last_name, String address, String zip, String username,
			String password, String email, String ssn, String security_question,String sq_answer,boolean admin) {
	
		 this.first_name = first_name;
		 this.last_name = last_name;
		 this.address = address;
		 this.zip = zip;
		 this.username = username;
		 this.password = password;
		 this.email = email;
		 this.ssn = ssn;
		 this.security_question = security_question;
		 this.admin = admin;
	}

	abstract  String toString(Object o);
	
	 public abstract boolean equals(Object o);
	 
	 
	 
	 // getter and setters for instance variables
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

		public String getSq_answer() {
			return sq_answer;
		}

		public void setSq_answer(String sq_answer) {
			this.sq_answer = sq_answer;
		}
	 

}
