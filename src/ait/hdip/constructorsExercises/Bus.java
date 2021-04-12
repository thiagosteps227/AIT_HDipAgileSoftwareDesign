package ait.hdip.constructorsExercises;

public class Bus {

	private int numberOfSeats;
    private static int busCount;
	private Driver driver;
	private String make; 
	
	
	public Bus() {
		
	}
	
	public Bus(String make, int numberOfSeats, Driver driver) {
		this.make = make;
		this.numberOfSeats = numberOfSeats;
		this.driver= driver;
	}
	
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public static int getBusCount() {
		return busCount;
	}
	public String toString() {
		String driverName ="No driver assigned";
		if (driver != null) {
			driverName = driver.getName();
		}
		
		return ("Bus [Make="+make+", number of seats="+numberOfSeats+" Driver "+driverName+" ]");
	}
}

