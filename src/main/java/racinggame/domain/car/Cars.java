package racinggame.domain.car;

import racinggame.domain.car.Car;
import racinggame.domain.car.strategy.DrivableStrategy;
import racinggame.domain.dto.DriveResult;
import racinggame.domain.dto.RaceResult;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;

    public Cars(String[] carNames) {
        cars = Arrays.stream(carNames).map(Car::new).collect(Collectors.toList());
    }

    public RaceResult race(DrivableStrategy drivableStrategy) {
        List<DriveResult> driveResults = new ArrayList<>();
        for (Car car : cars) {
            DriveResult driveResult = car.drive(drivableStrategy);
            driveResults.add(driveResult);
        }
        return new RaceResult(driveResults);
    }
}
