package calculator;

/**
 * 새로 알게된 점
 * 1. 개행문자(\n)의 \는 2개 적어주어야 한다. ex) "\\n"
 * 2. 몇몇 문자(+,^,*)는 코드 상 의미를 가지기 때문에 "//"를 붙여줘야 한다.
 */
public class Separator {
    private static final String CUSTOM_REGEX_PREFIX = "//";
    private static final String CUSTOM_REGEX_SUFFIX = "\n";
    public String[] separate(String input) {
        String regex = ",|:";
        if (input.startsWith(CUSTOM_REGEX_PREFIX)) {
            regex = getCustomSeparator(input);
            input = deleteRegex(input, regex);
        }
        if (hasRegexMeaning(regex)) {
            regex = "\\"+ regex;
        }
        return input.split(regex);
    }
    // 의미있는 구분자를 사용하는가? (+, ^, *)
    private boolean hasRegexMeaning(String regex) {
        return "+^*".contains(regex);
    }

    //  "//*\n1*2*3"
    private String deleteRegex(String input, String regex) {
        int total = CUSTOM_REGEX_PREFIX.length() + CUSTOM_REGEX_SUFFIX.length() + regex.length();
        return input.substring(total);
    }
    private String getCustomSeparator(String inputWithCustomRegex) {
        for (int i=2; i< inputWithCustomRegex.length()-1; i++) {
            String tmp = inputWithCustomRegex.substring(i, i + 1);  // substring(a,b) : a부터 b 위치 포함 값까지
            if (CUSTOM_REGEX_SUFFIX.equals(tmp)) {
                return inputWithCustomRegex.substring(2, i);
            }
        }
        throw new RuntimeException("알맞은 구분자가 아닙니다.");
    }
}
