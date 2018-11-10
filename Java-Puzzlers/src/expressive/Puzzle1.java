package expressive;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import annotations.Puzzle;

class Puzzle1 {

	@Test
	//@Disabled
	void testPositive() {
		for (int i = 1; i < 100; i++) {
			if (isOdd(i)) {
				System.out.println("Integer: " + i);
				double d = Double.valueOf(i % 2).doubleValue();
				System.out.println("Rem\t " + d);
				double ieee = Math.abs(Math.IEEEremainder(i, 2));
				System.out.println("IEEE Rem " + ieee);
				assertEquals(ieee, d);
			}
		}
	}

	@Test
	//@Disabled
	void testNegative() {
		for (int i = 0; i > -100; --i) {
			assertTrue(isOdd(i));
		}
	}

	@Test
	@Disabled
	void testMathClassRemainder() {
		double i = 4;
		double j = Math.IEEEremainder(i, 2);
		System.out.println(j);
	}
	
	@Test
	void testBitwise() {
		assertTrue(isOddBW(3));
		assertFalse(isOddBW(4));
		assertFalse(isOdd(-3));
	}

	/**
	 * The following method purports to determine whether its sole argument is an
	 * odd number. Does the method work ?
	 * <p>
	 * tested on (Java 1.8)
	 * 
	 * @param i
	 * @return
	 */
	@Puzzle
	public static boolean isOdd(int i) {
		return i % 2 == 1;
	}

	/**
	 * As a general rule, the divide and remainder operations
	 * are slow compared to other arithmetic and logical operations.
	 * @param i
	 * @return
	 */
	public static boolean isOddBW(int i) {
		return (i & 1) != 0;
	}

}
