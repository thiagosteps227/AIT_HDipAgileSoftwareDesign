import java.util.Scanner;

public class CapitalLetter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a letter (a-zA-z): ");
		String letter = in.next();
		
		
		if(letter.charAt(0) >= 65 && letter.charAt(0) <= 90) {
			System.out.println("UPPERCASE: " + letter);
			
		} else if(letter.charAt(0) >= 97 && letter.charAt(0) <= 122) {
			System.out.println("lowercase: " + letter);
		} else {
			System.out.println("Error in input: "+ letter);
		}
	
	}
}
		
		

