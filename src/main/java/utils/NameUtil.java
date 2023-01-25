package utils;

public class NameUtil {

    private static final int NAME_MAX_LENGTH = 5;

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
}
