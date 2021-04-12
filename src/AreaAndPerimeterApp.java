import java.util.Scanner;

public class AreaAndPerimeterApp {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the Area and Perimeter Calculator");
		System.out.println();
		System.out.print("Enter length: "); //input of length and width
		double length = in.nextDouble();
		System.out.print("Enter width:  ");
		double width = in.nextDouble();
		//computing area and perimeter
		double area = length * width;
		double perimeter = (2*length) + (2*width);
		//printing out the results
		System.out.println("Area:       "+area);
		System.out.println("Perimeter:  "+perimeter);
		
	}

}

