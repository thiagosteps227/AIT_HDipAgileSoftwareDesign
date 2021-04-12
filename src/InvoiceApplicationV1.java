import java.util.Scanner;

public class InvoiceApplicationV1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the Invoice Total Calculator");
		System.out.println();
		System.out.print("Enter subtotal:  ");
		double subtotal = in.nextDouble();
		System.out.print("Enter discount percent:  ");
		double discountPercent = in.nextDouble();
		double discountAmount = subtotal * discountPercent;
		double total = subtotal - discountAmount;
		
		System.out.println("Subtotal:          "+ subtotal);
		System.out.println("Discount percent:  "+discountPercent);
		System.out.println("Discount Amount:   "+discountAmount);
		System.out.println("Total:             "+total);
				

	}

}
