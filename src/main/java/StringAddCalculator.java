import java.util.Arrays;

public class StringAddCalculator {
    public static int splitAndSum(String  o) {
        if (isNullOrEmpty(o)) return 0;
        if(isCustom(o)) return customSplit(o);
        if(isOneNumber(o)) return Integer.parseInt(o);
        NegativeCheck(SplitNumber(o, ",|:"));
        return Sum(SplitNumber(o, ",|:"));
    }

    private static String[] SplitNumber(String o, String s) {
        return o.split(s);
    }

    private static boolean isNullOrEmpty(String o) {
        return o == null || o.isEmpty();
    }

    private static boolean isCustom(String o) {
        return o.contains("\n");
    }

    private static boolean isOneNumber(String o) {
        return o.length() == 1;
    }

    private static void NegativeCheck(String[] splitNumber) {
        if (isNegative(splitNumber)) throw new RuntimeException();
    }

    private static boolean isNegative(String[] splitNumber) {
        return Arrays.stream(splitNumber).mapToInt(a -> Integer.parseInt(a)).anyMatch(t -> t < 0);
    }

    private static int customSplit(String o) {
        String[] custom = SplitNumber(o.substring(2), "\n");
        NegativeCheck(SplitNumber(custom[1], custom[0]));
        return Sum(SplitNumber(custom[1], custom[0]));
    }

    private static int Sum(String[] splitNumber) {
        return Arrays.stream(splitNumber).mapToInt(a -> Integer.parseInt(a)).sum();
    }
}
