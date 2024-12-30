package w4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringManipulatorTest {

    @Test
    public void testStringManipulatorMethods() {
        StringManipulator manipulator = new StringManipulator();

        // Test data
        String input = "madam";
        String nonPalindromeInput = "hello";

        // Assertions
        assertAll(
            // Test reverse
            () -> assertEquals("madam", manipulator.reverse(input), "Reversed string should match."),
            () -> assertEquals("olleh", manipulator.reverse(nonPalindromeInput), "Reversed string should match for non-palindrome."),

            // Test toUpperCase
            () -> assertEquals("MADAM", manipulator.toUpperCase(input), "Uppercase string should match."),
            () -> assertEquals("HELLO", manipulator.toUpperCase(nonPalindromeInput), "Uppercase string should match for non-palindrome."),

            // Test isPalindrome
            () -> assertTrue(manipulator.isPalindrome(input), "The string should be a palindrome."),
            () -> assertFalse(manipulator.isPalindrome(nonPalindromeInput), "The string should not be a palindrome."),

            // Test countVowels
            () -> assertEquals(2, manipulator.countVowels(input), "Vowel count should match."),
            () -> assertEquals(2, manipulator.countVowels(nonPalindromeInput), "Vowel count should match for non-palindrome.")
        );
    }
}


