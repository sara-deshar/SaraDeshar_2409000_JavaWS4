package w4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class NumberUtilsTest {

    @Test
    public void testGetEvenNumbers() {
        int[] input = {1, 2, 3, 4, 5, 6};
        List<Integer> expectedOutput = Arrays.asList(2, 4, 6);

        List<Integer> actualOutput = NumberUtils.getEvenNumbers(input);

        assertEquals(expectedOutput, actualOutput, "The method should return [2, 4, 6] for input [1, 2, 3, 4, 5, 6]");
    }

    @Test
    public void testGetEvenNumbersEmptyArray() {
        int[] input = {};
        List<Integer> expectedOutput = Arrays.asList();

        List<Integer> actualOutput = NumberUtils.getEvenNumbers(input);

        assertEquals(expectedOutput, actualOutput, "The method should return an empty list for an empty input array");
    }

    @Test
    public void testGetEvenNumbersAllOdd() {
        int[] input = {1, 3, 5, 7};
        List<Integer> expectedOutput = Arrays.asList();

        List<Integer> actualOutput = NumberUtils.getEvenNumbers(input);

        assertEquals(expectedOutput, actualOutput, "The method should return an empty list for an array with all odd numbers");
    }

    @Test
    public void testGetEvenNumbersNullInput() {
        int[] input = null;
        List<Integer> expectedOutput = Arrays.asList();

        List<Integer> actualOutput = NumberUtils.getEvenNumbers(input);

        assertEquals(expectedOutput, actualOutput, "The method should return an empty list for a null input array");
    }
}

