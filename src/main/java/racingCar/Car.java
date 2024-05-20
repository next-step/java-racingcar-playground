package racingCar;

import java.util.Objects;
import java.util.Random;

public class Car {

    public static final int MAX_NO = 4;
    private final CarName carName;
    private CarPosition carPosition;

    public Car(String name) {
        this.carName = new CarName(name);
        Random random = new Random();
        carPosition = new CarPosition();
    }

    public int process(int randomNumber) {
        if (isMoreThanFour(randomNumber)){
            return carPosition.process();
        }
        return carPosition.getPosition();
    }

    private boolean isMoreThanFour(int randomNumber) {
        return randomNumber >= MAX_NO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return carPosition.getPosition() == car.carPosition.getPosition() && Objects.equals(carName.getName(), car.carName.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, carPosition);
    }

    public CarName getCarName() {
        return carName;
    }

    public CarPosition getCarPosition() {
        return carPosition;
    }
}
