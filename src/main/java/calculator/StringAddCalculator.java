package calculator;

import java.util.Arrays;

public class StringAddCalculator {

    public static int splitAndSum(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] numbers = text.split("[,:]");

        int result = getSum(numbers);


        return result;
    }

    private static int getSum(String[] numbers) {
        return Arrays.stream(numbers)
                .mapToInt(Integer::parseInt)
                .sum();
    }


}
