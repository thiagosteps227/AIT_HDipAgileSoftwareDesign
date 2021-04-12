package ait.hdip.agileTesting1exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiscountCalculatorTest {

	@Test
	void testDiscount60() {
		DiscountCalculator discountCalculator = new DiscountCalculator();
		
		assertEquals(discountCalculator.calculateDiscount(300), 60);
	}
	
	@Test
	void testDiscount10() {
		DiscountCalculator discountCalculator = new DiscountCalculator();
		
		assertEquals(discountCalculator.calculateDiscount(100), 10);
	}
	
	@Test
	void testDiscount4() {
		DiscountCalculator discountCalculator = new DiscountCalculator();
		
		assertEquals(discountCalculator.calculateDiscount(80), 4);
	}

}
