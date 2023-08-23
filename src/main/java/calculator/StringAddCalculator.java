package calculator;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

    public int splitAndSum(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        Integer tokens = getNewPattern(text);
        if (tokens != null) {
            return tokens;
        }

        String[] numbers = text.split("[,:]");
        return getSum(numbers);
    }

    private Integer getNewPattern(String text) {
        Matcher m = Pattern.compile("//(.)\n(.*)")
                .matcher(text);

        if (m.find()) {
            String customDelimiter = m.group(1);

            return getSum(m.group(2)
                    .split(customDelimiter));
        }

        return null;
    }

    private int getSum(String[] numbers) {
        if (minusCheck(numbers)) {
            throw new RuntimeException();
        }

        return Arrays.stream(numbers)
                .mapToInt(Integer::parseInt)
                .sum();
    }

    private boolean minusCheck(String[] numbers) {

        return Arrays.stream(numbers)
                .mapToInt(Integer::parseInt)
                .anyMatch(number -> number < 0);

    }


}
