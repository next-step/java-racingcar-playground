package first;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
    public static int add(String input) {
        if (isEmpty(input)) {
            return 0;
        }
        return getResult(toNumberList(parseInput(input)));
    }

    private static boolean isEmpty(String input) {
        return input == null || input.equals("");
    }

    private static String[] parseInput(String input) {
        Matcher matcher = Pattern.compile("//(.+)\n(.+)").matcher(input);
        if (matcher.find()) {
            return matcher.group(2).split(matcher.group(1));
        }
        return input.split("[,;]");
    }

    private static List<Number> toNumberList(String[] inputs) {
        List<Number> numbers = new ArrayList<>();
        for (String input : inputs) {
            numbers.add(new Number(input));
        }
        return numbers;
    }
    
    private static int getResult(List<Number> numbers) {
        int result = 0;
        for (Number number : numbers) {
            result += number.getNumber();
        }
        return result;
    }
}
