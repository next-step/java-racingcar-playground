package utils;

import java.util.regex.Pattern;

public class NameUtil {

    private static final int NAME_MAX_LENGTH = 5;
    private static final Pattern SPLIT_PATTERN = Pattern.compile("^,.*|.*,$");

    public static String validation(String text) {
        if (text == null || text.trim().isEmpty()) {
            throw new IllegalArgumentException("잘못된 이름입니다. 다시 입력해주세요.");
        }

        final String name = text.trim();

        if (name.length() > NAME_MAX_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 " + NAME_MAX_LENGTH + "글자를 초과할 수 없습니다. 다시 입력해주세요.");
        }

        return name;
    }

    public static String[] split(String text) {
        if (text == null || text.trim().isEmpty()) {
            throw new IllegalArgumentException("잘못된 입력입니다. 다시 입력해주세요.");
        }

        final String input = text.trim();

        if (SPLIT_PATTERN.matcher(input).matches()) {
            throw new IllegalArgumentException("자동차 이름은 쉼표(,)를 기준으로 구분합니다. 다시 입력해주세요.");
        }

        return input.split(",");
    }
}
