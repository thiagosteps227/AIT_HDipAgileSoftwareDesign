package ait.hdip.agileTesting1exercises;

public class Customer {
	private String name;
	private int age;
	private boolean loyaltyCard;
	
	public Customer(String name, int age, boolean loyaltyCard) {
		this.name=name;
		this.age=age;
		this.loyaltyCard=loyaltyCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isLoyaltyCard() {
		return loyaltyCard;
	}

	public void setLoyaltyCard(boolean loyaltyCard) {
		this.loyaltyCard = loyaltyCard;
	}
	
	public double calculateFee(int hours, boolean VIPSpace) {
		double hourlyRate=2;
		double fee=0;
		if (VIPSpace) {
			hourlyRate=5;
		}
		fee =hours*hourlyRate;
		if (age>= 65 && loyaltyCard==true) {
			fee = fee*0.7;
				
		}else if(loyaltyCard==true) {
			fee = fee*0.8;
		
		}
		return fee;
	}

}
