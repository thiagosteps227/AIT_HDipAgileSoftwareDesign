package ait.hdip.agileTesting1exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTest {
	private Customer customer;

	@BeforeEach
	void setUp() {
		customer=new Customer("John", 40,false);
	}
	@Test
	void testCustomerConstructed() {
		assertEquals("John",customer.getName());
		assertEquals(40,customer.getAge());
		assertFalse(customer.isLoyaltyCard());
	}
	
	@Test
	void testCustomerNameChanged() {
		customer.setName("Tom");
		assertEquals("Tom",customer.getName());
	}
	
	@Test
	void testCustomerAgeChanged() {
		customer.setAge(41);
		assertEquals(41,customer.getAge());
	}
	
	@Test
	void testCustomerLoyaltyCardChanged() {
		customer.setLoyaltyCard(true);
		assertTrue(customer.isLoyaltyCard());
	}
	
	@Test
	void testStdParkingNoLoyaltyAge40() {
		assertEquals(10,customer.calculateFee(5, false));
	}
	
	@Test
	void testVIPParkingNoLoyaltyAge40() {
		assertEquals(25,customer.calculateFee(5, true));
	}
	
	@Test
	void testStdParkingWithLoyaltyAge40() {
		customer.setLoyaltyCard(true);
		assertEquals(8,customer.calculateFee(5, false));
	}
	
	@Test
	void testVIPParkingWithLoyaltyAge40() {
		customer.setLoyaltyCard(true);
		assertEquals(20,customer.calculateFee(5, true));
	}
	
	@Test
	void testVIPParkingWithLoyaltyAge70() {
		customer.setAge(70);
		customer.setLoyaltyCard(true);
		assertEquals(7,customer.calculateFee(5, false));
	}

}
