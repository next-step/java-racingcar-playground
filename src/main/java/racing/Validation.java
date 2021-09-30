package racing;

public class Validation {

    public static final int NAME_SIZE = 6;

    public static void CheckName(String name) {
        ValidationName(name == null, "잘못된 이름 입니다 다시 입력 해 주세요");
        ValidationName(name.isEmpty() || name.isBlank(), "잘못된 이름 입니다 다시 입력 해 주세요");
        ValidationName(name.length() >= NAME_SIZE, "이름이 6글자 이상입니다. : "+name);
    }


    private static void ValidationName(boolean b, String s) {
        if (b) throw new IllegalArgumentException(s);
    }
}
