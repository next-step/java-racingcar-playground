package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Cars {
    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void start() {
        for (Car car : cars) {
            car.forward(getRandomNumber());
        }
    }

    private int getRandomNumber() {
        return new Random().nextInt(10);
    }

    public List<Car> findWinners() {
        Position maxPosition = findMaxPosition();
        List<Car> winner = new ArrayList<>();
        for (Car car : cars) {
            if (car.isWinner(maxPosition)) {
                winner.add(car);
            }
        }

        return winner;
    }

    private Position findMaxPosition() {
        Position position = new Position();
        for (Car car : cars) {
            position = car.getMaxPosition(position);
        }

        return position;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.toString()).append("\n");
        }

        return sb.toString();
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
