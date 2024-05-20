package calculator;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Calculator {
    public static final String REGEX_COMMA_COLON = ",|:";
    public static final String REGEX_CUSTOM = "//(.)\\n(.*)";
    private String input;

    public Calculator(){}

    public Calculator(String input) {
        this.input = input;
        if (isNullOrEmpty()){
            this.input = "0";
        }
    }

    private boolean isNullOrEmpty() {
        return input == null || input.isEmpty();
    }

    public String[] removeSeparator() {
        return input.split(REGEX_COMMA_COLON);
    }


    public String[] remove() {
        Matcher matcher = Pattern.compile(REGEX_CUSTOM).matcher(input);
        if (matcher.find()){
            String customDelimiter = matcher.group(1);
            return matcher.group(2).split(customDelimiter);
        }
        return removeSeparator();
    }

    public int sum(String[] values) {
        try{
            return Arrays.stream(values)
                    .mapToInt(Integer::parseInt)
                    .filter(value -> {
                        isZeroLess(value);
                        return true;
                    }).sum();
        }catch (RuntimeException e){
            throw new RuntimeException("문자열 이외의 값 또는 음수가 포함되어 있습니다.");
        }
    }

    private void isZeroLess(int value) {
        if (value < 0)
            throw new RuntimeException("문자열 이외의 값 또는 음수가 포함되어 있습니다.");
    }
}
