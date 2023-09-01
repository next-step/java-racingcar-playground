package study.racingcar;

public class CarNameValidator {


    public boolean validCarName(String carName) {
        return carName.length() <= 5;
    }
}
