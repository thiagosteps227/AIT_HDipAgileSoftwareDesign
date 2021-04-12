package ait.hdip.agileTesting2exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DiscountCalculatorTest {
	
	DiscountCalculator discountCalculator;

	@BeforeEach
	void setUp() throws Exception {
		discountCalculator = new DiscountCalculator();
	}

	
	@Test
	void testDiscountCalculator() {
		assertEquals(240,discountCalculator.calculateDiscount('G',300));
		assertEquals(200, discountCalculator.calculateDiscount('G',250));
		assertEquals(216, discountCalculator.calculateDiscount('G',240));
		assertEquals(90, discountCalculator.calculateDiscount('G',100));
		assertEquals(85.5, discountCalculator.calculateDiscount('G',90));
		assertEquals(189, discountCalculator.calculateDiscount('S',210));
		assertEquals(180, discountCalculator.calculateDiscount('S',200));
		assertEquals(180.5, discountCalculator.calculateDiscount('S',190));
		assertEquals(95, discountCalculator.calculateDiscount('S',100));
		assertEquals(90, discountCalculator.calculateDiscount('S',90));
		assertEquals(294.5, discountCalculator.calculateDiscount('B',310));
		assertEquals(285, discountCalculator.calculateDiscount('B',300));
		assertEquals(290, discountCalculator.calculateDiscount('B',290));
	}

}
