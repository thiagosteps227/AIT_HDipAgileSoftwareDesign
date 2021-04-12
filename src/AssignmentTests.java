import java.util.Scanner;

public class AssignmentTests {

	public static void main(String[] args) {
		
		int x = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter integer (1...10): ");
		x = in.nextInt();
		
		if (x < 0 || x > 10) {
			System.out.println("Input value outside of range 1..10 : "+ x);
		
		} else if (x >= 6 &&  x <= 10) {
			System.out.println("The cube of " + x + " is " + (x*x*x) );
		} else if (x>=1 && x<= 5) {
			System.out.println("The square of " + x + " is " + (x*x) );
		}
			
		
	}

}
