import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Please Enter Your Name: ");
		String name = in.next();
		System.out.print("Please Enter your Phone Number: ");
		int phone = in.nextInt();
		System.out.print("Please Enter Your Email: ");
		String email = in.next();
		
		System.out.println("\nHi! My name is " + name );
		System.out.println("If you need to contact me, my phone is " + phone);
		System.out.println("My email is: " + email);
		

	}

}
