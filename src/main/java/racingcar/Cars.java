package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars() {
        this.cars = new ArrayList<>();
    }

    public void add(final String name) {
        cars.add(new Car(name));
    }

    public int size() {
        return cars.size();
    }

    public List<Car> getCars() {
        return cars;
    }

    public void checkNumberAndMove(final int idx, final int random) {
        if (random >= 4) {
            getCar(idx).move();
        }
    }

    public Car getCar(int idx) {
        return cars.get(idx);
    }
}
