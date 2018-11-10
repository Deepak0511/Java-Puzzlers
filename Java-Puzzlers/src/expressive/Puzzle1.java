package expressive;

import org.junit.jupiter.api.Test;

class Puzzle1 {

	@Test
	void test() {
		// fail("Not yet implemented");
		for (int i = 1; i < 100; i++) {
			System.out.println("Ïnteger " + i);
			System.out.print(" " + isOdd(i));
			System.out.println();
		}
	}

	public static boolean isOdd(int i) {
		return i % 2 == 1;
	}

}
