package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
    public static int splitAndSum(String text) {

        if (isNullOrEmpty(text)) {
            return 0;
        }

        if (isSingleNumber(text)) {
            return Integer.parseInt(text);
        }

        int sum = 0;
        String[] nums = getStringNumbers(text);
        for (String num : nums) {
            sum += Integer.parseInt(num);
        }

        return sum;
    }

    private static String[] getStringNumbers(String text) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (m.find()) {
            return splitText(m.group(2));
        }

        return splitText(text);
    }

    private static String[] splitText(String text) {
        return text.split(",|;|:");
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
