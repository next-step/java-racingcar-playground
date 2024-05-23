package racingCar.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;

public class Car {
    private static final int RANDOM_NO = 4;
    private CarName carName;
    private Position position;
    public Car(String name) {
        this.carName = new CarName(name);
        this.position = new Position();
    }

    public Position move(int randomNo) {
        position = position.stop();
        if (randomNo >= RANDOM_NO){
            position = position.move();
        }
        return position;
    }

    public CarName getCarName() {
        return carName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return position.equals(car.position) && carName.equals(car.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, position);
    }

}
