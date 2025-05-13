package racingCar;

import racingCar.randomNumber.DefaultRandomNumberGenerator;
import racingCar.randomNumber.RandomNumber;

public class Car {

    private final String name;
    private int distance;

    private final RandomNumber rdn = new DefaultRandomNumberGenerator();

    public Car(String carName) {

        if (!ValidationUtils.isLengthOver(carName)) {
            throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다.");
        }

        this.name = carName;
        this.distance = 0;
    }

    public boolean canMove() {
        return rdn.generate() >= 4;
    }

    public void move() {
        distance++;
    }

    public String getCarName() {
        return name;
    }

    public int getMovedDistance() {
        return distance;
    }

    public String getPositionVisual() {
        return "-".repeat(distance);
    }

}
