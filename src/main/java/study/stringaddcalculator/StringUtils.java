package study.stringaddcalculator;

/**
 * 설명:
 *
 * @author 최현범(Jayce) / hb.choi@dreamus.io
 * @since 2022/11/18
 */
public class StringUtils {

    private StringUtils() {}

    /**
     * 문자열에 대한 Null 또는 빈 문자열 체크
     * @param str 문자열로 예상되는 Object
     */
    public static boolean isEmpty(Object str) {
        return str == null || "".equals(str);
    }

    /**
     * 문자열이 숫자인지 체크
     * @param str
     */
    public static boolean isNumeric(String str) {

        if (str == null) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
