package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import model.Calculator;

public class TestMultiplyDivide {
	
	private Calculator calculator;
	
	@Before
	public void setUp() {
		calculator = new Calculator();
	}

	@Test
	public void testMultiply() {
		int a = 20;
		int b = 30;
		
		long result = calculator.multiply(a, b);
		assertEquals(600, result);
	}
	
	@Test
	public void testMultiplyIsFalse() {
		int a = 25;
		int b = 4;
		
		long result = calculator.multiply(a, b);
		assertFalse(result == 99);
	}
	
	@Test
	public void testDivide() {
		int a = 40;
		int b = 2;
		
		double result = calculator.divide(a, b);
		assertEquals(20, result, 0.0);
	}

	@Test
	public void testDivideIsTrue() {
		int a = 8;
		int b = 2;
		
		double result = calculator.divide(a, b);
		assertTrue(result == 4);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDivideByZero() {
		int a = 25;
		int b = 0;
		
		calculator.divide(a, b);
	}
	
	
}
