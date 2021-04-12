import java.util.Scanner;

public class SwitchExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switchOnAString();
		//switchMonth();
		//switchChar();
		//switchSquareOrCube();
		//switchVowelOrConsonant();
		//switchDaysInMonth();
		String greeting = "Hello!";
		String sub = greeting.substring(0,2);
		System.out.println(sub);
	}
	
	public static void switchOnAString() {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a name: ");
		
		String name = in.next();
		name = name.toLowerCase();
		int gender = 0;
		if (name.equals("john")) {
			gender = 1;
		} else gender = 2;
		
		
		switch (gender) {
			case 1:
				System.out.print("Male");
			break;
			
			case 2:
				System.out.print("Female");
			break;
		}
	}

	public static void switchMonth() {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a month: ");
		int month = in.nextInt();
		
		switch(month) {
			case 1 : 
				System.out.print("January");
			break;
			case 2 : 
				System.out.print("February");
			break;
			case 3 : 
				System.out.print("March");
			break;
			case 4 : 
				System.out.print("April");
			break;
			case 5 : 
				System.out.print("May");
				break;
			case 6 : 
				System.out.print("June");
				break;
			case 7 : 
				System.out.print("July");
				break;
			case 8 : 
				System.out.print("August");
				break;
			case 9 : 
				System.out.print("September");
				break;
			case 10 : 
				System.out.print("October");
				break;
			case 11 : 
				System.out.print("November");
				break;
			case 12 : 
				System.out.print("December");
				break;
			default:
				System.out.print("Invalid month "+month);
			
		}
	}

	public static void switchChar() {
		
		//Initialising the scanner
		Scanner in = new Scanner(System.in);
		
		//reading the client numbers:
		System.out.print("Enter number 1: ");
		double num1 = in.nextInt();
		System.out.print("Enter number 2: ");
		double num2 = in.nextInt();
		//reading the character operator
		System.out.print("Enter a char: ");
		String character = in.next();
		//associating the operator to the character for the switch sentence
		int operator = 0;
		if (character.equals("+")) {
			operator = 1;
		} else if (character.equals("-")) {
			operator = 2;
		} else if (character.equals("*")) {
			operator = 3;
		} else if (character.equals("/")) {
			operator = 4;
		}
		
		//printing the results
		switch(operator) {
		case 1: 
			System.out.print(num1+" + "+num2+" = "+ (num1+num2));
		break;
		case 2: 
			System.out.print(num1+" - "+num2+" = "+ (num1-num2));
		break;
		case 3: 
			System.out.print(num1+" * "+num2+" = "+ (num1*num2));
		break;
		case 4: 
			System.out.print(num1+" / "+num2+" = "+ (num1/num2));
		break;
		default:
			System.out.print("Invalid mathematical operator: "+character);
		}
		
	}

	public static void switchSquareOrCube() {
		
		//Initialising the scanner
		Scanner in = new Scanner(System.in);
				
		//reading the client number:
		System.out.print("Enter number (1..10): ");
		int num1 = in.nextInt();
				
				
		//associating the operator to the character for the switch sentence
		int evenOrOdd = 0;
		if (num1>=1 && num1<= 10) {
			if ( num1 % 2 == 0) {
				evenOrOdd = 0;
			} else evenOrOdd = 1;
				
		//printing the results
			switch(evenOrOdd) {
			case 0: 
			System.out.print(num1+" squared is "+ Math.pow(num1,2));
			break;
			case 1: 
			System.out.print(num1+" cubed is "+ Math.pow(num1,3));
			};
		} else System.out.print(num1+" is outside range of (1..10)");
	}
				
	public static void switchVowelOrConsonant() {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a char: ");
		String letter = in.next().toLowerCase();
		
		
		int checker = -1;
		if (letter.charAt(0)<97 || letter.charAt(0)>122) {
			checker = 0;
		} else if (letter.charAt(0) == 97) {
			checker = 1;
		} else if (letter.charAt(0) == 101) {
			checker = 2;
		} else if (letter.charAt(0) == 105) {
			checker = 3;
		} else if (letter.charAt(0) == 111) {
			checker = 4;
		} else if (letter.charAt(0) == 117) {
			checker = 5;
		} 
			
			
			switch (checker) {
			case 0: 
				System.out.print(letter+" is invalid input");
			break;
			case 1:
				System.out.print(letter+" is a vowel");
			break;
			case 2:
				System.out.print(letter+" is a vowel");
			break;
			case 3: 
				System.out.print(letter+" is a vowel");
			break;
			case 4:
				System.out.print(letter+" is a vowel");
			break;
			case 5:
				System.out.print(letter+" is a vowel");
			break;
			
			default: System.out.print(letter+" is a consonant");
				
			}
			
	}		

	public static void switchDaysInMonth() {
	    //reading year
		Scanner in = new Scanner(System.in);
		System.out.print("Enter year: ");
		int year = in.nextInt();
		//reading the month
		System.out.print("Enter month (1..12): ");
		int month = in.nextInt();
		//checking if it is a leap year and setting February to 29
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			if (month == 2 ) {
				month = 13;
			}
		} 
		//printing number of days
		switch(month) {
		case 1:
			System.out.print("Number of days: "+31);
		break;
		case 2:
			System.out.print("Number of days: "+28);
		break;
		case 3:
			System.out.print("Number of days: "+31);
		break;
		case 4:
			System.out.print("Number of days: "+30);
		break;
		case 5:
			System.out.print("Number of days: "+31);
		break;
		case 6:
			System.out.print("Number of days: "+30);
		break;
		case 7:
			System.out.print("Number of days: "+31);
		break;
		case 8:
			System.out.print("Number of days: "+31);
		break;
		case 9:
			System.out.print("Number of days: "+30);
		break;
		case 10:
			System.out.print("Number of days: "+31);
		break;
		case 11:
			System.out.print("Number of days: "+30);
		break;
		case 12:
			System.out.print("Number of days: "+31);
		break;
		case 13:
			System.out.print("Number of days: "+29);
		}
		
	}

}	
		
			
 
		



