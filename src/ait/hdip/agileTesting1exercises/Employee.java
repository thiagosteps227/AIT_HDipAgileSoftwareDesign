package ait.hdip.agileTesting1exercises;

public class Employee {
	
	private String employeeName;
	private int yearsOfService;
	private double taxCredit;
	
	public Employee(String employeeName, int yearsOfService, double taxCredit) {
		this.employeeName = employeeName;
		this.yearsOfService = yearsOfService;
		this.taxCredit = taxCredit;
		
	}
	
	public String getEmployeeName() {
		return employeeName;
		
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	
	}
	
	public int getYearsOfServices() {
		return yearsOfService;
		
	}
	
	public void setYearsOfService(int yearsOfService) {
		this.yearsOfService = yearsOfService;
	}
	
	public double getTaxCredit() {
		return taxCredit;
	}
	
	public void setTaxCredit(double taxCredit) {
		this.taxCredit = taxCredit;
	}
		
	public boolean eligibleForAward() {
		
		boolean eligibleForAward = false;
		
		if (getYearsOfServices() > 6) {
			eligibleForAward = true;
		}
		return eligibleForAward;
	}
	
	public char taxBand() {
		
		char taxBand = ' ';
		if (getTaxCredit() >= 2000) {
			taxBand = 'A';
		} else if (getTaxCredit() >= 1000) {
			taxBand = 'B';
		} else taxBand = 'C';
		
		return taxBand;
	}

	
}
		
	
	
	

