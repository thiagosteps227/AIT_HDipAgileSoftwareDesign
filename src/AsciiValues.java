import java.util.Scanner;

public class AsciiValues {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		  
		 
		int ascii = 0;
		while (ascii != 120 ) {
			System.out.print("Enter char: ");
			String letter = in.next();
			
			ascii = letter.charAt(0);
			
			System.out.println("Ascii valid of " + letter + " is " + ascii);
			System.out.println();
		}
	}
			
}
			
				    		    
	
