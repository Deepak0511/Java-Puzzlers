package expressive;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import annotations.Puzzle;

public class Puzzle6 {
	
	
	/**
	 * -1 is an int.
	 * Byte has capacity to store 8 bits. if one bit is used to represent sign,
	 * it is left with 7 bits, so the maximum value can be 1 111 1111 which will
	 * give us +/- 128. Thus it can represent -127 to 128 including 0.
	 * 
	 * Conversion:
	 * -1 to byte = -1
	 * -1 to char = will be some char, lets find out in another test.
	 */
	@Puzzle
	@Test
	@Disabled
	public void multicast() {
		System.out.println((int) (char) (byte) -1);
	}
	
	/**
	 * So it prints a ? mark character. So now if this char is converted to
	 * integer, it will give us a different value. which I can't guess exactly but
	 * it will not be -1.
	 */
	@Test
	public void testByte2Char() {
		System.out.println("running testByte2Char()");
		byte b = -1;
		char c = (char) b;
		System.out.println(c);
		int i = c;
		System.out.println(i);
	}

	/**
	 * Lessons:
	 * Rule: Sign extension is performed if the type of the original value is signed;zero extension
	 * if it is a char, regardless of the type to which it is being converted.
	 * 
	 * here -1 byte is being converted to 2ˆ16 -1, because all 16 bits of the char is set due
	 * to sign extension via rule above.
	 */
	
	/**
	 * How to avoid sign extension while converting to a wider type.
	 */
	@Test
	public void howToAvoidSignExtension() {
		System.out.println("running howToAvoidSignExtension()");
		char c = 'a';
		int i = c & 0xffff;//bit mask
		/*or*/
		int j = c; //Sign extension is not performed.
		
		System.out.println(i);
		System.out.println(j);
	}
	
	/**
	 * attaining Sign extension.
	 * short has same width as char but its signed.
	 */
	@Test
	public void attainSignExtension() {
		
		System.out.println("running attainSignExtension");
		char c = '￿';
		int i = (short) c; // cast causes sign extension.
		System.out.println(i);
		
	}
	
	/**
	 * Suppressing sign extension of byte to char conversion.
	 */
	@Test
	public void suppressSignExt() {
		System.out.println("running suppressSignExt");
		byte b = -1;
		char c = (char) (b & 0xff);
		System.out.println(c);
	}
	
	/**
	 * keeping sign extension
	 */
	@Test
	public void keepSignExt() {
		System.out.println("keep sign ext");
		byte b = -1;
		char c = (char) b;
		System.out.println(c);
	}
	
	
	
}
