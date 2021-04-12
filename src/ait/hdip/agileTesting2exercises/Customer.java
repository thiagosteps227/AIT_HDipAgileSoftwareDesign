package ait.hdip.agileTesting2exercises;
/**
 * Class that stores the following
 * 
 * Customer Name:
 * Customer PPS:
 * Customer Email:
 * Customer Age:
 */
public class Customer {
	
	// Customer Name
	private String name;
	
	// Customer Pps Number
	private int Pps;
		
	// Customer Email
	private String email;
	
	// Customer Age
	private int age;	
	
	
	/**
	 * Constructor that creates Customer object 
	 * 
	 * @param name name of Customer
	 * @param Pps numeric Pps of Customer
	 * @param email email of Customer
	 * @param age age of Customer
	 */
	public Customer(String name, int Pps, String email, int age) {
		
		if (name==null)
			throw new IllegalArgumentException("Name cannot be null");
		
		if (email==null)
			throw new IllegalArgumentException("Email cannot be null");
		
		if (name.trim().length()==0)
			throw new IllegalArgumentException("Name cannot be empty");
		
		if (Pps<=0)
			throw new IllegalArgumentException("Not positiove Ppss are not allowed");
		
		if (age<18)
			throw new IllegalArgumentException("Customer mush be at least 18 year old");
				
		this.name = name;
		this.Pps = Pps;				
		this.email = email;
		
		this.age = age;
	}
	
	public Customer() {
		
	}
	
	/**
	 * Gets name of Customer
	 * 
	 * @return name Customer name
	 */
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (name==null) {
			throw new IllegalArgumentException("Name cannot be null");
		} 
		this.name = name;
	}
	
	
	/**
	 * Gets PPS of Customer 
	 *  
	 * @return Customer PPS number
	 */
	public int getPps() {
		return Pps;		
	}
	
	public void setPps(int Pps) {
		if (Pps <= 0) {
			throw new IllegalArgumentException("Not positiove Ppss are not allowed");
		}
		this.Pps = Pps;
	}
			
	/**
	 * Gets email of Customer
	 * 
	 * @return Customer Email
	 */
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		if (email==null) {
			throw new IllegalArgumentException("Email cannot be null");
		}
		this.email = email;
	}
	
	/**
	 * Gets age of Customer
	 * 
	 * @return Customer age
	 */
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (age < 18) {
			throw new IllegalArgumentException("Customer mush be at least 18 year old");
		}
		this.age = age;
	}
}
