package RacingGame.Controller;

import RacingGame.DTO.Cars;
import RacingGame.domain.Car;
import RacingGame.view.InputView;
import RacingGame.view.ResultView;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameService {

    private int rounds;

    public Cars joinCar (String [] splitedCarNames) {
        Cars cars = Cars.getInstance();
        for(int index=0; index<splitedCarNames.length; index++) {
            Car car = new Car(splitedCarNames[index]);
            cars.joinCar(car);
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
            moveCars(cars, random);
            view.printRoundResult(cars);
        }
        System.out.println();
        view.printWinner(cars);
    }

    private static void moveCars(Cars cars, Random random) {
        for (int index = 0; index < cars.getJoinedCar().size(); index++) {
            ArrayList<Car> joinedCars = cars.getJoinedCar();
            Car joinedCar = joinedCars.get(index);
            joinedCar.go(random.nextInt());
        }
    }
}
