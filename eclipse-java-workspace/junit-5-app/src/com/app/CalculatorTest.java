package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	Calculator calc;
	
	@Test
	public void testAdd() {
		assertEquals(50, calc.add(20, 30));
	}
	
	
	@Test
	public void testDivide() {
		
		assertEquals(4, calc.divide(20, 5));
		assertThrows(ArithmeticException.class, ()->calc.divide(5, 0));
	}
	
	@BeforeEach
	public void initEach() {
		System.out.println("Testing In Progress");
		calc = new Calculator();
	}
	
	
	@AfterEach
	public void destroy() {
		System.out.println("Test Comleted..");
		calc=null;
	}
	
	@BeforeAll
	public static void init() {
		System.out.println("Tesing Initiated..");
	}
	
	@AfterAll
	public static void finalizeTest() {
		System.out.println("All Test Completed..");
	}
	
}
