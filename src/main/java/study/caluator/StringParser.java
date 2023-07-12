package study.caluator;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringParser {

    /**
     * “//”와 “\n” 사이 문자가 REGEX
     */
    public String[] customRegexParse(String input) {
        String[] regex = new String[0];
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(input);
        if (m.find()) {
            String customDelimiter = m.group(1);
            regex = m.group(2).split(customDelimiter);
        }
        System.out.println(Arrays.toString(regex));
        return regex;
    }

    public String[] parse(String input) {
        return input.split("[:,]");
    }

    public void processMinusValue(String[] parsedInput) {

        for (String s : parsedInput) {
            if (s.startsWith("-")) {
                throw new RuntimeException("음수 발생!");
            }
        }

    }
}
