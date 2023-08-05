package RacingGame;

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
        System.out.println("시도할 회수는 몇회인가요?");
        int rounds = new Scanner(System.in).nextInt();
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
