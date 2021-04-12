package ait.hdip.agileTesting2exercises;

public class DiscountCalculator {
	double total;
	double discountApplied;
	public double calculateDiscount(char customerType, double subTotal) {
		switch(customerType) {
		case 'G':
			if(subTotal>= 250) {
				discountApplied = 0.2;
			} else if (subTotal>= 100 && subTotal < 250) {
				discountApplied = 0.1;
			} else if (subTotal < 100) {
				discountApplied = 0.05;
			}
			break;
		case 'S':
			if(subTotal>= 200) {
				discountApplied = 0.1;
			} else if (subTotal>= 100 && subTotal < 200) {
				discountApplied = 0.05;
			} else if (subTotal < 100) {
				discountApplied = 0.0;
			}
			break;
		case 'B':
			if(subTotal>= 300) {
				discountApplied = 0.05;
			} else {
				discountApplied = 0.0;
			}
			break;
		}
		total = subTotal - (subTotal*discountApplied);
		return total;
	}
}
