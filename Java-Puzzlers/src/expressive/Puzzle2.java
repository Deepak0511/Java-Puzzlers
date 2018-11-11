package expressive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import annotations.Puzzle;

/**
 * 
 * Not all decimals can be represented exactly using
 * binary floating point.
 *
 */
public class Puzzle2 {

	@Test
	@Puzzle
	public void Change() {
		// Assumption:0.9
		System.out.println("Testing Puzzle");
		System.out.println(2.00 - 1.10);
		assertEquals(0.9, 2.00 - 1.10);

	}

	@Test
	public void ChangeFix() {
		System.out.println("Testing ChangeFix");
		System.out.println(2.00d - 1.10d);
		assertEquals(0.9, 2.00d - 1.10d);

	}

	@Test
	public void fixFloat() {
		//Passes the test
		System.out.println("Testing fixFloat");
		float cost_f = 1.10f;
		float note_f = 2.00f;
		System.out.println(note_f - cost_f);
		assertEquals(0.9f, note_f - cost_f);
	}

	@Test
	public void fixDouble() {
		System.out.println("Testing fixDouble");
		double cost = 1.10;
		double note = 2.00;
		System.out.println(note - cost);
		assertEquals(0.9, note - cost);
	}

	@Test
	public void fixDouble_d() {
		System.out.println("Testing fixDouble_d");
		double cost = 1.10d;
		double note = 2.00d;
		System.out.println(note - cost);
		assertEquals(0.9, note - cost);
	}

	@Test
	public void fixDoubleClass() {
		System.out.println("Testing fixDoubleClass");
		Double cost = 1.10d;
		Double note = 2.00d;
		System.out.println(note - cost);
		assertEquals(0.9, note - cost);
	}

	@Test
	public void fixBigDecimal() {
		System.out.println("Testing fixBigDecimal");
		BigDecimal cost = new BigDecimal(1.10);
		BigDecimal note = new BigDecimal(2.00);

		System.out.println(note.subtract(cost));
		System.out.println(note.subtract(cost).doubleValue());
		assertEquals(0.9, note.subtract(cost).doubleValue());
	}
	
	
	@Test
	public void fixBigDecimalString() {
		System.out.println("Testing fixBigDecimalString");
		BigDecimal cost = new BigDecimal("1.10");
		BigDecimal note = new BigDecimal("2.00");

		System.out.println(note.subtract(cost));
		System.out.println(note.subtract(cost).doubleValue());
		assertEquals(0.9, note.subtract(cost).doubleValue());
	}
}
