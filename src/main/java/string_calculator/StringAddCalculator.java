package string_calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

    public static int splitAndSum(String s) {
        if (noInput(s)) return 0;
        if (isJustOneInt(s)) return convertToInt(s);
        s = replaceColon(s);
        return calculateByRest(s);
    }

    private static boolean noInput(String s) {
        return s == null || s.isEmpty();
    }

    private static String replaceColon(String s){
        return s.replaceAll(":", ",");
    }
    private static String splitByPattern(String s){
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(s);
        if (m.find()) {
            String customDelimiter = m.group(1);
            return m.group(2).replaceAll(customDelimiter, ",");
        }
        return null;
    }
    private static int calculateByRest(String s){
        String[] split = s.split(",");
        int sum = 0;
        for (String s1 : split) {
            sum +=convertToInt(s1);
        }
        return sum;
    }

    private static boolean isJustOneInt(String s) {
        return s.length() == 1;
    }

    private static int convertToInt(String s){
        return Integer.parseInt(s);
    }
}
