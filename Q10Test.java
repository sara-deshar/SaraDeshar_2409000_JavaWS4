package w4;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class Q10Test {

    private Q10 calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Q10();
        System.out.println("Q10 object initialized.");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Test completed, resetting state.");
    }

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Starting Q10 tests...");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("All Q10 tests completed.");
    }

    @Test
    public void testAddition() {
        assertEquals(5.0, calculator.add(2.0, 3.0), "2 + 3 should equal 5");
    }

    @Test
    public void testSubtraction() {
        assertEquals(1.0, calculator.subtract(3.0, 2.0), "3 - 2 should equal 1");
    }

    @Test
    public void testMultiplication() {
        assertEquals(6.0, calculator.multiply(2.0, 3.0), "2 * 3 should equal 6");
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calculator.divide(6.0, 3.0), "6 / 3 should equal 2");
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(1.0, 0), "Division by zero should throw an exception.");
    }
}

