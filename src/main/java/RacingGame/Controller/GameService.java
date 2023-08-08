package RacingGame.Controller;

import RacingGame.DTO.Cars;
import RacingGame.domain.Car;
import RacingGame.view.InputView;
import RacingGame.view.ResultView;

import java.util.Random;
import java.util.Scanner;

public class GameService {

    private int rounds;

    public Cars joinCar (String [] splitedCarNames) {
        Cars cars = Cars.getInstance();
        for(int index=0; index<splitedCarNames.length; index++) {
            Car car = new Car(splitedCarNames[index]);
            cars.setJoinedCar(car);
        }
        return cars;
    }

    public void inputRounds() {
        InputView inputView = new InputView();
        int rounds = inputView.requestGameCount();
        this.rounds = rounds;
    }
    public void playRound(Cars cars) {
        Random random = new Random();
        ResultView view = new ResultView();
        for (int round=1; round <= rounds; round++) {
            System.out.println();
            for (int index=0; index < cars.getJoinedCar().size(); index++) {
                cars.getJoinedCar().get(index).go(random.nextInt());
            }
            view.printRoundResult(cars);
        }
        System.out.println();
        view.printWinner(cars);
    }
}
