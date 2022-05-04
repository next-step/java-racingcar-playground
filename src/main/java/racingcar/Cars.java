package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cars {
    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> findWinner() {
        int maxPosition = findMaxPosition();
        List<Car> winner = new ArrayList<>();
        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                winner.add(car);
            }
        }

        return winner;
    }

    private int findMaxPosition() {
        int maxPosition = 0;
        for (Car car : cars) {
            if (car.isLargeThanMaxPosition(maxPosition)) {
                maxPosition = car.getPosition();
            }
        }
        return maxPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars1 = (Cars) o;
        return Objects.equals(cars, cars1.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }
}
