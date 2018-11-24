package expressive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import annotations.Puzzle;

public class Puzzle5 {

	@Puzzle
	@Test
	public void joyOfHex() {
		System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));
		assertEquals("1cafebabe",Long.toHexString(0x100000000L + 0xcafebabe));

	}
	
	/**
	 * mixed type computation,cafebabe is negative in int hex representation
	 */
	@Test
	public void fixInTheBook() {
		System.out.println(Long.toHexString(0x100000000L + 0xcafebabeL));
		assertEquals("1cafebabe",Long.toHexString(0x100000000L + 0xcafebabeL));

	}
}
