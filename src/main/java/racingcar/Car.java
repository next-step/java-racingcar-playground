package racingcar;

import java.util.Objects;

public class Car {
    private static final int FORWARD_NUM = 4;

    private final Name name;
    private Position position;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public Name getName() {
        return name;
    }

    public void forward(int randomNo) {
        if (randomNo >= FORWARD_NUM) {
            position.move();
        }
    }

    public Position getMaxPosition(Position maxPosition) {
        if (position.lessThan(maxPosition)) {
            return maxPosition;
        }
        return position;
    }

    public boolean isWinner(Position maxPosition) {
        return position.equals(maxPosition);
    }

    @Override
    public String toString() {
        return name.toString() + " : " + position.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(position, car.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
