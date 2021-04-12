import java.util.Scanner;

public class Modulus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter x: ");
		int num1 = in.nextInt();
		System.out.print("Enter y: ");
		int num2 = in.nextInt();
		
		if (num1 % num2 == 0) {
			System.out.println(num1 +" is a multiple of "+num2);
		} else {
			System.out.println(num1 +" is not a multiple of "+num2);
		}
	}

}
