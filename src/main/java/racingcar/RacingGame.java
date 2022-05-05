package racingcar;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RacingGame {
    private Cars cars;
    private int gameCount;

    public RacingGame(String input, int gameCount) {
        String[] carNames = input.split(",");
        List<Car> cars = Arrays.stream(carNames)
                .map(name -> new Car(name))
                .collect(Collectors.toList());
        this.cars = new Cars(cars);
        this.gameCount = gameCount;
    }

    public void start(ResultView resultView) {
        resultView.start();
        for (int i = 0; i < gameCount; i++) {
            cars.start();
            resultView.printState(cars);
        }

        resultView.end(cars.findWinners());
    }

    public List<Car> getCars() {
        return cars.getCars();
    }
}
