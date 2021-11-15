package stringaddcalculator;

import java.util.Arrays;

public class StringAddCalculator {

    public static int splitAndSum(String input) {
        if (input == null || input.equals("")) {
            return 0;
        }
        int result = getResult(input);
        return result;
    }

    private static int getResult(String input) {

        String replaceCharacter = getReplaceCharacter(input);

        return Arrays.stream(input.split(replaceCharacter))
                .mapToInt(Integer::parseInt).sum();
    }

    private static String getReplaceCharacter(String input) {
        if (input.contains(",")) {
            return ",";
        }
        if (input.contains(";")) {
            return ";";
        }
        return "";
    }
}
