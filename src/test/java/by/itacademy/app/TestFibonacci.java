package by.itacademy.app;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigInteger;

import org.junit.Test;

public class TestFibonacci {

	@Test
	public void testFecthNumber() {
		assertAll("fecthNumberGroup",
				() -> assertEquals(Fibonacci.fecthNumber(0), BigInteger.valueOf(0)),
				() -> assertEquals(Fibonacci.fecthNumber(19), BigInteger.valueOf(4181)),
				() -> assertEquals(Fibonacci.fecthNumber(-21), BigInteger.valueOf(-10946)));
	}
	
	@Test
	public void testFecthList() {
		assertAll("fecthListGroup",
				() -> assertNotNull(Fibonacci.fecthList(15)),
				() -> assertTrue(Fibonacci.fecthList(0).size()>=1),
				() -> assertEquals(Fibonacci.fecthList(1).get(0), BigInteger.valueOf(1)),
				() -> assertEquals(Fibonacci.fecthList(15).get(10), BigInteger.valueOf(89)),
				() -> assertEquals(Fibonacci.fecthList(-18).get(15), BigInteger.valueOf(-987)));
	}
	
}
