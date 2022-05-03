package racingcar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RacingGame {
    private List<Car> cars;

    public RacingGame(String input) {
        String[] carNames = input.split(",");
        this.cars = Arrays.stream(carNames)
                .map(name -> new Car(name))
                .collect(Collectors.toList());
    }

    public List<Car> getCars() {
        return cars;
    }
}
