import java.util.Scanner;

public class AlgebraicExpression {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Evaluating \"y = ax3 + 7\" where x ==2 and a == 3" );
		System.out.println();
		
		int y = 0;
		int x = 2;
		int a = 3;
		y = a * x * x * x + 7;
		System.out.println("y = a * x * x * x + 7 sets y to:        " + y);
		y = a * x * x * (x + 7);
		System.out.println("y = a * x * x * (x + 7) sets y to:      "+ y);
		y = (a * x) * x * (x + 7);
		System.out.println("y = (a * x) * x * (x + 7) sets y to:    "+y);
		y = a * (x * x * x) + 7;
		System.out.println("y = a * (x * x * x) + 7 sets y to:      "+ y);
		y = a * x * (x * x + 7);
		System.out.println("y = a * x * (x * x + 7) sets y to:      "+ y);
		y = (int) (a * Math.pow(x, 3) + 7);
		System.out.println("y = a * Math.pow(x, 3) + 7) sets y to:      "+ y);


	}

}
