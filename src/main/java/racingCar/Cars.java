package racingCar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> cars;

    public Cars(String input) {

        if (!ValidationUtils.hasComma(input)) {
            throw new IllegalArgumentException("입력 값에 쉼표(,) 기준으로 구분합니다.");
        }

        this.cars = Arrays.stream(input.split(","))
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public void play() {
        for (Car car : cars) {
            if (car.canMove()) {
                car.move();
            }
        }

        ResultView.printRoundResult(cars);
    }

    public List<Car> whoIsWinner(List<Car> cars) {
        int maxDistance = cars.stream()
                .mapToInt(Car::getMovedDistance)
                .max()
                .orElseThrow();

        return cars.stream()
                .filter(e -> e.getMovedDistance() == maxDistance)
                .collect(Collectors.toList());
    }

    public List<Car> getAllCarList() {
        return this.cars;
    }

}
