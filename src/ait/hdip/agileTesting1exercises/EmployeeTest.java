package ait.hdip.agileTesting1exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmployeeTest {
	Employee employee;
	
	@BeforeEach 
	public void setUp() {
		employee = new Employee("Thiago", 3, 2000);
	}
	
	@Test
	public void testEmployeeConstructed() {
		
		assertEquals(employee.getEmployeeName(), "Thiago");
		assertEquals(employee.getYearsOfServices(), 3);
		assertEquals(employee.getTaxCredit(), 2000);
		
	}
	
	
	@Test
	public void testNameChanged() {
	    employee.setEmployeeName("Avril");
		assertEquals(employee.getEmployeeName(), "Avril");
	}
	
	@Test
	public void testYearsOfServiceChanged() {
		employee.setYearsOfService(6);
		assertEquals(employee.getYearsOfServices(), 6);
	}
	
	@Test
	public void testTaxCreditChanged() {
		employee.setTaxCredit(3000);
		assertEquals(employee.getTaxCredit(), 3000);
	}
	
	@Test
	public void testEligibleForAwardTrue() {
		Employee employee = new Employee("Avril", 7, 3000);
		assertTrue(employee.eligibleForAward());
	}
	
	@Test
	public void testEligibleForAwardFalse() {
		assertFalse(employee.eligibleForAward());
	}
		
	
	@Test
	public void testTaxBandA() {
		Employee employee = new Employee("Avril", 3, 3000);
		assertEquals(employee.taxBand(), 'A');
	}
	
	@Test
	public void testTaxBandB() {
		Employee employee = new Employee("Avril", 3, 1500);
		assertEquals(employee.taxBand(), 'B');
	}
	
	@Test
	public void testTaxBandC() {
		Employee employee = new Employee("Avril", 3, 800);
		assertEquals(employee.taxBand(), 'C');
	}
	
	
	
}
