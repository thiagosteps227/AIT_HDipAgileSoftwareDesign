package ait.com.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ait.com.catpoundexercise.Cat;
import ait.com.catpoundexercise.CatPound;

public class CatTest {
	
	Cat cat;
	Cat catTwo;
	CatPound cats;
	
	@Before
	public void setUp() throws Exception {
		cat = new Cat();
		catTwo = new Cat();
		cats = new CatPound();
		cat.setName("gato");
		cat.setAge(7);
		cat.setColor("white");
		catTwo.setAge(7);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGettersAndSetters() {
		assertEquals("gato", cat.getName());
		assertEquals(7, cat.getAge());
		assertEquals("white", cat.getColor());
		
	}
	
	@Test
	public void test21AnyCatInThePound() {
		assertEquals(0, cats.getNumberOfCats());
	}
	
	@Test
	public void test22AddingCatToAnEmptyPound() {
		cats.addCat(cat);
		assertEquals(1, cats.getNumberOfCats());
	}
	
	@Test
	public void test23AddingCatToAnEmptyPound() {
		cats.addCat(cat);
		catTwo.setName("second");
		catTwo.setAge(7);
		catTwo.setColor("grey");
		cats.addCat(catTwo);
		assertEquals(2, cats.getNumberOfCats());
	}
	
	@Test 
	public void test24testingIfACatIsThere() {
		cats.addCat(cat);
		assertEquals("gato", cat.getName());
		assertTrue(cats.findCat(cat));
	}
	
	@Test 
	public void test31testRemovingCat() {
		cats.removeCat(cat);
		assertFalse(cats.findCat(cat));
	}
	
	@Test 
	public void test41testSearchCat() {
		cats.addCat(cat);
		assertTrue(cats.searchCat("gato"));
	}
	
	@Test 
	public void test51testSearchCatByAge() {
		
		cat.setAge(4);
		catTwo.setAge(5);
		
		cats.addCat(cat);
		cats.addCat(catTwo);
		
		assertEquals(1, cats.getNumberOlderThan(4));
	}


}
