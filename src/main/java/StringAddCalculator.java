import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringAddCalculator {
    public static int calculate(final String stringExpression) {
        if(checkNullOrEmpty(stringExpression)) return 0;

        String customSeparator = checkCustomSeparator(stringExpression);
        String replace = removeCustomSeparator(stringExpression);
        String[] splitStringNumber = splitStringExpression(replace, customSeparator);

        checkAnotherCharacter(splitStringNumber);

        return getSumOfNumber(splitStringNumber);
    }

    private static String removeCustomSeparator(String stringExpression) {
        String replace = stringExpression.replaceAll("//(.)\\\\n", "");
        return replace;
    }

    private static int getSumOfNumber(final String[] splitStringNumber) {
        List<Integer> numberList = Arrays.stream(splitStringNumber)
                .map(Integer::new)
                .collect(Collectors.toList());

        int sum = 0;
        for (Integer integer : numberList) {
            if(integer < 0) throw new IllegalArgumentException("음수는 입력이 불가능합니다");
            sum += integer;
        }
        return sum;
    }

    private static String checkCustomSeparator(final String stringExpression) {
        Matcher m = Pattern.compile("//(.)\\\\n(.*)").matcher(stringExpression);
        if (m.find()) {
            return m.group(1);
        }
        return "";
    }

    private static boolean checkNullOrEmpty(final String stringExpression) {
        return stringExpression == null || stringExpression.isEmpty();
    }


    private static String[] splitStringExpression(final String stringExpression, final String customSeparator) {

        StringBuilder regax = new StringBuilder(",|:");

        if(!customSeparator.isEmpty()){
            regax.append("|").append(customSeparator);
        }
        return stringExpression.split(regax.toString());
    }

    private static void checkAnotherCharacter(final String[] splitStringNumber){
        try {
            tryParseInt(splitStringNumber);
        } catch (NumberFormatException e){
            throw new IllegalArgumentException("숫자만 입력하여 주십시오");
        }
    }

    private static void tryParseInt(final String[] splitStringNumber) throws NumberFormatException{
        for (String stringNumber : splitStringNumber) {
            Integer.parseInt(stringNumber);
        }
    }
}
