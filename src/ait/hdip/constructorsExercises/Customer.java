package ait.hdip.constructorsExercises;

public class Customer {

	private int accountNo;
	private double balance;
	private String name;
	private int count;
	
	public Customer() {
		int accountNo;
		double balance;
		String name;
		int count;
	}
	
	public Customer(int accountNo, double balance, String name, int count) {
		this.accountNo = accountNo;
		this.balance = balance;
		this.name = name;
		this.count = count;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public int getCount() {
		return count;
	}
	
	public String toString() {
		String details = "Customer [accountNo= "+accountNo+", name= "+name+", balance= "+balance;
		return details;
	}
	
	
	
}
