package domain;

import java.util.Objects;

public class RacingCar {

    private final String carName;
    private final Position position;

    public RacingCar(String carName) {
        this(carName, new Position());
    }
    public RacingCar(String carName, Position position) {
        this.carName = carName;
        this.position = position;
    }

    public Position move(int randomNumber) {
        return randomNumber >= 4 ? position.move() : position;
    }

    public String getCarName() {
        return carName;
    }

    public Position getPosition() {
        return position;
    }

    public boolean isMaxPosition(Position maxPosition) {
        return position.equals(maxPosition);
    }

    public Position findBiggerPosition(Position maxPosition) {
        return position.compare(maxPosition);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RacingCar racingCar = (RacingCar) o;
        return Objects.equals(carName, racingCar.carName) && Objects.equals(
            getPosition(), racingCar.getPosition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, getPosition());
    }
}
