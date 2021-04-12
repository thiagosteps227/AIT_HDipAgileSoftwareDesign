package ait.hdip.constructorsExercises;

public class BusDepot {

	public static void main(String[] args) {
		
		Driver driverOne = new Driver();
		
		driverOne.setName("John");
		driverOne.setPhoneNumber(110);
		
		Bus busOne = new Bus();
		busOne.setMake("Volvo");
		busOne.setNumberOfSeats(45);
		busOne.setDriver(driverOne);
		System.out.println(busOne.toString());
		
		Bus busTwo = new Bus();
		busTwo.setMake("Mercedes");
		busTwo.setNumberOfSeats(50);
		System.out.println(busTwo.toString());
		
		Driver driverTwo = new Driver("Tom",999);
		Bus busThree = new Bus("Ford",20,driverTwo);
		System.out.println(busThree.toString());

	}

}
