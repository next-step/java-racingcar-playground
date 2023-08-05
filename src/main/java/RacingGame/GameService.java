package RacingGame;

import java.util.Random;

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

    public void playRound(Cars cars) {
        Random random = new Random();
        ResultView view = new ResultView();
        for (int round=1; round <= rounds; round++) {
            for (int index=0; index < cars.getJoinedCar().size(); index++) {
                cars.getJoinedCar().get(index).go(random.nextInt());
            }
            view.printRoundResult(cars);
        }
        view.printWinner(cars);
    }
}
