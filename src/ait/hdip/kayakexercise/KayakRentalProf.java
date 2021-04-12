package ait.hdip.kayakexercise;

import java.util.Scanner;

public class KayakRentalProf {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		final double JUNIOR_HOUR_RATE = 45.10;
		final double ADULT_HOUR_RATE = 35.50;
		final double SENIOR_HOUR_RATE = 21.10;		
		double fee = 0;
		double fPrice = 0;
		int count = 0;
		String category = "";
		double discount = 0.1;		
		System.out.println("Welcome to AIT Kayak Rental Price");
		String choice = "y";
		while(choice.equalsIgnoreCase("y"))
		{
			System.out.println("Input your age --> ");
			int age = sc.nextInt();

			if(age<10) {
				System.out.println("You are too young to participate. ");		
				return;

			}
			else if(age>=10 && age <=18)
			{
				category = "Junior";
			}
			else if(age>=18 && age <=59)
			{
				category = "Adult";
			}
			else
				category = "Senior";

			System.out.println("How many hours are you booking for?? (Min 1, Max 3) --> ");
			int hours = sc.nextInt();
			if (hours < 1 || hours > 3) {
				System.out.println("Number of hours must be between 1 and 3 ");		
				return;
			}
			System.out.println("What day of the week are you booking for?--> ");
			String day = sc.next();
			day = day.toUpperCase();

			switch (day) {
			case "MON":
				if (category.equals("Junior")){
					fee = JUNIOR_HOUR_RATE * hours;
				} else if (category.equals("Adult")) {
					fee = ADULT_HOUR_RATE * hours;
				} else if (category.equals("Senior")) {
					fee = SENIOR_HOUR_RATE * hours;
				}
				break;
			case "TUE":
				if (category.equals("Junior")){
					fee = JUNIOR_HOUR_RATE * hours;
				} else if (category.equals("Adult")) {
					fee = ADULT_HOUR_RATE * hours;
				} else if (category.equals("Senior")) {
					fee = SENIOR_HOUR_RATE * hours;
				}
				break;
			case "WED":
				if (category.equals("Junior")){
					fee = JUNIOR_HOUR_RATE * hours;
				} else if (category.equals("Adult")) {
					fee = ADULT_HOUR_RATE * hours;
				} else if (category.equals("Senior")) {
					fee = SENIOR_HOUR_RATE * hours;
				}
				break;
			case "THUR":
				if (category.equals("Junior")){
					fee = JUNIOR_HOUR_RATE * hours;
				} else if (category.equals("Adult")) {
					fee = ADULT_HOUR_RATE * hours;
				} else if (category.equals("Senior")) {
					fee = SENIOR_HOUR_RATE * hours;
				}
				break;
			case "FRI":
				if (category.equals("Junior")){
					fee = JUNIOR_HOUR_RATE * hours;
				} else if (category.equals("Adult")) {
					fee = ADULT_HOUR_RATE * hours;
				} else if (category.equals("Senior")) {
					fee = SENIOR_HOUR_RATE * hours;
				}
				break;
			case "SAT":
			case "SUN":
				if (category.equals("Junior")) {
					fee = JUNIOR_HOUR_RATE-(JUNIOR_HOUR_RATE * discount) * hours;
				} else if (category.equals("Adult")) {
					fee = ADULT_HOUR_RATE-(ADULT_HOUR_RATE * discount) * hours;
				} else if (category.equals("Senior")) {
					fee = SENIOR_HOUR_RATE-(SENIOR_HOUR_RATE * discount) * hours;
				}
				break;
			default:
				System.out.println("Invalid data entry for day of week");
				return;
			}
			fPrice=fPrice+fee;
			count++;

			System.out.println("Category: " + category + "\n" + "Number of hours: " + hours + "\n "
					+ "Day of week: " + day + "\n " + "Fee due: " + fee);

			System.out.println("Do you want to continue?(y/n)");
			choice = sc.next();		

		}
		System.out.println("Total price is " + fPrice);
		System.out.println("You are booking for " + count + " people");



	}
}
