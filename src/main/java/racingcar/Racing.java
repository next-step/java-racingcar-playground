package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Racing {

    private final List<Car> cars;

    public Racing() {
        this.cars = new ArrayList<>();
    }

    public void addCar(final String name) {
        cars.add(new Car(name));
    }

    public List<Car> getCars() {
        return cars;
    }

    public void checkNumberAndMove(final Car car, final int random) {
        if (random >= 4) {
            car.move();
        }
    }
}
