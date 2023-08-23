package racingGame;

public class CarNameLimit {

    private final int NAME_LIMIT_NUM = 5;

    private final String carName;

    public CarNameLimit(String carNm) {
        if (carNm.length() > NAME_LIMIT_NUM) {
            throw new RuntimeException();
        }

        this.carName = carNm;
    }
}
