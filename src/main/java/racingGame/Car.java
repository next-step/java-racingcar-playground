package racingGame;

import java.util.Random;

public class Car {

    private final int NAME_LIMIT_NUM = 5;

    private final String carName;

    public int line = 1;

    private final int FORWARD_NUM = 4;

    public Car(String carNm) {
        this.carName = limitCheck(carNm);
    }

    private String limitCheck(String carNm) {
        if (carNm.length() > NAME_LIMIT_NUM) {
            throw new RuntimeException();
        }
        return carNm;
    }

    public int play(int randomNum) {
        if (randomNum < FORWARD_NUM) {
            return line;
        }

        return line++;
    }
}
