package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import util.Algoritmos;

class Tests {

	@Test
	void testMetodoFibonacci() {
		assertEquals(1, Algoritmos.fibonacci(1));
		assertEquals(3, Algoritmos.fibonacci(4));
		assertEquals(8, Algoritmos.fibonacci(6));
	}
	
	@Test
	void testMetodoFactorial() {
		assertEquals(1, Algoritmos.factorial(0));
		assertEquals(1, Algoritmos.factorial(-27));
	}
	
	@Test
	void testMetodoesPrimo() {
		assertFalse(Algoritmos.esPrimo(42));
		assertTrue(Algoritmos.esPrimo(3));
		assertTrue(Algoritmos.esPrimo(999983));
	}

}
