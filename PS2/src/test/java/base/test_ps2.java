package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class test_ps2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testisEven() {
		assertTrue(MyInteger.isEven(2));
		assertFalse(MyInteger.isEven(3));
		
	}
	public void testisOdd() {
		assertTrue(MyInteger.isOdd(1));
		assertFalse(MyInteger.isOdd(4));
		
}
	public void testisPrime() {
		assertTrue(MyInteger.isPrime(1));
		assertFalse(MyInteger.isPrime(6));
		
}
}