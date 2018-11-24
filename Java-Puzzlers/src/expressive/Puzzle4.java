package expressive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import annotations.Puzzle;

public class Puzzle4 {

	@Test
	@Puzzle
	public void elementary() {
		//lol the el
		System.out.println(12345 + 5432l);
		assertEquals(66666, 12345 + 5432l);
	}
}
