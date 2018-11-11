package expressive;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import annotations.Puzzle;

public class Puzzle3 {

	@Test
	@Puzzle
	public void longDivision() {
		final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;
		System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
		assertEquals(1000L, MICROS_PER_DAY / MILLIS_PER_DAY);
	}

	@Test
	public void fix() {
		System.out.println("Running fix");
		final long MICROS_PER_DAY = 24L * 60L * 60L * 1000L * 1000L;
		final long MILLIS_PER_DAY = 24L * 60L * 60L * 1000L;
		System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
		assertEquals(1000L, MICROS_PER_DAY / MILLIS_PER_DAY);
		// Yay! it worked
	}

	/**
	 * My Assumption: Integer is being multiplied and assigned to long. after
	 * integer max value is reached, overflow occurs,the actual value changes to
	 * small int.
	 */
	@Test
	public void fix2() {
		System.out.println("Running fix2");
		final long _MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
		final long _MILLIS_PER_DAY = 24 * 60 * 60 * 1000;

		System.out.println("Micros: " + _MICROS_PER_DAY);// should be 86400,000,000
		System.out.println("Millis: " + _MILLIS_PER_DAY);// should be 86400,000

		final Long MICROS_PER_DAY = new Long(_MICROS_PER_DAY);
		final Long MILLIS_PER_DAY = new Long(_MILLIS_PER_DAY);

		System.out.println(Long.divideUnsigned(MICROS_PER_DAY, MILLIS_PER_DAY));
		assertAll("All verifications", () -> assertEquals(86400000000L, _MICROS_PER_DAY),
				() -> assertEquals(86400000L, _MILLIS_PER_DAY),
				() -> assertEquals(1000L, Long.divideUnsigned(MICROS_PER_DAY, MILLIS_PER_DAY)));

	}

	@Test
	public void solutionInTheBook() {
		System.out.println("Running solutionInTheBook");
		final long MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY = 24L * 60 * 60 * 1000;
		System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
		assertEquals(1000L, MICROS_PER_DAY / MILLIS_PER_DAY);

	}
}
