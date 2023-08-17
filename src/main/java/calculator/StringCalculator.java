package calculator;

import java.util.Arrays;

public class StringCalculator {
    public int operate(String exp) {
        exp = removeNullSpace(exp);
        if (exp.isEmpty()) {
            return 0;
        }

        int[] nums = parseNums(exp);

        return Arrays.stream(nums).sum();
    }

    private int[] parseNums(String exp) {
        String[] strNums = parseStrNums(exp);
        Arrays.stream(strNums).forEach(this::assertPositiveNum);

        return Arrays.stream(strNums)
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private String[] parseStrNums(String exp) {
        String delimiter = ",|:";
        if (exp.startsWith("//")) {
            delimiter = exp.split("\\\\n")[0].substring(2);
            exp = exp.substring(exp.indexOf("\\n") + "\\n".length());
        }
        if (exp.isEmpty()) {
            return new String[] { "0" };
        }

        return exp.split(delimiter);
    }

    private String removeNullSpace(String str) {
        if (str == null) {
            return "";
        }
        return str.trim();
    }

    private void assertPositiveNum(String str) {
        assertNum(str);
        assertPositive(str);
    }

    private void assertNum(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new RuntimeException();
        }
    }

    private void assertPositive(String parsableStr) {
        int num = Integer.parseInt(parsableStr);
        if (num < 0) {
            throw new RuntimeException();
        }
    }
}
