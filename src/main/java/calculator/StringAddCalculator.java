package calculator;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringAddCalculator {
    public static int splitAndSum(String text) {

        if (isNullOrEmpty(text)) {
            return 0;
        }

        if (isSingleNumber(text)) {
            return Integer.parseInt(text);
        }

        int sum = 0;
        List<Integer> nums = getStringNumbers(text);
        for (Integer num : nums) {
            sum += num;
        }

        return sum;
    }

    private static List<Integer> getStringNumbers(String text) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (m.find()) {
            return splitText(m.group(2));
        }

        return splitText(text);
    }

    private static List<Integer> splitText(String text) {
        return Arrays.stream(text.split(",|;|:"))
                    .map(num -> {
                        int n = Integer.parseInt(num);
                        if (n < 0) {
                            throw new RuntimeException();
                        }

                        return n;
                    })
                    .collect(Collectors.toList());
    }

    private static boolean isSingleNumber(String text) {
        return text.length() == 1;
    }

    private static boolean isNullOrEmpty(String text) {
        if (text == null || text.isEmpty()) {
            return true;
        }

        return false;
    }
}
