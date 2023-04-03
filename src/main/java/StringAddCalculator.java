import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
    public static boolean isValidationCheckNullOrEmpty(String str) {
            return str == null || str.isEmpty();
        }

    public static boolean isValidationCheckSize1(String str) {
        return str.length() == 1;
    }

    private static int standardStringAddCalculator(String text) {
        String[] numbers = text.split(",|:");
        if(Arrays.toString(numbers).contains("-")){
            throw new RuntimeException();
        }
        return Arrays.stream(numbers).mapToInt(Integer::parseInt).sum();
    }

    private static Integer customDelimiterAddCalculator(String str) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(str);
        if (m.find()) {
            String customDelimiter = m.group(1);
            String[] numbers = m.group(2).split(customDelimiter);

            return Arrays.stream(numbers).mapToInt(Integer::parseInt).sum();
        }
        return null;
    }

    public static int splitAndSum(String str) {
        if(isValidationCheckNullOrEmpty(str)) return 0;
        if(isValidationCheckSize1(str)) return Integer.parseInt(str);

        try{ return standardStringAddCalculator(str);}
        catch (NumberFormatException numberFormatException){
        return customDelimiterAddCalculator(str);
        }

    }
}
