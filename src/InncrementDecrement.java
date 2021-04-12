
public class InncrementDecrement {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 10;
		
		System.out.println("The value of x is: " + x);
		int a = ++x;
		System.out.println("The value of ++x is: "+ a);
		int b = a++;
		System.out.println("The value of x++ is: "+ b);
		int c = ++b;
		System.out.println("The value of x is: "+ c);
		
		System.out.println("The value of y is: " + y);
		int d = --y;
		System.out.println("The value of --y is: "+ d);
		int e = d--;
		System.out.println("The value of y-- is: "+ e);
		int f = --e;
		System.out.println("The value of y is: "+ f);
		

	}

}
