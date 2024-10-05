package racingcarGame.utils;


// Car 객체 생성자 만들면서 필요 없어짐
public class Validation {
    public static boolean carNameValidator(String carName) {
        return carName.length() <= 5;
    }
}
