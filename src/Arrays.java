import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		//exercise1();
		exercise2();
	}
	
	public static void exercise1() {
		
		int[] a = {10, 20,30,40,50};
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		for (int element: a) {
			System.out.println(element);
		}
	}
	
	public static void exercise2() {
		
		Scanner in = new Scanner(System.in);
		int [] numbers = new int[5];
		
		/*for (int i =0; i<numbers.length;i++) {
			System.out.print("Enter a value --> ");
			numbers[i] = in.nextInt();
		}
		for (int i =0; i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}**/
		
		for(int element: numbers) {
			System.out.print("Enter a value --> ");
			numbers[element] = in.nextInt();
		}

		for(int element: numbers) {
			
			System.out.println(element);
		}
		
			
		
		
	}

	private static char[] toString(int[] numbers) {
		// TODO Auto-generated method stub
		return null;
	}

}
