package StringCalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
    public static int splitAndSum(String inputNumbers) throws RuntimeException {
        if(isNullorEmpty(inputNumbers)) {return 0;}
        if(inputNumbers.contains("-")) {throw new RuntimeException(); }
        if(inputNumbers.length() == 1) {return parseInputNumber(inputNumbers);}
        if(inputNumbers.contains("//")) {return sum(splitByCustomPattern(inputNumbers));}
        String[] numberArray = inputNumbers.split(",|:");
        return sum(numberArray);
    }
    private static int parseInputNumber(String inputNumbers) throws RuntimeException {
        return Integer.parseInt(inputNumbers);
    }
    private static boolean isNullorEmpty (String inputNumbers) {
        return inputNumbers == null || inputNumbers.equals("");
    }

    private static int sum (String[] numberArray) {
        int sum=0;
        for (String number : numberArray) {
            sum += parseInputNumber(number);
        }
        return sum;
    }

    private static String[] splitByCustomPattern (String inputNumbers) {
        Matcher match = Pattern.compile("//(.)\n(.*)").matcher(inputNumbers);
        String [] numberArray = new String[3];
        if (match.find()) {
            numberArray = match.group(2).split(match.group(1));
        }
        return numberArray;
    }
}
