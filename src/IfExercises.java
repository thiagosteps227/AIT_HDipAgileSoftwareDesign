import java.util.Scanner;

public class IfExercises {

	public static void main(String[] args) {
		//ifMonth();
		//ifLargerOfTwoNumbers();
		//ifGrade();
		//temperature();
		//ifLargest();
		ternaryOperator();
	}
	
	public static void ifMonth() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter month (1-12): ");
		int month = in.nextInt();
		if (month == 1 ) {
			System.out.println("January");
		} else if (month == 2) {
			System.out.print("February");;
		} else if (month == 3) {
			System.out.print("March");;
		} else if (month == 4) {
			System.out.print("April");;
		} else if (month == 5) {
			System.out.print("May");;
		} else if (month == 6) {
			System.out.print("June");;
		} else if (month == 7) {
			System.out.print("July");;
		} else if (month == 8) {
			System.out.print("August");;
		} else if (month == 9) {
			System.out.print("September");;
		} else if (month == 10) {
			System.out.print("October");;
		} else if (month == 11) {
			System.out.print("November");;
		} else if (month == 12) {
			System.out.print("December");;
		} else if (month >12 || month < 1) {
			System.out.print("Entry is out of range: " + month);
		} else System.out.println("Exception!");
		
	}
		
	public static void ifLargerOfTwoNumbers() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int major = in.nextInt();
		System.out.print("Enter second number: ");
		int second = in.nextInt();
		
		if (second <0 || major <0) {
			System.out.print("Negative values are not allowed: "+second+" "+major);
		} else if (major > second) {
		System.out.print(major +" is > "+ second);
		} else if (second > major ) {
			System.out.print(second +" is > "+ major);
		} else if (major > second) {
		System.out.print(major +" is > "+ second);
		} else System.out.print("Exception caught!");
	}
	
	public static void ifGrade() {

		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter mark: ");
		int mark = in.nextInt();
		
		if (mark <0 || mark> 100) {
			System.out.print("Error in input: "+mark+". Valid types are 0 .. 100");
		} else if (mark>=70 && mark<= 100) {
			System.out.print("A");
		} else if (mark >= 60 && mark <70) {
			System.out.print("B");
		} else if (mark >= 50 && mark < 60) {
			System.out.print("C");
		} else if (mark >= 40 && mark < 50) {
			System.out.print("D");
		} else if (mark >=0 && mark < 40) {
			System.out.print("Fail!");
		} else System.out.print("Exception!");
	}

	public static void temperature() {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter temperature: ");
		int mark = in.nextInt();
		
		if (mark < -10 || mark> 31) {
			System.out.print("Extreme temperature!");
		} else if (mark>=-10 && mark<= 2) {
			System.out.print("Very Cold");
		} else if (mark >= 3 && mark <10) {
			System.out.print("Cold");
		} else if (mark >= 10 && mark < 15) {
			System.out.print("Mild");
		} else if (mark >= 15 && mark < 21) {
			System.out.print("Warm");
		} else if (mark >=21 && mark < 28) {
			System.out.print("Very Warm");
		} else if (mark >= 28 && mark <= 31) {
			System.out.print("Hot");
		}
		
	}

	public static void ifLargest() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int largest = in.nextInt();
		
		System.out.print("Enter second number: ");
		int b = in.nextInt();
		
		System.out.print("Enter third number: ");
		int c = in.nextInt();
		
		if (b > largest) {
			largest = b;
			if (c > largest) {
				largest = c;
				System.out.print("Largest number is: " + largest);
			} else System.out.print("Largest number is "+ b);
			
					
		} else { 
			
			if (c>largest) {
				largest = c;
				System.out.print("Largest number is: "+ largest);
			} else System.out.print("Largest number is: "+ largest);
		} 
		
		
	}

	public static void ternaryOperator() {
		
		Scanner in = new Scanner(System.in);
		boolean isHappy = false;
		
		if (isHappy) {
			System.out.println("I'm Happy!");
		} else {
			System.out.println("I'm Sad");
		}
		System.out.print("Enter x: ");
		int x = in.nextInt();
		System.out.print("Enter y: ");
		int y = in.nextInt();
		
		
		if (x > y) {
			System.out.print("minVal == "+ y);
		} else {
			System.out.print("minVal == "+ x);
		}
		
	}
}