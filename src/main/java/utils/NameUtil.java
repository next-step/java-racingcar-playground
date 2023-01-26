package utils;

import java.util.regex.Pattern;

import static utils.constants.ErrorConstant.*;

public class NameUtil {

    public static final int NAME_MAX_LENGTH = 5;
    private static final Pattern SPLIT_PATTERN = Pattern.compile("^,.*|.*,$");

    public static String validation(final String text) {
        checkNullAndEmpty(text, INVALID_CAR_NAME);

        final String name = text.trim();

        if (name.length() > NAME_MAX_LENGTH) {
            throw new IllegalArgumentException(CAR_NAME_MORE_THEN_MAX_LENGTH);
        }

        return name;
    }

    public static String[] split(final String text) {
        checkNullAndEmpty(text, INVALID_INPUT);

        final String input = text.trim();

        if (SPLIT_PATTERN.matcher(input).matches()) {
            throw new IllegalArgumentException(INVALID_COMMA_LOCATION);
        }

        return input.split(",");
    }

    private static void checkNullAndEmpty(final String text, final String errMsg) {
        if (text == null || text.trim().isEmpty()) {
            throw new IllegalArgumentException(errMsg);
        }
    }
}
