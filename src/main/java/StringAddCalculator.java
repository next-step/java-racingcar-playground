import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringAddCalculator {
    public static int splitAndSum(String s) {
        String[] tokens = new String[0];
        if(isNull(s)) return 0;

        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(s);
        // 지정된 구분자가 있을 경우
        if(m.find()) {
            String customDelimiter = m.group(1);
            tokens= m.group(2).split(customDelimiter);
        }

        // 구분자가 , 또는 : 일 경우
        if(!m.find() && s.contains(",") || s.contains(":")) {
            tokens = s.split(",|:");
        }

        // 숫자만 들어올 경우
        if(tokens.length == 0){
            return Integer.parseInt(s);
        }

        List<String> numList = arrayToList(tokens);
        if(containsNegative(numList)) throw new RuntimeException();

        return sum(numList);
    }
    public static List<String> arrayToList(String[] tokens) {
        return Arrays.stream(tokens).sorted().collect(Collectors.toList());
    }
    public static int sum(List<String> numList) {
        return numList.stream()
                .mapToInt(Integer::parseInt).sum();
    }
    public static boolean isNull(String text) {
        return (text == null) || (text.isEmpty());
    }
    // 메인 메소드
    public static boolean containsNegative(List<String> list) {
        return list.stream().mapToInt(Integer::parseInt).anyMatch(StringAddCalculator::isNegative);
    }

    // 음수인지 판별하는 메소드
    private static boolean isNegative(int number) {
        return number < 0;
    }

}
