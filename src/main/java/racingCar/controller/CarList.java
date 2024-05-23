package racingCar.controller;

import racingCar.domain.Car;
import racingCar.domain.CarName;
import racingCar.domain.Position;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CarList {

    public static final int BOUND = 4;
    private List<Car> cars;
    private Random random;
    public CarList(String names) {
        cars = Arrays.stream(names.split(","))
                .map(this::create)
                .collect(Collectors.toList());

        random = new Random();
    }

    private Car create(String name) {
        return new Car(name);
    }

    public Map<CarName, Position> move() {
        return cars.stream()
                .collect(Collectors.toMap(
                        Car::getCarName,
                        this::mapPosition
                ));
    }

    private Position mapPosition(Car car) {
        int randomNo = random.nextInt(BOUND) + 1;
        return car.move(randomNo);
    }

    public Map<CarName, Position> move(int randomNo) {
        return cars.stream()
                .collect(Collectors.toMap(
                    Car::getCarName,
                    car -> mapPosition(car, randomNo)
                ));
    }

    private Position mapPosition(Car car, int randomNo) {
        return car.move(randomNo);
    }

}
