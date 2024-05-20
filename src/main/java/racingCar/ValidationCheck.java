package racingCar;

public class ValidationCheck {

    public static final int MAX_NO = 5;

    public static boolean isFiveLessThan(String input) {
        return input.isEmpty() || input.length() >= MAX_NO;
    }
}
