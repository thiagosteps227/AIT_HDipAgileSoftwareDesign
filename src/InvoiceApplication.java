import java.util.Scanner;

public class InvoiceApplication {

	public static void main(String[] args) {
		
		
		System.out.println("Welcome to the Invoice Total Calculator");
		System.out.println();
		double subtotal = 100;
		double discountPercent = 0.2;
		double discountAmount = subtotal * discountPercent;
		double total = subtotal - discountAmount;
		
		System.out.println("Subtotal:          "+ subtotal);
		System.out.println("Discount percent:  "+discountPercent);
		System.out.println("Discount Amount:   "+discountAmount);
		System.out.println("Total:             "+total);
		
		
		
	}

}
