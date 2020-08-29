package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import model.Calculator;

public class TestAddSubtract {
	
	private Calculator calculator;
	
	@Before
	public void setUp() {
		calculator = new Calculator();
	}
	
	@Test
	public void testAdd() {
		int a = 30;
		int b = 15;
		
		long result = calculator.add(a, b);
		
		assertEquals(45, result);
				
	}
	
	@Test
	public void testAddIsFalse() {
		int a = 40;
		int b = 30;
		
		long result = calculator.add(a, b);
		
		assertFalse(result == 100);
				
	}
	
	@Test
	public void testAddIsTrue() {
		int a = 40;
		int b = 30;
		
		long result = calculator.add(a, b);
		
		assertTrue(result == 70);
				
	}
	
	@Test
	public void testSubtract() {
		int a = 15;
		int b = 10;
		
		long result = calculator.subtract(a, b);
		assertEquals(5, result);
	}
	
	@Test
	public void testSubtractIsFalse() {
		int a = 10;
		int b = 10;
		
		long result = calculator.subtract(a, b);
		assertFalse(result == 150);
	}
	
	@Test
	public void testSubtractIsTrue() {
		int a = 10;
		int b = 10;
		
		long result = calculator.subtract(a, b);
		assertTrue(result == 0);
	}

}
