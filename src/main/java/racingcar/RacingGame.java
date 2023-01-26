package racingcar;

import io.Print;
import io.UserInput;
import utils.RandomUtil;

public class RacingGame {

    public static final int RANDOM_NUMBER_BOUND = 10;

    private final Cars cars;
    private final int tryCount;

    public RacingGame() {
        cars = new Cars();
        tryCount = setting();
    }

    private int setting() {
        setCars();

        Print.tryCountInput();
        return UserInput.getCount();
    }

    private void setCars() {
        Print.carNamesInput();
        final String[] names = UserInput.getCarNames();

        for (String name : names) {
            cars.add(name);
        }
    }

    public void play() {
        Print.result();

        for (int i = 0; i < tryCount; i++) {
            final int size = cars.size();

            for (int j = 0; j < size; j++) {
                Print.playResult(cars.getCar(j));
                cars.checkNumberAndMove(j, RandomUtil.getNumber(RANDOM_NUMBER_BOUND));
            }

            System.out.println();
        }
    }

    public void result() {
        Print.gameResult(cars.getWinningCars());
    }
}
