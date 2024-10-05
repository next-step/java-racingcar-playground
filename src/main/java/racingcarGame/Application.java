package racingcarGame;

import racingcarGame.domain.Car;
import racingcarGame.domain.Cars;
import racingcarGame.domain.Race;
import racingcarGame.views.InputView;
import racingcarGame.views.ResultView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static racingcarGame.utils.SplitNames.splitName;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = InputView.name(scanner);
        int times = InputView.number(scanner);

        UserInput userInput = new UserInput(input, times);

        String[] carNames = splitName(input);
        List<Car> carList = new ArrayList<>();

        for (String carName : carNames) {
            Car car = new Car(carName);
            carList.add(car);
        }

        Cars cars = new Cars(carList);
        Race race = new Race(cars);

        ResultView.result();

        for (int i = 0; i < userInput.getTimes(); i++) {
            race.race();
            ResultView.racingResult(cars);
            System.out.println();
        }

        int farLocation = race.farLocation();
        Cars winner = race.winner(farLocation);
        ResultView.winner(winner);
    }
}
