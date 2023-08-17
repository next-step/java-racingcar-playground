package game;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    List<Car> cars;

    public Cars(String[] carNames) {
        validateCarNames(carNames);
        cars = Arrays.stream(carNames).map(Car::new).collect(Collectors.toList());
    }

    private void validateCarNames(String[] carNames) {
        if (carNames.length == 0) {
            throw new IllegalArgumentException();
        }
    }

    public RoundResult playRound() {
        RoundResult roundResult = new RoundResult();

        for (Car car : cars) {
            DriveResult driveResult = car.driveOrNot();
            roundResult.report(driveResult);
        }

        return roundResult;
    }
}
