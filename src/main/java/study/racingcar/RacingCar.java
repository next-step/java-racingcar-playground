package study.racingcar;

public class RacingCar {

    private String name;
    private int moveCnt;

    public static RacingCar create(String racingCarName) {
        RacingCar racingCar = new RacingCar();
        racingCar.name = racingCarName;
        racingCar.moveCnt = 0;
        return racingCar;
    }

    public void move() {
        int randomNumber = (int) (Math.random() * 10);
        if (randomNumber >= 4) {
            moveCnt++;
        }
    }
}
