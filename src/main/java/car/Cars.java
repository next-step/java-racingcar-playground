package car;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;
    private final Random random = new Random(); // reusable
    public Cars(String carNames) {
        this.cars = initCarByNames(carNames);
    }

    private List<Car> initCarByNames(String carNames) {
        return Arrays.stream(carNames.split(","))
                .map(String::trim)
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public List<String> getCarNames() {
        return cars.stream().map(Car::getName).collect(Collectors.toList());
    }

    public void moveForTest(int digit){
        cars.forEach(car -> car.moveByStrategy(digit, value -> value >= 5));
    }

    public void move(){
        cars.forEach(car -> car.moveByStrategy(random.nextInt(10), value -> value >= 5));
    }

    public int getLocationByCarName(String carName) {
        return cars.stream().filter(car -> car.getName().equals(carName)).map(Car::getLocation).findFirst().orElseThrow(
                () -> new IllegalArgumentException("그런 차는 없다")
        );
    }

    public List<String> getWinnersNames() {
        int maxLocation = cars.stream().mapToInt(Car::getLocation).max().orElse(0);
        return cars.stream().filter(car -> car.getLocation() == maxLocation).map(Car::getName).collect(Collectors.toList());
    }
}