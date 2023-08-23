package racingGame;

import java.util.Random;

public class Car {

    private final CarNameLimit car;

    private int line = 0;

    private final int GO_NUM = 4;


    public Car(String carNm) {
        this.car = new CarNameLimit(carNm);
    }

    public void goStop() {
        if (getRandomNum() >= GO_NUM) {
            this.line += 1;
        }

    }

    public int getRandomNum() {
        Random random = new Random();

        int randomNumber = random.nextInt(9);

        return randomNumber;
    }

}
