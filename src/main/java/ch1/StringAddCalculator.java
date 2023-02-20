package ch1;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringAddCalculator {

    public static int splitAndSum(String input) {
        if (input == null || input == "") {
            return 0;
        }

        if (input.length() == 1) {
            return convertStringToInt(input);
        }

        String[] tokens = splitByDelimiter(input);

        List<Integer> nums = convertToIntList(tokens);

        if (!isAllPlusInt(nums)) {
            throw new RuntimeException("음수는 입력할 수 없습니다.");
        }

        return getListSum(nums);
    }

    private static String[] splitByDelimiter(String input) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(input);
        if (m.find()) {
            return m.group(2).split(m.group(1));
        }
        return input.split(",|:");
    }

    public static List<Integer> convertToIntList(String[] strings) {
        return Arrays.stream(strings)
            .map(StringAddCalculator::convertStringToInt)
            .collect(Collectors.toList());
    }

    private static boolean isAllPlusInt(List<Integer> nums) {
        return nums.stream().allMatch(num -> num > 0);
    }

    private static int getListSum(List<Integer> nums) {
        return nums.stream()
            .mapToInt(i -> i)
            .sum();
    }
    public static int convertStringToInt(String string) {
        try {
            return Integer.parseInt(string);
        } catch (NumberFormatException e) {
            throw new RuntimeException("숫자가 아닌 문자가 입력되었습니다.");
        }
    }
}
