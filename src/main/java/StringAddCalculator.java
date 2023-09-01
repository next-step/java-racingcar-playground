import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

    public static int splitAndSum(String input) {
        if (isNullOrEmpty(input)) return 0;
        if (containsNegativeNumbers(input)) throw new RuntimeException();
        String[] tokens = splitInput(input);
        return calculateSum(tokens);
    }

    private static String[] splitInput(String input) {
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(input);
        if (matcher.find()) {
            String customDelimiter = matcher.group(1);
            return matcher.group(2).split(Pattern.quote(customDelimiter));
        }
        return commaColonSplit(input);
    }

    private static String[] commaColonSplit(String input) {
        return input.split(",|:");
    }

    private static int calculateSum(String[] tokens) {
        return Arrays.stream(tokens).mapToInt(Integer::parseInt).sum();
    }

    private static boolean isNullOrEmpty(String input) {
        return input == null || input.trim().isEmpty();
    }

    private static boolean containsNegativeNumbers(String input) {
        return input.contains("-") && Arrays.stream(splitInput(input)).anyMatch(s -> Integer.parseInt(s) < 0);
    }
}