package ait.hdip.agileTesting1exercises;

public class DiscountCalculator {
	public double calculateDiscount(double totalPurchases) {
		
		double discount = 0;
		
		if(totalPurchases >= 250) {
			discount = totalPurchases * 0.2;
		} else if (totalPurchases >= 100) {
			discount = totalPurchases * 0.1;
		} else if (totalPurchases < 100) {
			discount = totalPurchases * 0.05;
		} return discount;
	}

}
