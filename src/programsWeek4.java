import java.util.Scanner;

public class programsWeek4 {

	public static void main(String[] args) {
		
		
		
				
	}
	
	//Question 10 
	/*String a = printMessage("Chapter 4 test");
		System.out.print(a);*/
	
	//Question 9
	/*private static String printMessage(String message) {
		
		return message;
	}*/
	
	//Question 8
	/*for(int width = 1; width <=10 ; width++ ) {
			for (int length =1; length <= 10; length++) {
				System.out.println("The rectangule area for width "+width+" and length "+length+" is: "+ length*width);
			}
		}*/
	
	//Question 7 
	/*int sum = 0;
		int num = 50;
		while(num>=10) {
			sum += num;
			num -= 5;
		System.out.println(num+"  "+ sum);
		}*/
	
	//Question 6
	/*String choice = " ";
		
		while(!choice.equals("x")) {
		System.out.print("Enter a code or x to exit: ");
		Scanner sc = new Scanner(System.in);
		choice = sc.next().toLowerCase();
		}*/
	
	//Question 5
	/*int num = 5;
		int sum = 0;
		
		while(num<100) {
			sum += num;
			num += 5;
		System.out.println(sum);	
		}*/
	
	//Question 4
	/* weightInt = 0;
		double shippingBase = 0;
		
		switch(weightInt) {
		case 5:
			shippingBase = 4.95;
			break;
		case 10:
			shippingBase = 7.95;
			break;
		case 15:
			shippingBase = 10.95;
			break;
		case 20:
			shippingBase = 10.95;
		default:
			shippingBase = 14.95;*/
	
	//Question 3	
	/*private static double getUPSShipping(double weight, int zipCode) {
			
			double shippingCost = 0;
			if (weight <= 5) {
				shippingCost = 4.95;
			}else if (weight >5 && weight <= 10) {
				shippingCost = 7.95;
			}else if (weight > 10) {
				shippingCost = 10.95;}
			
			if (zipCode >= 25000 && zipCode <=50000) {
				shippingCost += 1.5;
			}else if (zipCode > 50000 && zipCode <= 75000) {
				shippingCost += 2.5;
			} else {
				shippingCost += 3.5;
			}
			return shippingCost;*/
	
	
		
	
	//Question 2
	/*String shippingMethod = "UPS";
		double weight=6;
		double shippingBase = 0;
		int zipCode = 123456;
					
		if (shippingMethod.equals("UPS")) {
			getUPSShipping(weight,zipCode);
			
		}else if (shippingMethod.equals("FEDEX")) {
			getFedExShipping();
		}else {
			getOtherShipping();
		}
				
	

	public static void getUPSShipping(double weight, int zipCode) {
		double shippingBase = 0;
		if (weight <= 5) {
			shippingBase = 4.95;
		}else if (weight >5 && weight <= 10) {
			shippingBase = 7.95;
		}else if (weight > 10) {
			shippingBase = 10.95;}
		double shippingCost = shippingBase;
		System.out.print(shippingCost);
	}
	
	public static void getFedExShipping() {
		double shippingCost = 7.95;
		System.out.print(shippingCost);
	}
	
	public static void getOtherShipping() {
		double shippingCost = 10.95;
		System.out.print(shippingCost);
	}*/
	
	// Question1
			/*String shippingMethod = "";
			double weight=6;
			double shippingBase = 0;
			if (shippingMethod.equals("UPS")) {
				if (weight <= 5) {
					shippingBase = 4.95;
				}else if (weight >5 && weight <= 10) {
					shippingBase = 7.95;
				}else if (weight > 10) {
					shippingBase = 10.95;
				}
			}else if (shippingMethod.equals("FEDEX")) {
				shippingBase = 7.95;
			}else {
				shippingBase = 9.95;
			}
			System.out.print(shippingMethod + " "+shippingBase +" "+ weight);*/
}
