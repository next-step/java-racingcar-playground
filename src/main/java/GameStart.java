import java.util.Arrays;
import java.util.Scanner;

public class GameStart {
    public static boolean validate(String input) {
        if(input.length() > 5) return false;
        return true;
    }

    public String[] input(String s) {
        String[] split = s.split(",");
        Arrays.stream(split)
                .filter(x->validate(x))
                .findAny()
                .orElseThrow(()-> new IllegalArgumentException("5 글자 미만이어야합니다."));
        return split;
    }
}
