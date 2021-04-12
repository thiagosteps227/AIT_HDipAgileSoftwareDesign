import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter radius: ");
		double radius = in.nextDouble();
		final double PI = 3.14;
		double diameter = 2 * radius;
		double circum = 2 * PI * radius;
		double area = PI * Math.pow(radius, 2);
		
		System.out.println("The diameter is: "+ diameter);
		System.out.println("The circumference is: "+ circum);
		System.out.println("The area is: "+ area);
		
		
		

	}

}
