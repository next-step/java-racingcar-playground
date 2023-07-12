package study.racingcar;

import java.util.ArrayList;
import java.util.List;

public class EventOrganizer {

    public List<Car> generateCar(String carNames) {
        String[] cars = carNames.split(",");
        List<Car> participatingCars = new ArrayList<>();
        for (String car : cars) {
            participatingCars.add(new Car(car, 0));
        }
        return participatingCars;

    }
}
