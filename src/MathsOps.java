import java.util.Scanner;
import java.util.Scanner;

public class MathsOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter num1: ");
		int num1 = in.nextInt();
		System.out.print("Enter num2: ");
		int num2 = in.nextInt();
		
		int sum = num1 + num2;
		
		
		System.out.println("The sum of " + num1+ " and "+num2+" is "+ sum);
		System.out.println("The product of " + num1+ " and "+num2+" is "+ num1*num2);
		System.out.println("The difference of " + num1+ " and "+num2+" is "+ (num1 - num2));
		
		if ( num2 == 0) {
			System.out.println("num2 is 0; cannot divide by 0: "+num2);
		} else {
			System.out.println("The quotient of " + num1+ " and "+num2+" is "+ num1/num2 );
		}
		
		
		
		
	}

}
