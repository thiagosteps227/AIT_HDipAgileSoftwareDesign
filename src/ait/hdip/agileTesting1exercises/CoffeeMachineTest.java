package ait.hdip.agileTesting1exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CoffeeMachineTest {

	CoffeeMachine coffeeMachine;
	
	@BeforeEach 
	public void setUp() {
		coffeeMachine = new CoffeeMachine();
	}
	
	@Test
	void testCoffeeMachineConstructed() {
		assertEquals(5, coffeeMachine.getCoffeePods());
		assertEquals(0, coffeeMachine.getMoneyInserted());
	}
	
	@Test
	void testChangeCoffeePods() {
		coffeeMachine.setCoffeePods(6);
		assertEquals(6, coffeeMachine.getCoffeePods());
		
	}
	
	@Test
	void testInsertMoney() {
		coffeeMachine.setMoneyInserted(2.5);
		assertEquals(2.5, coffeeMachine.getMoneyInserted());
		
	}
	@Test
	void testDispenseCoffeeOK() {
		coffeeMachine.setMoneyInserted(3.00);
		assertEquals("TAKE YOUR COFFEE", coffeeMachine.dispenseCoffee());
		assertEquals(4, coffeeMachine.getCoffeePods());
		assertEquals(0.8, coffeeMachine.getMoneyInserted(), 0.001);
		
	}
	@Test
	void testDispenseCoffeeMACHINEFAULT() {
		coffeeMachine.setMachineFaulty(true);
		assertEquals("MACHINE FAULT", coffeeMachine.dispenseCoffee());
		assertEquals(5, coffeeMachine.getCoffeePods());
		assertEquals(0, coffeeMachine.getMoneyInserted());
				
	}
	@Test
	void testDispenseCoffeeINSERTMONEY() {
		coffeeMachine.setMoneyInserted(1.50);
		assertEquals("INSERT MONEY", coffeeMachine.dispenseCoffee());
		assertEquals(5, coffeeMachine.getCoffeePods());
		assertEquals(1.5, coffeeMachine.getMoneyInserted());
				
	}
	@Test
	void testDispenseCoffeeOUTOFCOFFEE() {
		coffeeMachine.setMoneyInserted(2.2);
		coffeeMachine.setCoffeePods(0);
		assertEquals("ADD COFFEE", coffeeMachine.dispenseCoffee());
		
	}
	
	@ParameterizedTest(name="Age{0} should have maxCaffine of {1}")
	@CsvSource({"66,5","65,5","64,10","63,10","17,10","16,10","15,0","14,0","1,0","0,0"})
	void testCheckMaxCaffine(int age, int maxCaffine) {
		coffeeMachine.setAge(age);
		assertEquals(maxCaffine, coffeeMachine.checkMaxCaffine(age));
	}
	
	

}
