package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Car> getWinningCarNames() {
        final int max = getMaxMove();

        return cars.stream()
                .filter(car -> car.getPosition() == max)
                .collect(Collectors.toList());
    }

    private int getMaxMove() {
        int max = 0;
        for (Car car : cars) {
            max = Math.max(max, car.getPosition());
        }

        return max;
    }
}
