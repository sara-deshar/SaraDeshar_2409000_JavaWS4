package w4;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {

    public static List<Integer> getEvenNumbers(int[] numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        if (numbers != null) {
            for (int number : numbers) {
                if (number % 2 == 0) {
                    evenNumbers.add(number);
                }
            }
        }
        return evenNumbers;
    }
}

