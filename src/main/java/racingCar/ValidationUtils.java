package racingCar;

import racingCar.randomNumber.RandomNumber;

public class ValidationUtils {

    public static boolean hasComma(String input) {
        return input.contains(",");
    }

    public static boolean isLengthOver(String input) {
        return input.length() < 6;
    }

    public static boolean isPositiveNumber(int number) {
        return number > 0;
    }

}
