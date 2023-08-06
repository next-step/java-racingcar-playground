package stringCalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
    public static int splitAndSum(String value) {
        if (value == null || value.isEmpty()) {
            return 0;
        }

        if (value.contains(",") || value.contains(":")) {
            String[] values = value.split(",|:");

            int sum = 0;
            for (String number : values) {

                if (Integer.parseInt(number) < 0) {
                    throw new RuntimeException();
                }

                sum += Integer.parseInt(number);
            }

            return sum;
        }

        if (value.contains("//") || value.contains("\n")) {
            // java.util.regex 패키지의 Matcher, Pattern import
            Matcher m = Pattern.compile("//(.)\n(.*)").matcher(value);
            if (m.find()) {
                String customDelimiter = m.group(1);
                String[] values = m.group(2).split(customDelimiter);

                int sum = 0;
                for (String number : values) {
                    sum += Integer.parseInt(number);
                }

                return sum;
            }
        }

        return Integer.parseInt(value);
    }
}
