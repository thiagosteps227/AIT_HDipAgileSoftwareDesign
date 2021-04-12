package ait.hdip.agileTesting2exercises;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTest {
	Customer customer;
	

	
	@BeforeEach
	void setUp() throws Exception{
		customer = new Customer("Thiago", 123456, "thiago@thiago.com", 30);
		
	}

	@Test
	void testCustomer() {
		assertEquals("Thiago", customer.getName());
		assertEquals(123456, customer.getPps());
		assertEquals("thiago@thiago.com", customer.getEmail());
		assertEquals(30, customer.getAge());
	
	}
	
	@Test
    void exceptionTesting() {		
        
		//testing the constructor exceptions
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
        new Customer(null,1234567, "thiago@thiago.com",23));
        assertEquals("Name cannot be null", exception.getMessage());
        
        exception = assertThrows(IllegalArgumentException.class, () ->
        new Customer("",1234567, "thiago@thiago.com",23));
        assertEquals("Name cannot be empty", exception.getMessage());
        
        exception = assertThrows(IllegalArgumentException.class, () ->
        new Customer("thiago",-1234567, "thiago@thiago.com",23));
        assertEquals("Not positiove Ppss are not allowed", exception.getMessage());
        
        exception = assertThrows(IllegalArgumentException.class, () ->
        new Customer("thiago",1234567, null,23));
        assertEquals("Email cannot be null", exception.getMessage());
        
        exception = assertThrows(IllegalArgumentException.class, () ->
        new Customer("thiago",1234567, "thiago@thiago.com", 16));
        assertEquals("Customer mush be at least 18 year old", exception.getMessage());
        
        
        //testing the setters exceptions
        exception = assertThrows(IllegalArgumentException.class, () ->
        customer.setName(null));
        assertEquals("Name cannot be null", exception.getMessage());
        
        exception = assertThrows(IllegalArgumentException.class, () ->
        customer.setPps(-12345));
        assertEquals("Not positiove Ppss are not allowed", exception.getMessage());
        
        exception = assertThrows(IllegalArgumentException.class, () ->
        customer.setEmail(null));
        assertEquals("Email cannot be null", exception.getMessage());
		
        exception = assertThrows(IllegalArgumentException.class, () ->
        customer.setAge(17));
        assertEquals("Customer mush be at least 18 year old", exception.getMessage());
	
	}
}
