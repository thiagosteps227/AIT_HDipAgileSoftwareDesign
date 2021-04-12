import java.util.Scanner;

public class IfLogicalOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter num1: ");
		int num1 = in.nextInt();
		System.out.print("Enter num2: ");
		int num2 = in.nextInt();
		
		if (num1 <0 && num2 < 0) {
			System.out.println("Both numbers are negative");
		} else if (num1> 0 && num2 >0) {
			System.out.println("Both numbers are positive");
		} else if (num1 == 0 || num2 == 0) {
			System.out.println("One of the numbers is 0");
		} else if ((num1 < 0 && num2 >= 0) || (num1 >= 0 && num2 < 0)) {
			System.out.println("One of the numbers is negative");
		}

	}

}
