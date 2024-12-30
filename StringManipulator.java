package w4;

public class StringManipulator {

    // a. Reverse the input string
    public String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

    // b. Convert input string to uppercase
    public String toUpperCase(String input) {
        if (input == null) return null;
        return input.toUpperCase();
    }

    // c. Check if the input string is a palindrome
    public boolean isPalindrome(String input) {
        if (input == null) return false;
        String reversed = reverse(input);
        return input.equals(reversed);
    }

    // d. Count the number of vowels in the input string
    public int countVowels(String input) {
        if (input == null) return 0;
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}

