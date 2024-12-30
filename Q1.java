package w4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Q1 {

	@Test
	void test() {
		int num1 = 5;
		int num2 = 10;
		int expectedSum = 15;
		
		int actualSum = num1 + num2;
				
		assertEquals(expectedSum, actualSum);
	}

}

