package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
    public int splitAndSum(String text) {
        int result = 0;

        if (text == null || text.isEmpty()) {
            return 0;
        }

        if (text.length() == 1) {
            return Integer.parseInt(text);
        }

        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(text);
        String regex = "[,:]";

        if (matcher.find()) {
            regex += "|" + matcher.group(1);
            text = matcher.group(2);
        }

        String[] arr = text.split(regex);

        for (String str : arr) {
            int num = Integer.parseInt(str);

            if (num < 0) {
                throw new RuntimeException();
            }

            result += num;
        }

        return result;
    }
}
