package racingGame;

import java.util.Random;

public class Car {

    private final int NAME_LIMIT_NUM = 5;

    private final String carName;

    private int line = 0;

    private final int GO_NUM = 4;

    public Car(String carNm) {
        this.carName = limitCheck(carNm);
    }

    private String limitCheck(String carNm) {
        if (carNm.length() > NAME_LIMIT_NUM) {
            throw new RuntimeException();
        }
        return carNm;
    }

    public void goCar() {
        if (stopPlayCheck(getRandomNum()) == CarStatus.PLAY) {
            this.line += 1;
        }
    }

    public CarStatus stopPlayCheck(int randomNum) {

        if (randomNum < GO_NUM) {
            return CarStatus.STOP;
        }

        return CarStatus.PLAY;
    }

    public int getRandomNum() {
        Random random = new Random();

        int randomNumber = random.nextInt(10);

        return randomNumber;
    }

}
