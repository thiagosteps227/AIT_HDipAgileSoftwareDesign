package ait.hdip.agileTesting1exercises;

public class CoffeeMachine {
	
	private static final double COFFEE_COST = 2.20;
	private int coffeePods;
	private double moneyInserted;
	private boolean waterTempOK;
	private boolean machineFaulty;
	String dispensedCoffee;
	int maxCaffine;
	int age;
	
	public CoffeeMachine() {
		this.coffeePods = 5;
		this.moneyInserted = 0;
		this.waterTempOK = true;
		this.machineFaulty = false;
		this.age = age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public int getCoffeePods() {
		return this.coffeePods;
	}

	public void setCoffeePods(int coffeePods) {
		this.coffeePods = coffeePods;
	}

	public double getMoneyInserted() {
		return moneyInserted;
	}

	public void setMoneyInserted(double moneyInserted) {
		this.moneyInserted = moneyInserted;
	}

	
	public void setWaterTempOK(boolean waterTempOK) {
		this.waterTempOK = waterTempOK;
	}


	public void setMachineFaulty(boolean machineFaulty) {
		this.machineFaulty = machineFaulty;
	}
	
	public String dispenseCoffee() {
		
		if (moneyInserted >= 2.2 && coffeePods >= 1 && waterTempOK == true && machineFaulty == false) {
			//dispensedCoffee = "OK";
			moneyInserted = moneyInserted - COFFEE_COST;
			coffeePods = coffeePods - 1;
			dispensedCoffee = "TAKE YOUR COFFEE";
			
		} else if (machineFaulty == true) {
			dispensedCoffee = "MACHINE FAULT";
			
		} else if (moneyInserted < 2.2) {
			dispensedCoffee = "INSERT MONEY";
			
		} else if (coffeePods == 0) {
			
			dispensedCoffee = "ADD COFFEE";
		}
		
		return dispensedCoffee;
	}
	
	
	
	public int checkMaxCaffine(int age) {
		
		if (age <= 15 ) {
			maxCaffine = 0;
		} else if (age > 15 && age < 65) {
			maxCaffine = 10;
		} else if (age >= 65) {
			maxCaffine = 5;
		}
		
		return maxCaffine;
	}
	
}