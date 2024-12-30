package w4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();
 
    @Test
    public void testAddPositiveNumbers() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
    }

    @Test
    public void testAddPositiveAndNegative() {
        assertEquals(1, calculator.add(4, -3), "4 + (-3) should equal 1");
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-5, calculator.add(-2, -3), "-2 + (-3) should equal -5");
    }
 
    @Test
    public void testAddWithZero() {
        assertEquals(0, calculator.add(0, 0), "0 + 0 should equal 0");
        assertEquals(3, calculator.add(3, 0), "3 + 0 should equal 3");
    }
 
    @Test
    public void testAddLargeNumbers() {
        assertEquals(1000000000, calculator.add(500000000, 500000000), "500000000 + 500000000 should equal 1000000000");
    }
}

