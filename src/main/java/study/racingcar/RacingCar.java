package study.racingcar;

public class RacingCar {

    private String name;
    private int moveCnt;
    private CarMoveValidator carMoveValidator;

    public static RacingCar create(String racingCarName) {
        RacingCar racingCar = new RacingCar();
        racingCar.name = racingCarName;
        racingCar.moveCnt = 0;
        racingCar.carMoveValidator = new CarMoveValidator();
        return racingCar;
    }

    public void move(int randomNumber) {
        if (carMoveValidator.validMove(randomNumber)) {
            moveCnt++;
        }
    }

    public String getName() {
        return name;
    }

    public int getMoveCnt() {
        return moveCnt;
    }
}
