package ait.hdip.kayakexercise;
import java.util.Scanner;

public class KayakRental {

	public static void main(String[] args) {
	int people = 0;
	double totalPrice = 0;
	double feeDue = 0;
	Object condition;
	do {	
		System.out.println("Welcome to AIT Kayak Rental Price");
		final double JUNIOR = 45.10;
		final double ADULT = 35.50;
		final double SENIOR = 21.10;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input your age --> ");
		int age = in.nextInt();
		
		if (age<  10) {
			System.out.println("You are too young to participate");
			return;
		}
		
		
		System.out.println("How many hours are you booking for?? (Min 1, Max3) --> ");
		int hours = in.nextInt();
		
		if (hours<1 || hours > 3) {
			System.out.print("Number of hours must be between 1 and 3");
			return;
		}
		
		
		
		System.out.println("What day of the week are you booking for? --> ");
		String weekDay = in.next().toLowerCase();
		
		int day = 0;
		if(weekDay.equals("mon")) {
			day = 1;
		}else if(weekDay.equals("tue")) {
			day = 2;
		} else if(weekDay.equals("wed")) {
			day = 3;
		} else if(weekDay.equals("thur")) {
			day = 4;
		} else if(weekDay.equals("fri")) {
			day = 5;
		} else if(weekDay.equals("sat")) {
			day = 6;
		} else if(weekDay.equals("mon")) {
			day = 6;
		}
			
		boolean weekend = false;
		switch (day) {
		case 6: 
			weekend = true;
			break;
		case 1:
			weekend=false;
			break;
		case 2:
			weekend=false;
			break;
		case 3:
			weekend=false;
			break;
		case 4:
			weekend=false;
			break;
		case 5:
			weekend=false;
			break;
		default: 
			System.out.print("Invalid data entry for day of week");
		}
		
		double feeHour = 0;
		String category = " ";
		if (age> 10 && age <=18 ) {
			category = "Junior";
			feeHour = JUNIOR;
		} else if (age> 18 && age <=59 ) {
			category = "Adult";
			feeHour = ADULT;
		} else if (age>= 60 ) {
			category = "Senior";
			feeHour = SENIOR;
		}
		
	    feeDue = hours * feeHour;
	
		if (weekend) {
			feeDue = feeDue - (feeDue*0.1);
		}
	    
	

			
			System.out.println("Category: "+ category);
			System.out.println("Number of hours: "+ hours);
			System.out.println(" Day of week: "+ weekDay);
			System.out.printf(" Fee due: %10.2f ", feeDue );
			System.out.println("\nDo you want to continue? (y/n)");
			condition = in.next();
			
			people = people + 1;
			
			totalPrice = totalPrice + feeDue;
			
		}while (condition.equals("y"));
	
		System.out.printf("Total price is: %10.2f ", totalPrice);
		System.out.println("\nYou are booking for "+ people +" people");
	
			
	} 
	 
}


